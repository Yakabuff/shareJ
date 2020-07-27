package MainGui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class HistoryListListener implements KeyListener, MouseListener {

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_UP ) {
			if(RecentScreenshotPanel.list.getSelectedIndex()<= RecentScreenshotPanel.listModel.getSize()-1) {
				System.out.println(RecentScreenshotPanel.list.getSelectedIndex());
				String path = RecentScreenshotPanel.listModel.get(RecentScreenshotPanel.list.getSelectedIndex()).toString();
				System.out.println(path);
				HistorySplitScreen.rspp.updatePanel(path);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		String path = RecentScreenshotPanel.listModel.get(RecentScreenshotPanel.list.getSelectedIndex()).toString();
		System.out.println(path);
		HistorySplitScreen.rspp.updatePanel(path);
		
	}
	
}
