package Keybinds;

import java.util.ArrayList;
import java.util.List;

public class Keybind implements Bindable{
	
	private ArrayList<Integer> modifiers;
	private ArrayList<Integer> keys;
	
	public Keybind(ArrayList m, ArrayList k) {
		this.modifiers = m;
		this.keys = k;
	}

	@Override
	public List getBind() {
		// TODO Auto-generated method stub
		List bind = new ArrayList();
		bind.add(modifiers);
		bind.add(keys);
		return bind;
	}

	@Override
	public List getModifiers() {
		// TODO Auto-generated method stub
		return modifiers;
	}

	@Override
	public List getKeys() {
		// TODO Auto-generated method stub
		return keys;
	}

	@Override
	public void setModifiers(ArrayList m) {
		// TODO Auto-generated method stub
		this.modifiers = m;
	}

	@Override
	public void setKeys(ArrayList k) {
		// TODO Auto-generated method stub
		this.keys = k;
	}
}




