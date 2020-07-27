package History;

import java.util.ArrayList;
import java.util.Date;

public class HistoryItem {
	ArrayList fileName= new ArrayList();
	ArrayList filePath = new ArrayList();
	ArrayList date= new ArrayList();
	ArrayList url= new ArrayList();
	int count;
	
	public void setfilePath(String s) {
		filePath.add(s);
	}
	
	public void setDate(String s) {
		date.add(s);
	}
	
	public ArrayList getDate() {
		return date;	
	}
	
	public ArrayList getPath() {
		return filePath;
	}
	
	public void setCount(int z) {
		this.count = z;
	}
	
	public int getCount() {
		return count;
	}

	
	
	
}
