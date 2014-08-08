package com.adickinson.program;

public class Card {

		private int suit, value,img;
		
	
		public final static String[] suits={"Spades","Hearts","Diamonds","Clubs"};   // Creates array of Suits
	    public final static String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };//Creates array of card values
		public final static String[] imgs={"01s","01h","01d","01c","02s","02h","02d","02c","03s","03h","03d","03c","04s","04h","04d","04c","05s","05h","05d","05c","06s","06h","06d","06c","07s","07h","07d","07c","08s","08h","08d","08c","09s","09h","09d","09c","10s","10h","10d","10c","11s","11h","11d","11c","12s","12h","12d","12c","13s","13h","13d","13c"};   
		 
		public Card(int value, int suit, int img){
			   this.setSuit(suit);
			   this.setValue(value);
			   this.setImg(img);
			   }

		public Card() {
			
		}
		public @Override String toString()
		{
			
		return values[value]+" of "+suits[suit];	
		}
		public  String returnImg()
		{
		return imgs[img];	
		}
		public int getSuit() {
			return suit;
		}

		public void setSuit(int suit) {
			this.suit = suit;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public int getImg() {
			return img;
		}

		public void setImg (int img) {
			this.img = img;
		}
		
	
}
