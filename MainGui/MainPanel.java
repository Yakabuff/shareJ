package MainGui;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import Screenshot.PreviewPanel;

public class MainPanel extends JPanel{
	BoxLayout mainLayout = new BoxLayout(this,BoxLayout.LINE_AXIS);

	public MainPanel(){
		super();
		this.setLayout(mainLayout);

		ButtonPanel bp = new ButtonPanel();
		this.add(bp);
//		RecentScreenshotPanel rsp = new RecentScreenshotPanel();
//		this.add(rsp);
//		RecentScreenshotPreviewPanel rspp = new RecentScreenshotPreviewPanel("/home/jon/eclipse-workspace/shareJ/src/shareJ/Hips.png");
//		this.add(rspp);
		HistorySplitScreen hss = new HistorySplitScreen(JSplitPane.HORIZONTAL_SPLIT);
		this.add(hss);
	}
}
