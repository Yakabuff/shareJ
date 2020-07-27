package Screenshot;

import java.util.ArrayList;
import Keybinds.Keybind;

public class ScreenshotSelection extends Screenshot {
	
	private ArrayList modifiers;
	private ArrayList keys;
	
	
	
	public ScreenshotSelection() {
		super();
		setupKeybinds();
		name = "SCREENSHOTSELECTION";

	}
	@Override
	public void exec() {
		PreviewFrame previewFrame = new PreviewFrame();
		previewFrame.setVisible(true);
	}
	@Override
	public void setupKeybinds() {

		modifiers = new ArrayList();
		modifiers.add(2);
		keys = new ArrayList();
		keys.add("Print Screen");
		this.keybind = new Keybind(modifiers,keys);
		
	}
	@Override
	public Keybind getKeybind() {
		// TODO Auto-generated method stub
		return keybind;
	}

}
