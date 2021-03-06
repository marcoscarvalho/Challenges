package br.com.hackerrank.java.introduction;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Assert;
import org.junit.Test;

import br.com.hackerrank.InitialTest;

public class TestJavaLoops extends InitialTest {

	private final String path = "tests/Java/Introduction/JavaLoops/";

	@Test
	public void testChallengeTest01() throws Exception {

		File fileIn = new File(path + "input01.txt");
		new JavaLoops(new FileInputStream(fileIn)).execute();

		String text = readFile(path + "output01.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

//	@Test
//	public void testChallengeTest02() throws Exception {
//
//		File fileIn = new File(path + "input02.txt");
//		new JavaLoops(new FileInputStream(fileIn)).execute();
//
//		String text = readFile(path + "output02.txt");
//		Assert.assertEquals(text, systemOutRule.getLog());
//	}

}
