package Tray;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Screenshot.ScreenshotFullscreen;

public class ssfullListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ScreenshotFullscreen sf = new ScreenshotFullscreen();
		sf.exec();

	}

}
