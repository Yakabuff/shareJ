package Screenshot;

import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import Keybinds.Keybind;
import shareJ.Executable;
import shareJ.FileHandler;

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
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
//            Path p = Paths.get(System.getProperty("user.dir"), Screenshot.filename());
//            File f = p.toFile();
//            ImageIO.write(screenFullImage, Screenshot.format, f);
		FileHandler.saveScreenshotOperation(screenFullImage);
		ImageTransferable trans = new ImageTransferable(screenFullImage);
		
		Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
		c.setContents(trans, null);
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
