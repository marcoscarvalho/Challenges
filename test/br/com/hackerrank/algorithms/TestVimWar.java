package br.com.hackerrank.algorithms;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Assert;
import org.junit.Test;

import br.com.hackerrank.InitialTest;
import br.com.hackerrank.algorithms.dynamicprogramming.advanced.VimWar;

public class TestVimWar extends InitialTest {

	@Test
	public void testChallengeTest01() throws Exception {

		File fileIn = new File("tests/VimWar/input01.txt");
		new VimWar(new FileInputStream(fileIn)).execute();

		String text = readFile("tests/VimWar/output01.txt");
		Assert.assertEquals(text, systemOutRule.getLog());
	}

}
