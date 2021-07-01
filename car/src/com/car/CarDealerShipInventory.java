package com.car;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CarDealerShipInventory {
	private static Statement st;
	private static Connection con;

	public static void main(String[] args) throws Exception {

		System.out.println("Hi There!\nWelcome to the Mullet Joe's Gently Used Autos!...\n");
			Connection con;
		    con = DatabaseConnection.getConnection();
			Statement st = con.createStatement();
		
		System.out.println("Enter your choice from the following Menu \n");
		System.out.println("\n1.Add \n2.List \n3.Delete \n4.Update \n5.Quit\n");
		System.out.println("Enter the command");
		Scanner sc = new Scanner(System.in);
		String urchoice = sc.nextLine();
		
		
		switch (urchoice) {
		case "1":
			
			System.out.print("Make : "); 						// insert
			String make = sc.next();
			System.out.print("Model : ");
			String model = sc.next();
			System.out.print("Year : ");
			int year = sc.nextInt();
			System.out.print("Sales Price $ : ");
			float sales_price = sc.nextFloat();

			PreparedStatement ps = con.prepareStatement("insert into car values(?,?,?,?)"); // inserting
			ps.setString(1, make);
			ps.setString(2, model);
			ps.setInt(3, year);
			ps.setFloat(4, sales_price);
			int noOfRows = ps.executeUpdate();						//returns integer datatype
			System.out.println(noOfRows + " row/rows succesfully inserted");
				
			break;
			
		case "2" :

			String select = "select * from car \n"; 			// list
			st = con.createStatement();
			ResultSet rs= st.executeQuery(select);
		
			System.out.println(" Make" + " |  " +"Model" + "  | " + "Year" +"  | "+ "Sales_Price |");
			try {
			while (rs.next()) {
				
				System.out.println(
						  rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " |  " + rs.getString(4) + " |  ");
				
			}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
				 finally {
					
					String string = "select count(year) from car";
					PreparedStatement ps1 = con.prepareStatement(string);
					try {
						rs = ps1.executeQuery();
						while (rs.next()) {
							int i = rs.getInt(1);
							System.out.println("The total Number of cars in an inventory :" + i);
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
					catch(Exception e) {
						e.printStackTrace();
					}

				}
			

			break;

		case "3":
			int count1;
			
			try {
			System.out.println("Enter Make : "); 				// delete
			make = sc.next();
			String delete = "delete from car where make=?";
			ps = con.prepareStatement(delete);
			ps.setString(1, make);
			count1 = ps.executeUpdate();
			
			if (count1 > 0)
				System.out.println("Record Deleted Succesfully...\n");
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
			break;

		case "4":
			
			con = DatabaseConnection.getConnection();
			System.out.println("Enter Make : ");				   // update
			make = sc.nextLine();
			System.out.println("Enter Model : ");
			model = sc.nextLine();
			String update = "update car set make=? where model=?";
			ps = con.prepareStatement(update);
			ps.setString(1, make);
			ps.setString(2, model);
			count1 = ps.executeUpdate();
			System.out.println(count1);
			if (count1 > 0) {
				System.out.println("Record updated Succesfully...\n");
			}
			else
			{
				System.out.println("Cannot Update....\n");
			}
			
			break;
			
		case "5":
			System.out.println("Thankyou...Bye Bye....\n");			 // quit
			System.exit(0);

		default:
			System.out.println("Sorry, but " + urchoice + " is not a valid command.Please try gain.\n");
			break;
			
		}
		
		System.out.println("Enter your choice:(yes/no) to continue further");
		String o = sc.next();
		if (o.equalsIgnoreCase("yes")) {
			main(args);
		} else if (o.equalsIgnoreCase("no")) {
			System.out.println("Terminated");
		} else {
			System.err.println(" Invalid choice.. Please Enter only yes or no");
		}
		sc.close();
	}

}

