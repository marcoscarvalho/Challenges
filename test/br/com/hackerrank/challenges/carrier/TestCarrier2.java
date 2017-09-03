package br.com.hackerrank.challenges.carrier;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Assert;
import org.junit.Test;

import br.com.hackerrank.InitialTest;
import br.com.hackerrank.challenges.carrier.Carrier2;

public class TestCarrier2 extends InitialTest {

	String pasta = "tests/Challenge/Carrier2/";

	@Test
	public void testChallenge() throws Exception {
		super.pasta = pasta;

		while (novoTeste()) {
			File fileIn = new File(linkIn);
			new Carrier2(new FileInputStream(fileIn)).execute();

			String text = readFile(linkOut);
			Assert.assertEquals(text, systemOutRule.getLog());
		}
	}

}
