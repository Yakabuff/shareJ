package Screenshot;

import java.awt.Graphics;

import javax.swing.JPanel;

public class SelectionPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(5, 5, 105, 105);
    }
}
