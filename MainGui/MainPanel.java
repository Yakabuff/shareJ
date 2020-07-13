package MainGui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import Screenshot.PreviewPanel;

public class MainPanel extends JPanel{
//	BoxLayout mainLayout = new BoxLayout(this,BoxLayout.LINE_AXIS);
	BorderLayout mainLayout = new BorderLayout(); 
	public MainPanel(){

		this.setLayout(mainLayout);

		ButtonPanel bp = new ButtonPanel();
		this.add(bp, BorderLayout.WEST);
		HistorySplitScreen hss = new HistorySplitScreen(JSplitPane.HORIZONTAL_SPLIT);
		this.add(hss, BorderLayout.CENTER);
	}
}
