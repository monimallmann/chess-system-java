package xadrez;

import jogodetabuleiro.Posicao;
import jogodetabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {

	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		configInicial();
	}
	public PecaXadrez[][]getPecas(){
		PecaXadrez[][]mat = new PecaXadrez [tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i=0; i<tabuleiro.getLinhas(); i++) {
			for(int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez) tabuleiro.peca(i,j);
			}
		}
		return mat;
	}
	private void configInicial() {
		tabuleiro.placePeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2,1));
		tabuleiro.placePeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(0,5));
		tabuleiro.placePeca(new Rei(tabuleiro, Cor.BRANCO), new Posicao(6,4));
	}
	
}
