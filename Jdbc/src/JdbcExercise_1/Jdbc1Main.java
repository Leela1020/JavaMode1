/*	2. Select all records from the Users table and print out details for each record.
 * 
 */
package JdbcExercise_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Jdbc1Main {
	public static void main(String[] args) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter username");
			String username = sc.nextLine();
			System.out.println("Enter password");
			String password = sc.nextLine();
			System.out.println("Enter fullname");
			String fullname = sc.nextLine();
			System.out.println("Enter email");
			String email = sc.nextLine();
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_ass", "root", "root");

			ps = con.prepareStatement("insert into users values(?,?,?,?)");
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, fullname);
			ps.setString(4, email);
			int noOfRows = ps.executeUpdate();
			System.out.println(noOfRows + "row inserted");
			sc.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ps.close();
			con.close();
		}
	}
}
