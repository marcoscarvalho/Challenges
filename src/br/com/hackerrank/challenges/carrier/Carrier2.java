package br.com.hackerrank.challenges.carrier;

import java.io.InputStream;
import java.util.Scanner;

public class Carrier2 {

	public static void main(String[] args) {
		new Carrier2().execute();
	}

	private InputStream systemIn;

	public Carrier2() {
		this(System.in);
	}

	public Carrier2(InputStream in) {
		systemIn = in;
	}

	// The first line of the input contains two decimal integers separated by
	// space: the maximum weight ('W') that can be delivered in a single trip
	// and the quantity of packages ('P') to be delivered.
	// The following 'P' lines contain a decimal integer representing the weight
	// of each package.
	public void execute() {
		Scanner in = new Scanner(systemIn);

		int tripMaxWeight = in.nextInt();
		int numberOfPackages = in.nextInt();

		int[] packagesWeight = new int[numberOfPackages];

		for (int i = 0; i < numberOfPackages; i++) {
			packagesWeight[i] = in.nextInt();
		}

		int minimumNumberOfTrips = minimumNumberOfTrips(tripMaxWeight, packagesWeight);

		System.out.println(minimumNumberOfTrips);

		in.close();

	}

	static int minimumNumberOfTrips(int tripMaxWeight, int[] packagesWeight) {
		
		int value = 0;
		int count = 0;

		for (int i : packagesWeight) {
			if (count < 2 && i <= tripMaxWeight &&  value < tripMaxWeight) {
				value += i;
				count++;
			}
		}

		return count;
	}

}
