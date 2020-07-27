package JMenuItemListener;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

import Screenshot.Screenshot;
import Screenshot.ScreenshotSelection;
import shareJ.Window;

public class CaptureSelection implements ActionListener {
	
	ScreenshotSelection sc;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if("Capture Selection".equals(e.getActionCommand())) {

			sc = new ScreenshotSelection();
			sc.exec();
			
		}


	}
}
