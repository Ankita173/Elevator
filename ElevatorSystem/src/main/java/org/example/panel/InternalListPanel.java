package org.example.panel;

import org.example.panel.button.FirstFloorButton;
import org.example.panel.button.GroundFloorButton;
import org.example.panel.button.SecondFloorButton;

public class InternalListPanel implements LiftPanel {
    public InternalListPanel() {
        this.buttons.add(new GroundFloorButton());
        this.buttons.add(new FirstFloorButton());
        this.buttons.add(new SecondFloorButton());
    }
}
