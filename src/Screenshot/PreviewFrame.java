package Screenshot;

import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class PreviewFrame extends JFrame{
	
Robot robot;
	
	public PreviewFrame() throws HeadlessException {
		super();
		

		//set size of preview frame
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int width = dim.width;
		int height = dim.height;
		this.setSize(width, height);
		
		//make a panel in the frame
		PreviewPanel previewPanel = new PreviewPanel(this);
		this.add(previewPanel);

//		//add listeners
		this.addKeyListener(new PreviewFrameListener(this,previewPanel));
		this.addMouseListener(new PreviewFrameListener(this, previewPanel));
		this.addMouseMotionListener(new PreviewFrameListener(this, previewPanel));
		
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setUndecorated(true);	
		
	}

	public PreviewFrame(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public PreviewFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public PreviewFrame(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}


	public BufferedImage getSelection() {
		return null;
	}

	

}
