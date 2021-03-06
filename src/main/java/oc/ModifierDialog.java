package oc;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;


public abstract class ModifierDialog extends JDialog implements BuildaSTK {


    private static final long serialVersionUID = 1L;
    Vector<JCheckBox> optionen = new Vector<JCheckBox>();


    public ModifierDialog() {


        this.setLayout(null);

        this.getContentPane().setBackground(Color.WHITE);


    }


    public boolean get(String s) {

        for (int i = 0; i < optionen.size(); ++i) {

            if (optionen.elementAt(i).getText().equals(s)) {

                return optionen.elementAt(i).isSelected();
            }
        }

        return false;

    }


    public abstract void aktualisieren();

}