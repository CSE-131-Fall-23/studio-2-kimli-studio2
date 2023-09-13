package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("What is your starting amount?");
		double startAmount = scan.nextDouble();

		System.out.println("What is your win chance?");
		double winChance = scan.nextDouble();

		System.out.println("What is your win limit?");
		double winLimit = scan.nextDouble();
		
		System.out.println("What is the number of days you play the game?");
		int totalSimulations = scan.nextInt();

		for(int i=0; i < totalSimulations; i++) {
		
		
		while (startAmount > 0) {
	
		double win = Math.random();

		if (win < winChance) {
			startAmount++;

		} else {
			startAmount--;
		} }
		if (startAmount == 0) {
				System.out.println("Ruin");
		} else {
				System.out.println("Success");
		}
	}}

}
