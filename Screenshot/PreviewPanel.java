package Screenshot;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class PreviewPanel extends JPanel{
	
	BufferedImage screenFullImage;
	Robot robot;
	Rectangle selection;
	PreviewFrame parentFrame;
	BufferedImage partialImage;
	
	public PreviewPanel(PreviewFrame pf) {
		parentFrame = pf;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		screenFullImage = robot.createScreenCapture(screenRect);
		
		
//        MouseAdapter handler = new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent e) {
//                selection = new Rectangle(e.getPoint());
//                repaint();
//            }
//
//            @Override
//            public void mouseDragged(MouseEvent e) {
//                Point p = e.getPoint();
//                int width = Math.max(selection.x - e.getX(), e.getX() - selection.x);
//                int height = Math.max(selection.y - e.getY(), e.getY() - selection.y);
//                selection.setSize(width, height);
//                repaint();
//            }
//            @Override
//            public void mouseReleased(MouseEvent e) {
//            	partialImage = robot.createScreenCapture(selection);
//            	try {
//					ImageIO.write(partialImage, "png", new File("test"));
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//            	pf.dispose();
//            }
//        };
//        addMouseListener(handler);
//        addMouseMotionListener(handler);
        addMouseListener(new PreviewFrameListener(pf,this));
        addMouseMotionListener(new PreviewFrameListener(pf,this));
//        addKeyListener(new PreviewFrameListener(pf,this));
	}
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        if (screenFullImage != null) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.drawImage(screenFullImage, 0, 0, this);
            if (selection != null) {
                g2d.setColor(new Color(225, 225, 255, 0));
                g2d.fill(selection);
                g2d.setColor(Color.GRAY);
                g2d.draw(selection);
            }
            g2d.dispose();
        }
    }
}
