package application;

import java.util.Locale;
import java.util.Scanner;

import jogodetabuleiro.Tabuleiro;
import xadrez.PartidaDeXadrez;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
		IU.printTabuleiro (partidaDeXadrez.getPecas());

		
		
		
		sc.close();
	}

}
