package br.com.hackerrank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class InitialTest {

	private int contador = 1;
	protected String linkIn;
	protected String linkOut;
	protected String pasta;

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

	protected boolean novoTeste() {
		systemOutRule.clearLog();
		linkIn = pasta + "input" + String.format("%03d", contador) + ".txt";
		linkOut = pasta + "output" + String.format("%03d", contador) + ".txt";
		contador++;
		boolean resultado = false;

		try {
			BufferedReader reader = new BufferedReader(new FileReader(linkIn));
			BufferedReader readerOut = new BufferedReader(new FileReader(linkOut));
			if (reader != null && readerOut != null) {
				resultado = true;
			}

			reader.close();
			readerOut.close();

		} catch (Exception e) {
		}

		return resultado;
	}

}
