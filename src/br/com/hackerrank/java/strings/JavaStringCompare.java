package br.com.hackerrank.java.strings;

import java.util.Scanner;
import java.util.TreeSet;

public class JavaStringCompare {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
//	    String s = "welcometojava";
//	    int j = 3;
	    Scanner sc=new Scanner(System.in);
	    String s = sc.next();
	    int j = sc.nextInt();
        
        TreeSet<String> list = new TreeSet<String>();
        
        for (int i = 0; i < s.length(); i++) {
        	if (i + j > s.length()) {
        		break;
        	} else {
        		list.add(s.substring(i, i+j));
        	}
		}
        
        System.out.println(list.first());
        System.out.println(list.last());
			
        
        sc.close();
    }

}
