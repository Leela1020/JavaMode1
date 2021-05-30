/*	Jdbc Transaction Management
1.Create a table named customer including name,salary,email.
*
*/
package JdbcExercise_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CustomerTable {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_ass", "root", "root");
		Statement st = c.createStatement();
		st.executeUpdate("create table customer(name varchar(20),salary int(20),email varchar(40)unique)");
		System.out.println("Cutomers Table created succesfully");
		st.close();
		c.close();

	}
}
