package br.com.hackerrank.challenges.carrier;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Assert;
import org.junit.Test;

import br.com.hackerrank.InitialTest;

public class TestCarrier1 extends InitialTest {

	String pasta = "tests/Challenge/Carrier1/";

	@Test
	public void testChallenge() throws Exception {
		super.pasta = pasta;

		while (novoTeste()) {
			File fileIn = new File(linkIn);
			new Carrier1(new FileInputStream(fileIn)).execute();

			String text = readFile(linkOut);
			Assert.assertEquals(text, systemOutRule.getLog());
		}
	}

}
