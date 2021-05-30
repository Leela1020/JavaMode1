/*	2.One of the constraints on the table is that email has to be unique. If we enter same email a second time to violate this constraint. It results in SQL exception. Have to  rollback transaction programmatically in exception handling block.
Sample Input and Output:
If Email is unique then data should save successfully.
Enter name
revathi
Enter salary
10000
Enter email
a@hcl.com
Want to add more records y/n
y
Enter name
drishnaa
Enter salary
20000
enter email
b@hcl.com
Want to add more records y/n
n
Data Saved Successfully
If Email is  violated.
Enter name
revathi
Enter salary
10000
Enter email
a@hcl.com
Email Id must be unique . Data Rollback successfully.
*/

package JdbcExercise_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class EmailRollback {
	public static void main(String[] args) throws Exception {
		Connection c = null;
		try {
			while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter name:");
				String name = sc.next();
				System.out.println("Enter Salary:");
				int salary = sc.nextInt();
				System.out.println("Enter email:");
				String email = sc.next();
				Class.forName("com.mysql.cj.jdbc.Driver");
				c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_ass", "root", "root");
				c.setAutoCommit(false);
				PreparedStatement ps = c.prepareStatement("insert into customers values(?,?,?)");
				ps.setString(1, name);
				ps.setInt(2, salary);
				ps.setString(3, email);
				ps.executeUpdate();
				c.commit();
				System.out.println("Want to add more records y/n");
				String ans = sc.next();
				if (!"y".equalsIgnoreCase(ans)) {
					System.out.println("Data saved successfully");
					break;
				}
				sc.close();
			}
		} catch (Exception e) {
			c.rollback();
			System.out.println("Email Id must be unique . Data Rollback successfully");
		} finally {
			c.close();
		}

	}

}
