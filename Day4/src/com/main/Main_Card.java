package com.main;

import java.util.Scanner;

import com.hcl.MemberShipCard;

public class Main_Card {

	public static void main(String[] args) {
		System.out.println("Select the card: ");
		Scanner scanner = new Scanner(System.in);
		int card = scanner.nextInt();
		switch (card) {
		case 1:
			System.out.println("Membership card");
			// System.out.println("Enter the card details: ");
			System.out.println("Enter the holder name: ");
			String holderName = scanner.next();
			System.out.println("Enter the card number: ");
			int cardNumber = scanner.nextInt();
			System.out.println("Enter the expiry date: ");
			int expiryDate = scanner.nextInt();
			System.out.println("Enter the rating: ");
			int rating = scanner.nextInt();
			MemberShipCard memberShipCard = new MemberShipCard(holderName, cardNumber, expiryDate, rating);
			System.out.println(holderName + "MembershipCard details are: ");
			System.out.println("Holder Name: " + memberShipCard.getHolderName());
			System.out.println("CardNumber: " + memberShipCard.getCardNumber());
			System.out.println("ExpiryDate: " + memberShipCard.getExpiryDate());
			System.out.println("Rating: " + memberShipCard.getRating());
			break;
		case 2:
			System.out.println("Payback card");
			System.out.println("Enter the holder name: ");
			String paybackHolderName = scanner.next();
			System.out.println("Enter the card number: ");
			int paybackCardNumber = scanner.nextInt();
			System.out.println("Enter the Expiry date: ");
			int paybackExpiryDate = scanner.nextInt();
			System.out.println("Enter the card details: ");
			System.out.println(paybackHolderName +"/"+ paybackCardNumber +"/"+ paybackExpiryDate);
			System.out.println("Enter the points Earned: ");
			int pointsEarned = scanner.nextInt();
			System.out.println("Enter the total amount: ");
			double totalAmount = scanner.nextInt();
			// PaybackCard paybackCard=new
			// PaybackCard(paybackHolderName,paybackCardNumber,paybackExpiryDate,pointsEarned,totalAmount);
			System.out.println(paybackHolderName + "Payback Card details are : ");
			System.out.println("Payback CardNumber: " + paybackCardNumber);
			// System.out.println("ExpiryDate: "+expiryDate);
			System.out.println("Points earned: " + pointsEarned);
			System.out.println("Total amount: " + totalAmount);

			break;
		default:
			System.out.println("No card");
		}
		scanner.close();

	}

}
