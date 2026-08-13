package Aug_5;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	Connection con;
	
	public static Connection createConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/kncsj";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}

	void close() throws Exception {
		if (con != null)
			con.close();
	}

}
