package com.pract7;

import java.util.Scanner;

public class Main {
	
	static Queue fDeck = new Queue(10);
	static Queue sDeck = new Queue(10);
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		System.out.println("First deck: ");
		for(int i = 0; i < 5; i++)
			fDeck.push(sc.nextInt());
		System.out.println("Second deck: ");
		for(int i = 0; i < 5; i++)
			sDeck.push(sc.nextInt());
		System.out.println(result(fDeck, sDeck));
		
	}
	
	private static String result(Queue fDeck, Queue sDeck) {
		
		int count = 0;
		String winner = "botva";
		
		while(count < 106 && !fDeck.empty() && !sDeck.empty()) {
			count++;
			System.out.println("\nRound #" + count + ": ");
			System.out.println("1st player: " + fDeck.head() + "; ");
			System.out.println("2nd player: " + sDeck.head() + "; ");
			if (((fDeck.head() > sDeck.head()) && sDeck.head() != 0) || (fDeck.head() == 0 && sDeck.head() == 9)) {
				fDeck.push(fDeck.getElement());
				fDeck.push(sDeck.getElement());
			} else {
				sDeck.push(fDeck.getElement());
				sDeck.push(sDeck.getElement());
			}
		}
		
		if (fDeck.empty()) {
			winner = "First player won!";
		} else if (sDeck.empty()) {
			winner = "Second player won!";
		}
		
		return (winner + " " + count);
		
	}

}
