package org.example.panel;

import org.example.panel.button.DownButton;
import org.example.panel.button.UpButton;
public class ExternalListPanel implements LiftPanel {
    public ExternalListPanel() {
        this.buttons.add(new UpButton());
        this.buttons.add(new DownButton());
    }
}
