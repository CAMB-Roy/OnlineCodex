package oc;

import javax.swing.*;

import static oc.RefreshListener.Priority.EINTRAG;
import static oc.RefreshListener.addRefreshListener;


public abstract class Sonstige extends OptionsCollection implements BuildaSTK {


    protected String titel = "";

    public Sonstige() {
        panel.setBorder(blackBorder);
        panel.setLayout(null);

        addRefreshListener(EINTRAG, () -> {
            refreshen();
            panel.setSize(getBreite(), getHöhe());
        });
    }

    @Override
    public JPanel getPanel() {
        return this.panel;
    }

    public String getText() {
        StringBuilder text = new StringBuilder();

        text.append(titel);

        int cnt = 0;

        for (int i = 0; i < optionen.size(); ++i) {
            if (optionen.elementAt(i).isSelected()) {
                text.append(optionen.elementAt(i).getText());
                cnt++;
            }
        }

        text.append(BuildaHQ.abstand);

        return cnt > 0 ? text.toString() : "";
    }

    public abstract void refreshen();

    public int getBreite() {
        return auswahlBreite + randAbstand;
    }

    public void complete() {
        panel.setSize(getBreite(), getHöhe());
        refreshen();
    }

}