package br.com.hackerrank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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

}
