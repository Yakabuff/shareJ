package Tray;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Screenshot.ScreenshotSelection;

public class ssselectionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		ScreenshotSelection ss = new ScreenshotSelection();
		ss.exec();
	}

}
