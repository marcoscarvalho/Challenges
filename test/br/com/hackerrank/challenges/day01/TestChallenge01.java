package br.com.hackerrank.challenges.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class TestChallenge01 {
	
	public static class IntegerAsker {
	    private final Scanner scanner;
	    private final PrintStream out;

	    public IntegerAsker(InputStream in, PrintStream out) {
	        scanner = new Scanner(in);
	        this.out = out;
	    }

	    public int askInt(int message) {
	        out.println(message);
	        int p = scanner.nextInt();
	        //scanner.nextLine();
	        return p;
	    }

	    public double askDouble(double message) {
	    	out.println(message);
	    	double p = scanner.nextDouble();
	    	//scanner.nextLine();
	    	return p;
	    }

	    public String askString(String message) {
	    	out.println(message);
	    	return scanner.nextLine();
	    }
	}
	
	@Test
	public void testChallenge() throws IOException {
		
//		IntegerAsker asker = PowerMockito.mock(IntegerAsker.class);
//		Mockito.when(asker.askInt(1)).thenReturn(1);
//		Mockito.when(asker.askDouble(4.0)).thenReturn(4.0);
//		Mockito.when(asker.askString("fera")).thenReturn("fera");
		
		BufferedReader bufferedReader = org.mockito.Mockito.mock(BufferedReader.class);
		Mockito.when(bufferedReader.readLine()).thenReturn("1");
		
		DataTypes.main(null);
	}

}
