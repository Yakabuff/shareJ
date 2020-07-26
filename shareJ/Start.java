package shareJ;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import History.Database;
import History.HistoryWrite;
import Uploads.KeysAPI;

public class Start {
	
	
	public static void main(String args[]) {
		
        try {
			UIManager.setLookAndFeel(
			        UIManager.getSystemLookAndFeelClassName());
					
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Database.DBInit();
		shareJ.init();
		System.out.println(System.getProperty("user.dir"));
		KeysAPI.init();
		System.out.println(BuildConfig.shareJ_ImgurClient_ID);
		System.out.println(BuildConfig.shareJ_ImgurSecret);



	}
}
