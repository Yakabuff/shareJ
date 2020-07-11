package MainGui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RecentScreenshotPreviewPanel extends JPanel {
	
	BufferedImage preview;
	BoxLayout boxlayout;
	String path;
	
	public RecentScreenshotPreviewPanel(String path) {

		this.path = path;

		
		boxlayout = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(boxlayout);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
//		this.setMinimumSize(new Dimension(9000,1000));
//		this.setMaximumSize(new Dimension(600,600));
		
		try {
			preview = ImageIO.read(new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        g.drawImage(preview, 0, 0, this.getWidth(), this.getHeight(), this);
        
    }
}
