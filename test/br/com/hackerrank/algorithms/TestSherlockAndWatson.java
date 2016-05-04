package br.com.hackerrank.algorithms;

import java.io.File;
import java.io.FileInputStream;

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

	@Test
	public void testChallengeTest09() throws Exception {

		File fileIn = new File("tests/SherlockAndWatson/input09.txt");
		new SherlockAndWatson(new FileInputStream(fileIn)).execute();

		String text = readFile("tests/SherlockAndWatson/output09.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

}
