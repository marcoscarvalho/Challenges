package br.com.hackerrank.challenges.daysofcode.day08;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesAndMaps {

	public static void main(String[] args) {
		new DictionariesAndMaps().execute();
	}

	private InputStream systemIn;

	public DictionariesAndMaps() {
		this(System.in);
	}

	public DictionariesAndMaps(InputStream in) {
		systemIn = in;
	}

	public void execute() {
		Scanner in = new Scanner(systemIn);

		Map<String, Integer> map = new HashMap<String, Integer>();

		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			map.put(name, phone);
		}

		while (in.hasNext()) {
			String s = in.next();
			// Write code here
			
			if(map.containsKey(s)) {
				System.out.println(s + "=" + map.get(s));
			} else {
				System.out.println("Not found");
			}
			
		}

		in.close();
	}
}
