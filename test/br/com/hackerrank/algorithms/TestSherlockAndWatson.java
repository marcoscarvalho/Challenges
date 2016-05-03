package br.com.hackerrank.algorithms;

import java.io.File;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
// @PrepareForTest(Scanner.class)
public class TestSherlockAndWatson {

	@Test
	public void testChallenge() throws Exception {

		// PowerMockito.mockStatic(Scanner.class);

		// File fileOut = new File("tests/SherlockAndWatson/output01.txt");
		// Scanner scannerOut = new Scanner(fileOut);

		File fileIn = new File("tests/SherlockAndWatson/input01.txt");
		Scanner scannerIn = new Scanner(fileIn);

		// PowerMockito.whenNew(Scanner.class).withArguments(System.in).thenReturn(scannerIn);

		final Scanner scanner = Mockito.mock(Scanner.class);

		Mockito.when(scanner.nextInt()).thenReturn(scannerIn.nextInt());

		SherlockAndWatson.main(null);

		scannerIn.close();

	}

}
