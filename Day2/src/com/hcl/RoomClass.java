package com.hcl;
public class RoomClass {

		private int roomNo;
		private String roomType;
		private float roomArea;
		private boolean acMachine;

		public void setRoomNo(int roomNo) {
			this.roomNo = roomNo;
		}

		public void setRoomType(String roomType) {
			this.roomType = roomType;
		}

		public void setRoomArea(float roomArea) {
			this.roomArea = roomArea;
		}

		public void setAcMachine(boolean acMachine) {
			this.acMachine = acMachine;
		}

		public void displayData() {
			System.out.println("The room Number is: " + roomNo);
			System.out.println("The room Type is: " + roomType);
			System.out.println("The room area is: " + roomArea);
			String ans = (acMachine) ? "yes" : "no";
			System.out.println("The AC Machine needed: " + ans);
		}
	}
	
