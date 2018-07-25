package DatabaseOperations;
import java.sql.*;

public class DatabaseOperations {
	public static void main(String args[]) {
		Connection conn;
		Statement stmt;
		ResultSet rs;
		try {
			conn = DriverManager.getConnection("jdbc:derby:/Users/vishu/MyDbTest");
			PreparedStatement pStmt = conn.prepareStatement("select * from employee where eName = ?");
			stmt = conn.createStatement();
			String myInsertStmt = "insert into employee values (2,'chintan','CEO')";
			stmt.executeUpdate(myInsertStmt);
			pStmt.setString(1, "chintan");
			
			rs = pStmt.executeQuery();

			while (rs.next()) {
				int empNo = rs.getInt("EMPNO");
				String empName = rs.getString("ENAME");
				String Title = rs.getString("JOB_TITLE");
				System.out.println("Record:" + empNo + " " + empName + " " + Title);
			}
			
			
	} catch (SQLException ex) {
			ex.printStackTrace();
		}
		finally {
			conn = null;
			rs = null;
			stmt = null;
		}
	}
}
