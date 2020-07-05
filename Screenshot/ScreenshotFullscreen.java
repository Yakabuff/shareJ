package Screenshot;

import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import Keybinds.Keybind;
import shareJ.Executable;

public class ScreenshotFullscreen extends Screenshot{
	
	private ArrayList modifiers;
	private ArrayList keys;
	
	public ScreenshotFullscreen() {
		super();
		this.setupKeybinds();
		name = "SCREENSHOTFULLSCREEN";
	}
	@Override
	public void exec() {
		try {
			
			
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            ImageIO.write(screenFullImage, format, new File(filename));
            
            ImageTransferable trans = new ImageTransferable(screenFullImage);
            
            Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
            c.setContents(trans, null);
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void setupKeybinds() {

		modifiers = new ArrayList();
		keys = new ArrayList();
		keys.add("Print Screen");
		this.keybind = new Keybind(modifiers,keys);
		
	}
	@Override
	public Keybind getKeybind() {
		// TODO Auto-generated method stub
		return this.keybind;
	}

}
