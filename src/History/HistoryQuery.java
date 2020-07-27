package History;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class HistoryQuery {
	
	
	public static int getCount() {
        // SQL statement for creating a new table
        String sql = "SELECT COUNT(*) as count FROM History";
        ResultSet count;
        try (Connection conn = DriverManager.getConnection(Database.url)){
                Statement stmt = conn.createStatement();
            // create a new table
            count = stmt.executeQuery(sql);

            return count.getInt("count");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
		return -1;
        
	}
	
	public static HistoryItem getAllHistory() {
		

        // SQL statement for creating a new table
        String sql = "SELECT Path as path, Date as date FROM History";
        ResultSet result;
        HistoryItem hi = new HistoryItem();
        try (Connection conn = DriverManager.getConnection(Database.url)){
                Statement stmt = conn.createStatement();
            // create a new table
            result = stmt.executeQuery(sql);
            while (result.next()) {
            	hi.setDate(result.getString("path"));
            	hi.setfilePath(result.getString("path"));
            }
            hi.setCount(getCount());
            return hi;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
		return null;
		
	}

}
