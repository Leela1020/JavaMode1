package com.hcl;

	public abstract class Card {
		protected	String holderName; 
		protected	 int cardNumber; 
		protected	 int expiryDate;
		public Card(String holderName, int cardNumber2, int expiryDate2) {
			super();
			this.holderName = holderName;
			this.cardNumber = cardNumber2;
			this.expiryDate = expiryDate2;
		}
		public String getHolderName() {
			return holderName;
		}
		public void setHolderName(String holderName) {
			this.holderName = holderName;
		}
		public int getCardNumber() {
			return cardNumber;
		}
		public void setCardNumber(int cardNumber) {
			this.cardNumber = cardNumber;
		}
		public int getExpiryDate() {
			return expiryDate;
		}
		public void setExpiryDate(int expiryDate) {
			this.expiryDate = expiryDate;
		} 


		}

	
