package shareJ;

import java.awt.GridLayout;


import javax.swing.*;
import JMenuItemListener.About;
import JMenuItemListener.CaptureFullScreen;
import JMenuItemListener.CaptureSelection;


public class Window{  

	public static ShareJFrame f;
	public void init() {  
		f=new ShareJFrame();//creating instance of JFrame  
		
		f.setTitle(shareJ.NAME + " "+ shareJ.VERSION);
		f.setLayout(new GridLayout(0,1));
		
		f.setSize(400,500);//400 width and 500 height  
		createMenuBar();
		

		
		f.setVisible(true);//making the frame visible  
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}  
	
	public void createMenuBar() {
		JMenuBar jmb = new JMenuBar();
		f.setJMenuBar(jmb);
		JMenu file = new JMenu("File");
		JMenu help = new JMenu("Help");
		jmb.add(file);
		jmb.add(help);
		JMenuItem about = new JMenuItem("About");
		JMenuItem capturefs = new JMenuItem("Capture FullScreen");
		JMenuItem captureSelection = new JMenuItem("Capture Selection");
		help.add(about);
		file.add(capturefs);
		file.add(captureSelection);
		about.addActionListener(new About());
		capturefs.addActionListener(new CaptureFullScreen());
		captureSelection.addActionListener(new CaptureSelection());

		
	}
	
	public Window() {
		init();
	}
	
	public static JFrame getWindow() {
		return f;
	}


}  