package MainGui;

import java.awt.Dimension;

import javax.swing.JSplitPane;

import org.sqlite.Function.Window;

public class HistorySplitScreen extends JSplitPane {
	
	public static RecentScreenshotPanel rsp;
	public static RecentScreenshotPreviewPanel rspp;
	
	public HistorySplitScreen(int horizontalSplit) {
		super(horizontalSplit);
		
		init();
	}
	
	void init() {
		rsp = new RecentScreenshotPanel();
		this.setLeftComponent(rsp);
		rspp = new RecentScreenshotPreviewPanel("/home/jon/eclipse-workspace/shareJ/src/shareJ/Hips.png");
		this.setRightComponent(rspp);
		this.setOneTouchExpandable(true);
		
	
	    rsp.setMinimumSize( new Dimension(200 , this.getHeight()));
	    rsp.setMaximumSize(new Dimension(1000 , this.getHeight()));
	    rspp.setMinimumSize( new Dimension(300 , this.getHeight()));
	    
	    this.setDividerLocation(300);
	    this.setDividerSize(10);
	}
}
