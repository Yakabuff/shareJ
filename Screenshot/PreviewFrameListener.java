package Screenshot;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.ImageTranscoder;
import javax.swing.JPanel;

public class PreviewFrameListener extends MouseAdapter implements KeyListener, MouseMotionListener, ClipboardOwner {
	
	PreviewFrame pf;
	static Point clickPoint;
	static Point endPoint;
	Rectangle selectionBounds;
	PreviewPanel pp;
	
	public PreviewFrameListener(PreviewFrame arg0, PreviewPanel arg1) {
		pf = arg0;
		pp = arg1;
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyChar());
		if(arg0.getKeyCode()== KeyEvent.VK_ESCAPE) {
			pf.dispose();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub   
      pp.selection = new Rectangle(arg0.getPoint());
      pp.repaint();
		


	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
    	pp.partialImage = pp.robot.createScreenCapture(pp.selection);
    	try {
			ImageIO.write(pp.partialImage, "png", new File("test"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	pf.dispose();
		
    	try {
			ImageIO.write(pp.partialImage, Screenshot.format, new File(Screenshot.filename()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        ImageTransferable trans = new ImageTransferable(pp.partialImage);
        
        Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
        c.setContents( trans, this );
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
      Point p = e.getPoint();
      int width = Math.max(pp.selection.x - e.getX(), e.getX() - pp.selection.x);
      int height = Math.max(pp.selection.y - e.getY(), e.getY() - pp.selection.y);
      pp.selection.setSize(width, height);
      pp.repaint();

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lostOwnership(Clipboard arg0, Transferable arg1) {
		// TODO Auto-generated method stub
		
	}



}
