package jogodetabuleiro;

import javax.swing.text.Position;

public class Tabuleiro {

	private Integer linhas;
	private Integer colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(Integer linhas, Integer colunas) {
		if(linhas<1 || colunas<1) {
			throw new TabuleiroException("Erro criando o tabuleiro: é necessário que hava pelo menos uma linha e uma coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}
	public Integer getLinhas() {
		return linhas;
	}
	public Integer getColunas() {
		return colunas;
	}
	public Peca peca(int linha, int coluna) {
		if(!existePosi(linha,coluna)){
			throw new TabuleiroException("Não existe essa posição no tabuleiro");
		}
		return pecas[linha][coluna];
	}
	public Peca peca(Posicao posicao) {
		if(!existePosi(posicao)){
			throw new TabuleiroException("Não existe essa posição no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	public void placePeca(Peca peca,Posicao posicao) {
		if(temPeca(posicao)) {
			throw new TabuleiroException("Existe uma peça nessa posição "+ posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()]= peca;
		peca.posicao= posicao;
	}
	public boolean existePosi(int linha, int coluna) {
		return linha>=0 && linha<linhas && coluna>=0 && coluna<colunas;
	}
	
	public boolean existePosi(Posicao posicao) {
		return existePosi(posicao.getLinha(), posicao.getColuna());
	}
	public boolean temPeca(Posicao posicao) {
		if(!existePosi(posicao)) {
			throw new TabuleiroException("Não existe essa posição no tabuleiro");
		}
		return peca(posicao)!=null;
	}
	
	
}
