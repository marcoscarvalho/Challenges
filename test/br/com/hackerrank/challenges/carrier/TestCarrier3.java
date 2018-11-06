package br.com.hackerrank.challenges.carrier;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Assert;
import org.junit.Test;

import br.com.hackerrank.InitialTest;

public class TestCarrier3 extends InitialTest {

	String pasta = "tests/Challenge/Carrier3/";

	@Test
	public void testChallenge() throws Exception {
		super.pasta = pasta;

		while (novoTeste()) {
			File fileIn = new File(linkIn);
			new Carrier3(new FileInputStream(fileIn)).execute();

			String text = readFile(linkOut);
			Assert.assertEquals(text, systemOutRule.getLog());
		}
	}

}
