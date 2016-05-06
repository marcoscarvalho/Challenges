package br.com.hackerrank.artificialintelligence.botbuilding;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Assert;
import org.junit.Test;

import br.com.hackerrank.InitialTest;

public class TestBotSavesPrincess2 extends InitialTest {

	private final String path = "tests/ArtificialIntelligence/BotBuilding/BotSavesPrincess2/";

	@Test
	public void testChallengeTest01() throws Exception {

		File fileIn = new File(path + "input01.txt");
		new BotSavesPrincess2(new FileInputStream(fileIn)).execute();

		String text = readFile(path + "output01.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

}
