package br.com.hackerrank;

public class Teste {

	public static void main(String[] args) {
		String os = "<Numero>8-1687177283-1</Numero>";
		
		System.out.println(getTagValue(os));
		

	}
	
	public static String getTagValue(String xml){
		try {
			String tagName = "Numero";
			String numero =  xml.split("<"+tagName+">")[1].split("</"+tagName+">")[0];
			return " <== " + numero;
			
		} catch (Exception e) {
			return "";
		}
	}

}
