package br.com.hackerrank.challenges.day19;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Assert;
import org.junit.Test;

import br.com.hackerrank.InitialTest;
import br.com.hackerrank.challenges.daysofcode.day19.Interfaces;

public class TestInterfaces extends InitialTest {

	private final String path = "tests/Challenge/30DaysOfCode/Interfaces/";

	@Test
	public void testChallengeTest01() throws Exception {

		File fileIn = new File(path + "input01.txt");
		new Interfaces(new FileInputStream(fileIn)).execute();

		String text = readFile(path + "output01.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

}
