package Keybinds;

import java.util.ArrayList;
import java.util.List;

public interface Bindable {
	
	List getBind();
	void setModifiers(ArrayList modifiers);
	void setKeys(ArrayList keys);
	List getModifiers();
	List getKeys();
	
	
}
