/*	 
Jdbc Exercise(Using Statement and PreparedStatement)
1.Let’s write code to insert a new record into the table Users with following details:
o	username: steve
o	password: secretpass
o	fullname: steve paul
o	email: steve.paul@hcl.com
*/

package JdbcExercise_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc1 {
	public static void main(String[] args) throws Exception {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_ass", "root", "root");
			st = con.createStatement();
			st.execute(
					"create table users(username varchar(20),password varchar(20),fullname varchar(20), email varchar(20))");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			st.close();
			con.close();
		}
	}
}