package airport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AirportDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public AirportDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/AirportSys_project";
			String dbID = "root";
			String dbPassword = "0000";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
