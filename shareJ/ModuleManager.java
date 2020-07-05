package shareJ;

import java.util.ArrayList;


import Screenshot.ScreenshotFullscreen;
import Screenshot.ScreenshotSelection;


public class ModuleManager {

	public static ArrayList<Executable> modules = new ArrayList() {
		{
			add(new ScreenshotFullscreen());
			add(new ScreenshotSelection());
			
		}
	};
			
			
	
}
