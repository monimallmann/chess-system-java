package application;

import java.util.Locale;
import java.util.Scanner;

import jogodetabuleiro.Tabuleiro;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Tabuleiro tabuleiro = new Tabuleiro(8,5);

		
		
		
		sc.close();
	}

}
