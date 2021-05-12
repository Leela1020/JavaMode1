package com.hcl;
public class MemberShipCard extends Card {

	private int rating;

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public MemberShipCard(String holderName, int cardNumber, int expiryDate, int rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}
}


	