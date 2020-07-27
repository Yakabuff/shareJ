package Tray;

import java.awt.AWTException;
import java.awt.SystemTray;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

import shareJ.ShareJFrame;

public class MainWindowStateListener implements WindowStateListener {
	SystemTray tray;
	JFrame frame;
	public MainWindowStateListener(SystemTray t, JFrame j) {
		this.tray = t;
		this.frame = j;
	}

	@Override
	public void windowStateChanged(WindowEvent e) {
		if(e.getNewState()==frame.ICONIFIED){
			try {
				tray.add(ShareJFrame.trayIcon);
				frame.setVisible(false);
				System.out.println("added to SystemTray");
			} catch (AWTException ex) {
				System.out.println("unable to add to tray");
			}
		}
//		if(e.getNewState()==7){
//			try{
//				tray.add(ShareJFrame.trayIcon);
//				frame.setVisible(false);
//				System.out.println("added to SystemTray");
//			}catch(AWTException ex){
//				System.out.println("unable to add to system tray");
//			}
//		}
		if(e.getNewState()==frame.MAXIMIZED_BOTH){
			tray.remove(ShareJFrame.trayIcon);
			frame.setVisible(true);
			System.out.println("Tray icon removed");
		}
		if(e.getNewState()==frame.NORMAL){
			tray.remove(ShareJFrame.trayIcon);
			frame.setVisible(true);
			System.out.println("Tray icon removed");
		}

	}

}
