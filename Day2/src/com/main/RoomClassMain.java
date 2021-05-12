package com.main;

/*  4.Write a program to create a room class
 * 
 */
import com.hcl.RoomClass;

public class RoomClassMain{

	public static void main(String[] args) {

		RoomClass roomClass = new RoomClass();
		roomClass.setRoomNo(403);
		roomClass.setRoomType("Double Deluxe");
		roomClass.setRoomArea(120.0f);
		roomClass.setAcMachine(true);

		roomClass.displayData();
	}

}