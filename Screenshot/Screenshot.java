package Screenshot;

import java.awt.AWTException;

import java.awt.Robot;

import java.time.LocalDate;
import java.time.LocalTime;

import Module.Module;


public abstract class Screenshot extends Module {

Robot robot;
public static String format = "png";
String filename;
static LocalDate ld;
static LocalTime lt;

	public Screenshot() {
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public abstract void setupKeybinds();
	public static String dateTime() {
		return ld.now() +"_"+ lt.now();
	}
	
//	public void takeScreenshotFullScreen(){
//		try {
//			
//			
//            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
//            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
//            ImageIO.write(screenFullImage, format, new File(filename));
//            
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
//	public void takeScreenshotSelection(){
//		try {
//            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
//            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
//			PreviewFrame previewFrame = new PreviewFrame();

//			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//			int width = dim.width;
//			int height = dim.height;
			
//	        PreviewPanel previewPanel = new PreviewPanel(screenFullImage);
			
			
//			previewFrame.setSize(width, height);
		
			  
            //ImageIO.write(screenFullImage, format, new File(filename));
            
            
//            previewFrame.add(previewPanel);
//            previewFrame.setVisible(true);
            

            
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
