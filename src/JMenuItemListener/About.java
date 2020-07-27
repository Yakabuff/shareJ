package JMenuItemListener;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import shareJ.Window;

public class About implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if("About".equals(e.getActionCommand())) {
			JDialog a = new JDialog(Window.getWindow(), "About ShareJ", true);
			a.setLayout(new GridLayout(0, 1));
			a.setSize(300, 300);
			JLabel label = new JLabel("ShareJ");
			JLabel label2 = new JLabel("version 0.0.1");
			JLabel label3 = new JLabel("Author: yakabuff");
			a.add(label);
			a.add(label2);
			a.add(label3);
			a.setVisible(true);
			

			
		}


	}

}
