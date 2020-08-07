package shareJ;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

public class shareJ {
	
	public static final String NAME = "shareJ";
	public static String VERSION = "";

	public static final int MAJOR = 0;
	public static final int MINOR = 1;
	public static final int REVISION = 0;
	public static final String AUTHOR = "yakabuff";
	public static ModuleManager mm;

	public static void init() {
		
		Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
		logger.setLevel(Level.OFF);
		
		//Main window
		Window w = new Window();

		mm = new ModuleManager();


		try {
			GlobalScreen.registerNativeHook();
			GlobalScreen.addNativeKeyListener(new GlobalKeyListener());
		} catch (NativeHookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static{
		VERSION = MAJOR + "." + MINOR + "." + REVISION;
		System.out.println("shareJ V" + VERSION);
	}
}
