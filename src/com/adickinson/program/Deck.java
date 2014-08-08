package com.adickinson.program;
import java.util.Random;

public class Deck {
	private Card[] cards;
	public int i;
	public  Deck(){
		 i=51;
		cards=new Card[52];
		int x=0;
		int c=0;
		for (int a=0;a<=3;a++)
		{
			for(int b=0; b<=12;b++)
			{
				
				cards[x]= new Card(b,a,c);
				x++;
				c++;
			}
		}
		
	}
	
	
	public Card drawFromDeck(){
		
		Random r= new Random();
		int index=0;
		do{
			index= r.nextInt(52);
		}while(cards[index]==null);
		i--;
		Card temp=cards[index];
		cards[index]=null;
		return temp;
		}
		
	public int getTotalCards(){
	return i;
	}
}
