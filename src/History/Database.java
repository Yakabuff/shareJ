package History;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {
	static String url = "jdbc:sqlite:"+"/"+System.getProperty("user.dir")+"/"+"history.db";
	static 		Path p = Paths.get(System.getProperty("user.dir"), "history.db");
	public static void createDB() {
    try (Connection conn = DriverManager.getConnection(url)) {
        if (conn != null) {
            DatabaseMetaData meta = conn.getMetaData();
            System.out.println("The driver name is " + meta.getDriverName());
            System.out.println("A new database has been created.");
        }

    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
	}
	
	 public static void createNewTable() {
       
	        // SQL statement for creating a new table
	        String sql = "CREATE TABLE IF NOT EXISTS History (\n"
	                + "	id integer PRIMARY KEY,\n"
	                + "	path text NOT NULL,\n"
	                + " date text"
	                + ");";
	        
	        try (Connection conn = DriverManager.getConnection(url);
	                Statement stmt = conn.createStatement()) {
	            // create a new table
	            stmt.execute(sql);
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	 public static void DBInit() {
		 createDB();
		 createNewTable();
	 }
}
