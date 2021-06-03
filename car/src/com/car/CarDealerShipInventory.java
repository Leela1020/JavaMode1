package com.car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CarDealerShipInventory {
	private static Connection st;
	private static Connection con;

	public static void main(String[] args) throws Exception {

		System.out.println("Welcome to the Mullet Joe's Gently Used Autos!...\n");

		Connection con = DatabaseConnection.getConnection();
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
			System.out.print("Sales Price ($) : ");
			float sales_price = sc.nextFloat();

			PreparedStatement ps = con.prepareStatement("insert into car values(?,?,?,?)"); // inserting
			ps.setString(1, make);
			ps.setString(2, model);
			ps.setInt(3, year);
			ps.setFloat(4, sales_price);
			int noOfRows = ps.executeUpdate();						//return integer datatype
			System.out.println(noOfRows + " row/rows inserted");
			break;
		case "2":
			String select = "select * from car \n"; 			// list
			st = con.createStatement();
			ResultSet rs = st.executeQuery(select);
			System.out.println("Make" + " " + "Model" + " " + "Sales Price");
			while (rs.next()) {
				System.out.println(
						rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			break;

		case "3":
			int count;
			System.out.println("Enter Make : "); 				// delete
			make = sc.next();
			String delete = "delete from car where make=?";
			ps = con.prepareStatement(delete);
			ps.setString(1, make);
			count = ps.executeUpdate();
			if (count > 0)
				System.out.println("Record Deleted Succesfully...\n");
			break;

		case "4":
			System.out.println("Enter Make : ");				   // update
			make = sc.next();
			System.out.println("Enter Model : ");
			model = sc.next();
			String update = "update car set make=? where model=?";
			ps = con.prepareStatement(update);
			ps.setString(1, make);
			ps.setString(2, model);
			count = ps.executeUpdate();
			if (count > 0)
				System.out.println("Record updated Succesfully...\n");
			break;
		case "5":
			System.out.println("Thankyou...Bye Bye....\n");			 // quit
			System.exit(0);

		default:
			System.out.println("Sorry, but " + urchoice + " is not a valid command.Please try gain.\n");
			break;
		}
		sc.close();
		System.out.println("Do you want to continue further : (yes/no)");
		String o = sc.next();
		if (o.equalsIgnoreCase("yes")) {
			main(args);
		} else if (o.equalsIgnoreCase("no")) {
			System.out.println("Terminated");
		} else {
			System.err.println("choose only yes or no");
		}
	}

}

