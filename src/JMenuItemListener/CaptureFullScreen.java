package JMenuItemListener;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Screenshot.ScreenshotFullscreen;

public class CaptureFullScreen implements ActionListener {
	
	ScreenshotFullscreen sc;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if("Capture FullScreen".equals(e.getActionCommand())) {

			sc = new ScreenshotFullscreen();
			sc.exec();
			
		}


	}
}
