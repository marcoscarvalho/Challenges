package br.com.hackerrank.challenges.daysofcode.day19;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Interfaces {

	private InputStream systemIn;

	public Interfaces() {
		this(System.in);
	}

	public Interfaces(InputStream in) {
		systemIn = in;
	}

	public static void main(String[] args) {
		new Interfaces().execute();
	}

	public void execute() {

		Scanner scan = new Scanner(systemIn);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculator();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: "
				+ myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
		scan.close();
	}

}

class Calculator implements AdvancedArithmetic {
	LinkedList<Integer> ns = new LinkedList<Integer>();

	@Override
	public int divisorSum(int num) {

		divisor(num, 1);
		
		int retorno = 0;
		for (Integer i : ns) {
			retorno += i;
		}
		
		return retorno;
	}
	
	private void divisor(int num, int presuntoDivisor){
        if(num % presuntoDivisor == 0) 
            ns.add(presuntoDivisor);

        if(presuntoDivisor == num) 
        	return;

        divisor(num, ++presuntoDivisor);
    }
}

interface AdvancedArithmetic {
	int divisorSum(int n);
}