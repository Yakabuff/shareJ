package shareJ;

import History.DatabaseCreate;
import History.HistoryWrite;

public class Start {
	
	
	public static void main(String args[]) {
		shareJ.init();
		System.out.println(System.getProperty("user.dir"));
		DatabaseCreate.DBInit();


	}
}
