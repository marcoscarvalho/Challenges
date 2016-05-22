package br.com.hackerrank.challenges.day23;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Assert;
import org.junit.Test;

import br.com.hackerrank.InitialTest;
import br.com.hackerrank.challenges.daysofcode.day23.BSTLevelOrderTraversal;

public class TestBSTLevelOrderTraversal extends InitialTest {

	private final String path = "tests/Challenge/30DaysOfCode/BSTLevelOrderTraversal/";

	@Test
	public void testChallengeTest01() throws Exception {

		File fileIn = new File(path + "input01.txt");
		new BSTLevelOrderTraversal(new FileInputStream(fileIn)).execute();

		String text = readFile1(path + "output01.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

}
