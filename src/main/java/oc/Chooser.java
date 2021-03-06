package oc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Vector;

import static oc.RefreshListener.Priority.CHOOSER;
import static oc.RefreshListener.addRefreshListener;

public class Chooser extends BuildaPanel implements ActionListener, BuildaSTK {

    private static final Logger LOGGER = LoggerFactory.getLogger(Chooser.class);

    private static ListCellRenderer defaultRenderer = new JComboBox().getRenderer(); // mein eigener Renderer "überschreibt" sozusagen den default renderer, indem er seine Methode aufruft und das reurnte verändert. Dafür muss ich diesen aber einmal haben
    BuildaVater buildaVater;
    boolean aktualisierungIgnorieren = false;
    private JComboBox myComboBox = new JComboBox();
    private JButton cloneButton = new JButton(BuildaHQ.translate("Clonen"));
    private String reflectionKennung;
    private Object[] statischeEinträge;
    private Vector<String> spezialEinträge;
    ListCellRenderer renderer = new ListCellRenderer() {

        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            Component c = defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);


            for (int i = 0; i < statischeEinträge.length; ++i) {
                if (statischeEinträge[i].equals(value)) {
                    c.setForeground(new Color(0, 0, 0));
                    break;
                }
            }

            for (int i = 0; i < spezialEinträge.size(); ++i) {
                if (spezialEinträge.get(i).equals((String) value)) {
                    c.setForeground(new Color(30, 205, 0));
                    break;
                }
            }

            return c;
        }
    };
    private int kategorie;
    private boolean useActionPerformed = true;
    private Eintrag myEintrag = null;// = new LeererEintrag(0,0);
    private HashMap<String, String> multipleArmyClasses = new HashMap<String, String>();

    public Chooser(BuildaVater bv, int lX, int lY, String reflectionKennung, Object[] alleEinträge, int kategorie, ActionListener cloneListener) {  // ACHTUNG: wenn mehr oder weniger als 2 Hauptsachen zum panel geaddet werden, muss aktuellenEintragLöschen geändert werden! weil dann der index falsch ist, an dem irgendwas ins panel geaddet ist.
        this.buildaVater = bv;
        this.kategorie = kategorie;
        this.panel.setLocation(lX, lY);
        this.reflectionKennung = reflectionKennung;

        myComboBox = new JComboBox(alleEinträge);

        myComboBox.setBounds(0, 0, auswahlBreite - 60, 20);
        myComboBox.addActionListener(this);
        myComboBox.setFocusable(false); // sie hat nie den Focus und wird deshalb nie durch die Pfeil-Unten-Taste geöffnet
        BuildaHQ.newGUIComponent(myComboBox);
        myComboBox.setBackground(Color.WHITE);
        myComboBox.setMaximumRowCount((BILDSCHIRMHÖHE - 150) / 20);
        myComboBox.setEditable(false);
        myComboBox.setRenderer(renderer);
        myComboBox.putClientProperty("JComboBox.isTableCellEditor", Boolean.TRUE);

        panel.add(myComboBox);

        cloneButton.setBounds(auswahlBreite - 55, 0, 65, 20);
        cloneButton.addActionListener(cloneListener);

        BuildaHQ.newGUIComponent(cloneButton);

        cloneButton.setBorder(BuildaHQ.createBorder(new Color(134, 201, 218)));
        cloneButton.setFont(new Font("tahoma", Font.PLAIN, 12));
        cloneButton.setToolTipText("Clont diesen Eintrag mit all seinen Einstellungen und Rüstkammern.");
        panel.add(cloneButton);

        sizeSetzen();

        cloneButton.repaint();
        panel.repaint();

        addRefreshListener(CHOOSER, this::sizeSetzen);
    }

    public int getKategorie() {
        return this.kategorie;
    }

    public Eintrag getEintrag() {
        return this.myEintrag;
    }

    public JButton getCloneButton() {
        return cloneButton;
    }

    public JComboBox getComboBox() {
        return this.myComboBox;
    }

    public double getKosten() {
        try {
            return ((Eintrag) myEintrag).getKosten();
        } catch (Exception e) {
            return 0;
        }
    }

    public Chooser setStatischeEinträge(Object[] sE) {
        this.statischeEinträge = sE;
        return this;
    }

    public Chooser setSpezialEinträge(Vector<String> sE) {
        this.spezialEinträge = sE;
        return this;
    }

    public void sizeSetzen() {
        int x = myComboBox.getSize().width;
        int y = myComboBox.getSize().height;

        if (myEintrag != null) {
            x = BuildaHQ.wasIstHoeher(x, myEintrag.getBreite());
            y = myEintrag.getHöhe();

            x += myEintrag.getPanel().getLocation().getX();
            y += myEintrag.getPanel().getLocation().getY();
        }

        panel.setSize(x, y + randAbstand);
    }

    public void setAuswahlen(Vector v) {
        useActionPerformed = false;
        String currentSelected = selectedEntry();

        myComboBox.removeAllItems();
        for (int i = 0; i < v.size(); i++) {
            myComboBox.addItem(v.elementAt(i));
        }

        myComboBox.setSelectedItem(currentSelected);

        if (!selectedEntry().equals(currentSelected)) {
            myEintrag.deleteYourself();
        }

        useActionPerformed = true;
    }

    public void erstelleEintrag(String name) {
        String umgeformterName = BuildaHQ.formZuKlassenName(name);
        if (umgeformterName.equals("")) {
            erstelleLeerenEintrag();
        } else {
            String finalClassName = "";
            try {
                // Determine whether to use a WHFB or a Wh40k Army-Class
                String armyPackage = OnlineCodex.ARMY_PACKAGE;

                // Check if the requested class is used by multiple armies
                if (this.multipleArmyClasses.containsKey(name)) {
                    finalClassName = this.multipleArmyClasses.get(name);
                } else {
                    finalClassName = reflectionKennung + umgeformterName;
                }
                finalClassName = finalClassName.replaceAll("\\[[\\w ]{1,}\\]", ""); // Remove "Forgeworld" label from class name

                try {
                    Class myClass = Class.forName(armyPackage + "units." + finalClassName);

                    aktuellenEintragLöschen(); // wird auch in erstelleLeerenEintrag() aufgerufen...

                    myEintrag = (Eintrag) (myClass.newInstance());
                } catch (Exception e) {

                    try {
                        if (reflectionKennung == "") {
                            Class myClass = Class.forName(armyPackage + "units." + umgeformterName.substring(0, 2).toLowerCase() + "." + finalClassName);

                            aktuellenEintragLöschen(); // wird auch in erstelleLeerenEintrag() aufgerufen...

                            myEintrag = (Eintrag) (myClass.newInstance());
                        } else {
                            Class myClass = Class.forName(armyPackage + "units." + reflectionKennung.toLowerCase() + "." + finalClassName);

                            aktuellenEintragLöschen(); // wird auch in erstelleLeerenEintrag() aufgerufen...

                            myEintrag = (Eintrag) (myClass.newInstance());
                        }

                    } catch (Exception ex) {
                        if (reflectionKennung == "") { //Fall für Einheiten in APO
                            Class myClass = Class.forName(armyPackage + "units." + umgeformterName.substring(0, 3).toLowerCase() + "." + finalClassName);

                            aktuellenEintragLöschen(); // wird auch in erstelleLeerenEintrag() aufgerufen...

                            myEintrag = (Eintrag) (myClass.newInstance());
                        } else {
                            Class myClass = Class.forName(armyPackage + "units." + umgeformterName);

                            aktuellenEintragLöschen(); // wird auch in erstelleLeerenEintrag() aufgerufen...

                            myEintrag = (Eintrag) (myClass.newInstance());
                        }

                    }
                }

                if (umgeformterName.startsWith("Requiriert")) {
                    myEintrag.setName(name);
                }

                myEintrag.getPanel().setLocation(0, 30);
                myEintrag.setKategorie(kategorie);
                myEintrag.setBuildaVater(buildaVater);
                panel.add(myEintrag.getPanel());
            } catch (ClassNotFoundException e) {
                OnlineCodex.getInstance().fehler("Klasse \"" + finalClassName + "\" nicht gefunden.\nBitte melden!!");
                erstelleLeerenEintrag();
            } catch (ClassCastException | InstantiationException | IllegalAccessException e) {
                LOGGER.error("Error while loading class", e);
            }
        }

        RefreshListener.fireRefresh();
        cloneButton.setVisible(!(myEintrag instanceof LeererEintrag));
    }

    String selectedEntry() {
        return ((String) (myComboBox.getSelectedObjects()[0]));
    }

    public void actionPerformed(ActionEvent event) {
        if (useActionPerformed) {
            erstelleEintrag(selectedEntry());
        }
    }

    void aktuellenEintragLöschen() {
        if (myEintrag != null) {
            myEintrag.deleteYourself();
            RefreshListener.remove(myEintrag.getID());
            myEintrag = null;
            try {
                panel.remove(2);
            } catch (Exception e) {
                LOGGER.error("", e);
            }
        }
    }

    private void erstelleLeerenEintrag() {
        aktuellenEintragLöschen();
        myEintrag = new LeererEintrag(0, 0);
        myEintrag.getPanel().setLocation(0, 30);
        panel.add(myEintrag.getPanel());
    }

    public String getText() {
        try {
            return myEintrag.getText();
        } catch (Exception e) {
            return "";
        }
    }

    public String getSaveText(String trenner) {
        //LOGGER.info("Chooser-getSaveText");
        try {
            return myEintrag.getSaveText(trenner);
        } catch (Exception e) {
            return "";
        }
    }

    public Element getSaveElement() {
        //LOGGER.info("Chooser-getSaveElement");
        if (getComboBox().getSelectedObjects()[0].toString().trim().equals("")) return null;

        Element root = myEintrag.getSaveElement();
        root.setAttribute("selection", getComboBox().getSelectedObjects()[0].toString());

//    	Element root = BuildaHQ.getNewXMLElement("Eintrag");
//    	root.setAttribute("selection", getComboBox().getSelectedObjects()[0].toString());
//
//    	root.appendChild(myEintrag.getSaveElement());

        return root;
    }

    public void load(String s, String s2) {
        //LOGGER.info("Chooser-load");
        myEintrag.load(s, s2);
    }

    public void loadElement(Element e) {
        //LOGGER.info("Chooser-loadElement");
        myEintrag.loadElement(e);
    }

    public void selectEntry(String s) {//Feste Auswahl für eine Formation
        myComboBox.setSelectedItem(s);
        myComboBox.setEnabled(false);
        cloneButton.setEnabled(false);
    }

    public void selectEntryNotLocked(String s) {//Tauschbare Auswahl für eine Formation
        myComboBox.setSelectedItem(s);
    }

    public void removeEmptyEntry() {//Entfernt den leeren Eintrag am Anfang, damit die Einheit nicht abgewählt werden kann
        myComboBox.remove(0);
    }

    public void changeEntries(String[] units) { //Tauscht den Inhalt der Combobox aus
        //LOGGER.info("Chooser-setAuswahlen");
        useActionPerformed = false;

        // leeren und neufüllen der Liste
        myComboBox.removeAllItems();
        for (int i = 0; i < units.length; i++) {
            myComboBox.addItem(units[i]);
        }

        useActionPerformed = true;

        myComboBox.setSelectedItem(units[0]);
    }

    public void setReflectionKennung(String s) {
        reflectionKennung = s;
    }

}
