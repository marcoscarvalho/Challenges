package br.com.hackerrank.algorithms.dynamicprogramming.advanced;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class VimWar {

	public static void main(String[] args) {
		new VimWar().execute();
	}

	private InputStream systemIn;

	public VimWar() {
		this(System.in);
	}

	public VimWar(InputStream in) {
		systemIn = in;
	}

	/*
	 * Vim War
	 * 
	 * He can choose a non-empty subset of soldiers from a set of N soldiers
	 * (numbered from 1 to N). Each soldier has some subset of skills out of
	 * M different skills (numbered from 1 to M). The skill-set of an army is
	 * the union of skill-sets of its constituent soldiers. To win the war, Vim
	 * needs to know how many different subsets of soldiers satisfy his
	 * skill-set requirement. Since the answer can be huge, print it modulo
	 * 10^9 +7.
	 */
	public void execute() {
		Scanner in = new Scanner(systemIn);
		
		/*
		 *  the number of soldiers to choose from
		 *  
		 *  número de soldados para escolher
		 */
		
		int n = in.nextInt(); // 1 <= n <= 10^5 
		
		// the number of different skills possible 
		int m = in.nextInt(); // 1 <= m <= 20 different skills
		
		/*
		 * characters each
		 * 
		 * If the j^th character of the i^th line is 1, then the i^th soldier
		 * possess the j^th skill and if it is 00, then not.
		 * 
		 * Se o j^th caractere da linha i^th é 1, então o i^th soldado
		 * possuir o j^th habilidade e se é 00, então não.
		 */
		List<Integer> mBoolean = new LinkedList<Integer>();
		
		for (int i = 0; i < n; i++) {
			mBoolean.add(in.nextInt());
			in.nextLine();
		}
		
		/*
		 * The last line contains M boolean characters denoting the requirement
		 * skill-set of Vim where the jth character being 1 signifies that Vim
		 * wants the jth skill to be present in his final army and not,
		 * otherwise.
		 * 
		 * A última linha contém M personagens que denotam a exigência
		 * conjunto de habilidades do Vim onde o personagem jth sendo 1
		 * significa que Vim quer a habilidade jth de estar presente em seu
		 * exército final e não, caso contrário.
		 */
		int mCharacters = in.nextInt();
		
		in.close();
		
		
		
	}
}
