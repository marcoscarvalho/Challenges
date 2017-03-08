package br.com.hackerrank.crackingthecodinginterview;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Assert;
import org.junit.Test;

import br.com.hackerrank.InitialTest;

public class TestArraysLeftRotation extends InitialTest {

	private final String path = "tests/crackingthecodinginterview/ArraysLeftRotation/";

	@Test
	public void test01() throws Exception {

		File fileIn = new File(path + "input01.txt");
		new ArraysLeftRotation(new FileInputStream(fileIn)).execute();

		String text = readFile1(path + "output01.txt");
		Assert.assertEquals(retirarQuebras(text), retirarQuebras(systemOutRule.getLog()));
	}

	@Test
	public void test02() throws Exception {
		
		File fileIn = new File(path + "input02.txt");
		new ArraysLeftRotation(new FileInputStream(fileIn)).execute();
		
		String text = readFile1(path + "output02.txt");
		Assert.assertEquals(retirarQuebras(text), retirarQuebras(systemOutRule.getLog()));
	}

}
