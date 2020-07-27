package MainGui;

import javax.swing.*;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ButtonManager {
	

		public static Hashtable<String, JButton> buttons = new Hashtable() {{
			put("Capture", new JButton("Capture"));
			put("Upload", new JButton("Upload"));
			put("Workflow", new JButton("Workflow"));
			put("Tools", new JButton("Tools"));
			put("After Capture", new JButton("After Capture"));
			put("After upload", new JButton("After upload"));
			put("Destinations", new JButton("Destinations"));
			put("TaskSettings", new JButton("TaskSettings"));
			put("Application settings", new JButton("Application settings"));
			put("Hot Key settings", new JButton("Hot Key settings"));
			put("Screenshots folder", new JButton("Screenshots folder"));
			put("History", new JButton("History"));
			put("News", new JButton("News"));
			put("About", new JButton("About"));

		}};


}
