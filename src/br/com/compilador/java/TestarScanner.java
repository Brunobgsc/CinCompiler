package br.com.compilador.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestarScanner {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence and press Enter");
		
		String sentence = scanner.nextLine();
		String sentence1 = scanner.nextLine();
		String sentence2 = scanner.nextLine();
		String sentence3 = scanner.nextLine();
		
		String[] str = { sentence };
		for (int i = 0; i < str.length; i++) {
			if (str[i].matches("inicio")) {
				System.out.println(str[i]);
			} else if (str[i] != "inicio") {
				System.err.println("Erro");
			}
			String[] str1 = { sentence1 };
			for (int a = 0; a < str1.length; a++) {
				if (str1[a].matches("[0-9]+([+|*|/|-])+[0-9]+")) {
					System.out.println(str1[a]);
				} else if (str1[a] != "[0-9]+[+|*|-]+[0-9]+") {
					System.err.println("Erro");
				}
				String[] str2 = { sentence2 };
				for (int b = 0; b < str2.length; b++) {
					if (str2[b].matches("saida")) {
						System.out.println(str2[b]);
					} else if (str2[b] != "saida") {
						System.err.println("Erro");
					}
					String[] str3 = { sentence3 };
					for (int c = 0; c < str3.length; c++) {
						if (str3[c].matches("fim")) {
							System.out.println(str3[c]);
						} else if (str3[c] != "fim") {
							System.err.println("Erro");
						}
					}
				}
			}

		}
	}
}