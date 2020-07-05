package Tray;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.JFrame;

public class OpenListener implements ActionListener {
	JFrame f;
	public OpenListener(JFrame frame){
		this.f = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        f.setVisible(true);
        f.setExtendedState(JFrame.NORMAL);

	}

}
