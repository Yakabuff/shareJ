package shareJ;

import History.Database;
import History.HistoryWrite;

public class Start {
	
	
	public static void main(String args[]) {
		Database.DBInit();
		shareJ.init();
		System.out.println(System.getProperty("user.dir"));
		


	}
}
