package shareJ;

import org.jnativehook.NativeInputEvent;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import Module.Module;
import Screenshot.ScreenshotSelection;

public class GlobalKeyListener implements NativeKeyListener{

	@Override
	public void nativeKeyPressed(NativeKeyEvent e) {
//		System.out.println("hello"+e.getModifiers() +" "+ e.getKeyText(e.getKeyCode()));
//		if (e.getModifiers() == NativeInputEvent.CTRL_L_MASK && e.getKeyCode() == NativeKeyEvent.VC_PRINTSCREEN) {
//		    ScreenshotSelection ss = new ScreenshotSelection();
//		    ss.exec();
//		    
//		}
		
		//loop across all modules in module manager
		// get keys pressed and compare with module keypress
		//if same, exec()
		
		for(Executable c : shareJ.mm.modules) {
			if(c.getKeybind().getKeys().contains(e.getKeyText(e.getKeyCode())) && c.getKeybind().getModifiers().contains(e.getModifiers())) {
				c.exec();
//				System.out.println("hello"+e.getModifiers() +" "+ e.getKeyText(e.getKeyCode()));
			}

		}
		
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
