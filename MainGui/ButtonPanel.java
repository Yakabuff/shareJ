package MainGui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	BoxLayout boxlayout;
	GridLayout gridlayout;
	JPanel parentpane;
	public ButtonPanel() {
		super();

		gridlayout = new GridLayout(18,1);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setLayout(gridlayout);
		//THIS IS TEMPORARY. FOR TESTING. 
//		JButton test = new JButton("Capture");
//		JButton test2 = new JButton("Upload");
//		JButton test3 = new JButton("Workflow");
//		JButton test4 = new JButton("Tools");
//		JButton test5 = new JButton("After Capture");
//		JButton test6 = new JButton("After upload");
//		JButton test7 = new JButton("Destinations");
//		JButton test8 = new JButton("TaskSettings");
//		JButton test9 = new JButton("Application settings");
//		JButton test10 = new JButton("Hot Key settings");
//		JButton test11 = new JButton("Screenshots folder");
//		JButton test12 = new JButton("History");
//		JButton test13 = new JButton("Image history");
//		JButton test14 = new JButton("News");
//		JButton test15 = new JButton("Debug");
//		JButton test16 = new JButton("Donate");
//		JButton test17 = new JButton("About");
//		this.add(test);
//		this.add(test2);
//		this.add(test3);
//		this.add(test4);
//		this.add(test5);
//		this.add(test6);
//		this.add(test7);
//		this.add(test8);
//		this.add(test9);
//		this.add(test10);
//		this.add(test11);
//		this.add(test12);
//		this.add(test13);
//		this.add(test14);
//		this.add(test15);
//		this.add(test16);
//		this.add(test17);

		Set<String> buttons = ButtonManager.buttons.keySet();

		for(String k:buttons){
			this.add(ButtonManager.buttons.get(k));
		}
	}
	
}
