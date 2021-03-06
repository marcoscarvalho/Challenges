package br.com.hackerrank.challenges.daysofcode.day02;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip = mealCost * ( (double) tipPercent / 100);
		double tax = mealCost * ((double) taxPercent/ 100);
		double totalCost2 = mealCost + tip + tax;
        
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(totalCost2);
      
        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");

	}

}
