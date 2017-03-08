package br.com.hackerrank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class InitialTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	protected String readFile(String file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		StringBuilder stringBuilder = new StringBuilder();
		String ls = System.getProperty("line.separator");

		try {
			while ((line = reader.readLine()) != null) {
				stringBuilder.append(line);
				stringBuilder.append(ls);
			}

			return stringBuilder.toString();
		} finally {
			reader.close();
		}
	}

	protected String readFile1(String file) throws IOException {
		String text = readFile(file);
		if (text.endsWith("\r\n"))
			text = text.substring(0, text.length() - 2);

		return text;
	}
	
	protected String retirarQuebras(String valor) {
		try {
			String s = valor.replaceAll("\r", "");
			String x = s.replaceAll("\r", "");
			String y = x.replaceAll("\n", "");
			
			return y;
			
		} catch (Exception e) {
			e.printStackTrace();
			return valor;
		}
	}

}
