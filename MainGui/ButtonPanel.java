package MainGui;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	BoxLayout boxlayout;
	JPanel parentpane;
	public ButtonPanel() {
		super();

		boxlayout = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(boxlayout);

		JButton test = new JButton("Screenshot");
		JButton test2 = new JButton("Keybind");

		this.add(test);
		this.add(test2);
	}
	
}
