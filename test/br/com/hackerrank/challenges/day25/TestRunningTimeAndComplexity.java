package br.com.hackerrank.challenges.day25;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Assert;
import org.junit.Test;

import br.com.hackerrank.InitialTest;
import br.com.hackerrank.challenges.daysofcode.day25.RunningTimeAndComplexity;

public class TestRunningTimeAndComplexity extends InitialTest {

	private final String path = "tests/Challenge/30DaysOfCode/RunningTimeAndComplexity/";

	@Test
	public void testChallengeTest01() throws Exception {

		File fileIn = new File(path + "input01.txt");
		new RunningTimeAndComplexity(new FileInputStream(fileIn)).execute();

		String text = readFile(path + "output01.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

	@Test
	public void testChallengeTest02() throws Exception {

		File fileIn = new File(path + "input02.txt");
		new RunningTimeAndComplexity(new FileInputStream(fileIn)).execute();

		String text = readFile(path + "output02.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

	@Test
	public void testChallengeTest03() throws Exception {
		
		File fileIn = new File(path + "input03.txt");
		new RunningTimeAndComplexity(new FileInputStream(fileIn)).execute();
		
		String text = readFile(path + "output03.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

	@Test
	public void testChallengeTest04() throws Exception {
		
		File fileIn = new File(path + "input04.txt");
		new RunningTimeAndComplexity(new FileInputStream(fileIn)).execute();
		
		String text = readFile(path + "output04.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

	@Test
	public void testChallengeTest05() throws Exception {
		
		File fileIn = new File(path + "input05.txt");
		new RunningTimeAndComplexity(new FileInputStream(fileIn)).execute();
		
		String text = readFile(path + "output05.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

}
