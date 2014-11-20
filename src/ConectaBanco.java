import java.sql.Connection;
import java.sql.DriverManager;

public class ConectaBanco {

	public static Connection getConn(){
		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/videos", "root", "admin");
		} catch(Exception e){
			System.err.println(e);
		}
		return conn;
	}
}
	
