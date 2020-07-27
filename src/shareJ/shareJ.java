package shareJ;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

import MainGui.ButtonManager;
import Screenshot.ScreenshotFullscreen;

public class shareJ {
	
	public static final String NAME = "shareJ";
	public static final String VERSION = "0.0.1";
	public static ModuleManager mm;
	public static void init() {
		
		Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
		logger.setLevel(Level.OFF);
		
		//Main window
		Window w = new Window();

		mm = new ModuleManager();
		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GlobalScreen.addNativeKeyListener(new GlobalKeyListener());
	}
}
