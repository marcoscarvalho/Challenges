package br.com.hackerrank.algorithms;

import java.io.File;
import java.io.FileInputStream;
import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

import br.com.hackerrank.InitialTest;

public class TestSherlockAndWatson extends InitialTest {

	@Test
	public void testChallengeTest01() throws Exception {

		File fileIn = new File("tests/SherlockAndWatson/input01.txt");
		new SherlockAndWatson(new FileInputStream(fileIn)).execute();

		String text = readFile("tests/SherlockAndWatson/output01.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

	/*
	 * total: 411103 meio - inicio: 411101 fim - meio: 2
	 */
//	@Test
	public void testChallengeTest09() throws Exception {
		long inicio = Calendar.getInstance().getTimeInMillis();
		File fileIn = new File("tests/SherlockAndWatson/input09.txt");
		new SherlockAndWatson(new FileInputStream(fileIn)).execute();

		long meio = Calendar.getInstance().getTimeInMillis();
		String text = readFile("tests/SherlockAndWatson/output09.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
		long fim = Calendar.getInstance().getTimeInMillis();

		System.out.println(
				"total: " + (fim - inicio) + "\n meio - inicio: " + (meio - inicio) + "\n fim - meio: " + (fim - meio));

		// 529,643 s
	}

	@Test
	public void testChallengeTest09Execute2() throws Exception {
		long inicio = Calendar.getInstance().getTimeInMillis();
		File fileIn = new File("tests/SherlockAndWatson/input09.txt");
		new SherlockAndWatson(new FileInputStream(fileIn)).execute2();

		long meio = Calendar.getInstance().getTimeInMillis();
		String text = readFile("tests/SherlockAndWatson/output09.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
		long fim = Calendar.getInstance().getTimeInMillis();

		System.out.println(
				"total: " + (fim - inicio) + "\n meio - inicio: " + (meio - inicio) + "\n fim - meio: " + (fim - meio));
	}

	@Test
	public void testChallengeTest10Execute2() throws Exception {
		long inicio = Calendar.getInstance().getTimeInMillis();
		File fileIn = new File("tests/SherlockAndWatson/input10.txt");
		new SherlockAndWatson(new FileInputStream(fileIn)).execute2();
		
		long meio = Calendar.getInstance().getTimeInMillis();
		String text = readFile("tests/SherlockAndWatson/output10.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
		long fim = Calendar.getInstance().getTimeInMillis();
		
		System.out.println(
				"total: " + (fim - inicio) + "\n meio - inicio: " + (meio - inicio) + "\n fim - meio: " + (fim - meio));
	}

}
