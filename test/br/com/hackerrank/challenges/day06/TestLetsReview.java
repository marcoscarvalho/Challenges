package br.com.hackerrank.challenges.day06;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Assert;
import org.junit.Test;

import br.com.hackerrank.InitialTest;
import br.com.hackerrank.challenges.daysofcode.day06.LetsReview;

public class TestLetsReview extends InitialTest {

	@Test
	public void testChallengeTest01() throws Exception {

		File fileIn = new File("tests/LetsReview/input01.txt");
		new LetsReview(new FileInputStream(fileIn)).execute();

		String text = readFile("tests/LetsReview/output01.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

}
