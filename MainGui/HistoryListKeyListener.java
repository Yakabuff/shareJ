package MainGui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class HistoryListKeyListener extends KeyAdapter implements KeyListener {

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
	
}
