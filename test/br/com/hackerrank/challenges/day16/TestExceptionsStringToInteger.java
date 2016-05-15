package br.com.hackerrank.challenges.day16;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Assert;
import org.junit.Test;

import br.com.hackerrank.InitialTest;
import br.com.hackerrank.challenges.daysofcode.day16.ExceptionsStringToInteger;

public class TestExceptionsStringToInteger extends InitialTest {

	private final String path = "tests/Challenge/30DaysOfCode/ExceptionsStringToInteger/";

	@Test
	public void testChallengeTest01() throws Exception {

		File fileIn = new File(path + "input01.txt");
		new ExceptionsStringToInteger(new FileInputStream(fileIn)).execute();

		String text = readFile(path + "output01.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

	@Test
	public void testChallengeTest02() throws Exception {

		File fileIn = new File(path + "input02.txt");
		new ExceptionsStringToInteger(new FileInputStream(fileIn)).execute();

		String text = readFile(path + "output02.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

}
