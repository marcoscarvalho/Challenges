package br.com.hackerrank.artificialintelligence.botbuilding;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Assert;
import org.junit.Test;

import br.com.hackerrank.InitialTest;

public class TestBotClean extends InitialTest {

	private final String path = "tests/ArtificialIntelligence/BotBuilding/BotClean/";

	@Test
	public void testChallengeTest01() throws Exception {

		File fileIn = new File(path + "input01.txt");
		new Solution(new FileInputStream(fileIn)).execute();

		String text = readFile(path + "output01.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

	@Test
	public void testChallengeTest02() throws Exception {

		File fileIn = new File(path + "input02.txt");
		new Solution(new FileInputStream(fileIn)).execute();

		String text = readFile(path + "output02.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

	@Test
	public void testChallengeTest03() throws Exception {

		for (int i = 0; i < 10; i++) {
			System.out.println("Vez: " + i);
			File fileIn = new File(path + "input03.txt");
			new Solution(new FileInputStream(fileIn)).execute();
		}

	}

	@Test
	public void testChallengeTest04() throws Exception {

		for (int i = 0; i < 10; i++) {
			File fileIn = new File(path + "input04.txt");
			new Solution(new FileInputStream(fileIn)).execute();
		}

		String text = readFile(path + "output04.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

	@Test
	public void testChallengeTest05() throws Exception {

		for (int i = 0; i < 10; i++) {
			File fileIn = new File(path + "input06.txt");
			new Solution(new FileInputStream(fileIn)).execute();
		}

		String text = readFile(path + "output06.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

	@Test
	public void testChallengeTest06() throws Exception {

		for (int i = 0; i < 10; i++) {
			File fileIn = new File(path + "input06.txt");
			new Solution(new FileInputStream(fileIn)).execute();
		}

		String text = readFile(path + "output06.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

}
