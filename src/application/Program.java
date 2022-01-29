package application;

import java.util.Locale;
import java.util.Scanner;

import jogodetabuleiro.Posicao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Posicao pos = new Posicao(3,5);
		System.out.println(pos);
		

		
		
		
		sc.close();
	}

}
