package br.com.hackerrank.challenges.daysofcode.day28;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RegExPatterns {

	private InputStream systemIn;

	public RegExPatterns() {
		this(System.in);
	}

	public RegExPatterns(InputStream in) {
		systemIn = in;
	}

	public static void main(String[] args) {
		new RegExPatterns().execute();
	}

	public void execute() {

		Scanner sc = new Scanner(systemIn);

		int scenarios = sc.nextInt();
		sc.nextLine();
		List<Usuario> list = new ArrayList<Usuario>();

		for (int i = 0; i < scenarios; i++) {
			String[] as = sc.nextLine().split(" ");
			list.add(new Usuario(as[0], as[1]));
		}
		
		Collections.sort(list);

		for (Usuario usuario : list) {
			if (usuario.getEmail().endsWith("@gmail.com"))
				System.out.println(usuario.getName());
		}

		sc.close();
	}

}

class Usuario implements Comparable<Usuario> {
	private String name;
	private String email;

	public Usuario(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int compareTo(Usuario o) {
		return getName().compareToIgnoreCase(o.getName());
	}
}