package br.com.hackerrank.challenges.daysofcode.day25;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class RunningTimeAndComplexity {

	private InputStream systemIn;

	public RunningTimeAndComplexity() {
		this(System.in);
	}

	public RunningTimeAndComplexity(InputStream in) {
		systemIn = in;
	}

	public static void main(String[] args) {
		new RunningTimeAndComplexity().execute();
	}

	public void execute() {

		Scanner sc = new Scanner(systemIn);

		int scenarios = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();

		for (int i = 0; i < scenarios; i++) {
			list.add(sc.nextInt());
		}
		for (Integer i : list) {
			if (isPrime(i)) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}
		}

		sc.close();
	}

	public boolean isPrime(int n){
        // check lower boundaries on primality
        if( n == 2 ){ 
            return true;
        } // 1 is not prime, even numbers > 2 are not prime
        else if( n == 1 || (n & 1) == 0){
            return false;
        }

        // Check for primality using odd numbers from 3 to sqrt(n)
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            // n is not prime if it is evenly divisible by some 'i' in this range
            if( n % i == 0 ){ 
                return false;
            }
        }
        // n is prime
        return true;
    }

}