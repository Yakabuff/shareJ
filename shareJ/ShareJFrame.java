package shareJ;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import MainGui.MainPanel;
import Tray.ExitListener;
import Tray.MainWindowStateListener;
import Tray.OpenListener;
import Tray.ssfullListener;
import Tray.ssselectionListener;

public class ShareJFrame extends JFrame {
    public static TrayIcon trayIcon;
    SystemTray tray;
    
    public ShareJFrame() {
    	super("ShareJ");
    	init();
    	initTray();
    }
    void init() {
    	this.setMinimumSize(new Dimension(900, 500));
    	MainPanel mp = new MainPanel();
    	this.add(mp);

    	
    }
    
    void initTray() {
    	try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	tray=SystemTray.getSystemTray();
    	Image image=Toolkit.getDefaultToolkit().getImage("Hips.png");
    	PopupMenu popup=new PopupMenu();
    	MenuItem exit =new MenuItem("Exit");
    	popup.add(exit);
    	
        exit.addActionListener(new ExitListener());
        
        MenuItem open = new MenuItem("Open");
        popup.add(open);
        
        open.addActionListener(new OpenListener(this));
        
        MenuItem screenshotSelection = new MenuItem("Capture Selection");
        MenuItem screenshotFullscreen = new MenuItem("Capture Fullscreen");
        screenshotSelection.addActionListener(new ssselectionListener());
        screenshotFullscreen.addActionListener(new ssfullListener());
        popup.add(screenshotFullscreen);
        popup.add(screenshotSelection);
        trayIcon=new TrayIcon(image, "SystemTray Demo", popup);
        trayIcon.setImageAutoSize(true);
        
        this.addWindowStateListener(new MainWindowStateListener(tray, this));
        
        setIconImage(Toolkit.getDefaultToolkit().getImage("Hips.png"));
    }
    
}
