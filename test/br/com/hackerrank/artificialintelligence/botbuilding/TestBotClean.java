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
		new BotClean(new FileInputStream(fileIn)).execute();

		String text = readFile(path + "output01.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

	@Test
	public void testChallengeTest02() throws Exception {

		File fileIn = new File(path + "input02.txt");
		new BotClean(new FileInputStream(fileIn)).execute();

		String text = readFile(path + "output02.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

	@Test
	public void testChallengeTest03() throws Exception {

		File fileIn = new File(path + "input03.txt");
		new BotClean(new FileInputStream(fileIn)).execute();

		String text = readFile(path + "output03.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

	@Test
	public void testChallengeTest04() throws Exception {

		File fileIn = new File(path + "input04.txt");
		new BotClean(new FileInputStream(fileIn), 3, false).execute();

		String text = readFile(path + "output04.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

	@Test
	public void testChallengeTest05() throws Exception {

		File fileIn = new File(path + "input05.txt");
		new BotClean(new FileInputStream(fileIn), 18, false).execute();

		String text = readFile(path + "output05.txt");
		Assert.assertEquals(text, systemOutRule.getLog());

	}

	@Test
	public void testChallengeTest06() throws Exception {

		File fileIn = new File(path + "input06.txt");
		new BotClean(new FileInputStream(fileIn), 25, false).execute();

		String text = readFile(path + "output06.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

}
