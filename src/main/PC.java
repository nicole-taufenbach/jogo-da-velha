package main;

public class PC {

	private Mapa mapa;
	private char letra = 'O';

	public PC(Mapa mapa) {
		this.mapa = mapa;
	}

	public boolean jogar() {
		int linha = mapa.sortear(0, 3);
		int coluna = mapa.sortear(0, 3);
		boolean isPosicaoValida = mapa.jogar(linha, coluna, letra);

		while (!isPosicaoValida) {
			linha = mapa.sortear(0, 3);
			coluna = mapa.sortear(0, 3);
			isPosicaoValida = mapa.jogar(linha, coluna, letra);
		}

		//PC[0,0]
		System.out.println("PC[" + linha + "," + coluna + "]");
		
		if (mapa.verificarGanhador(letra)) {
			System.out.println("... PC GANHOU!");
			return true;
		} else {
			return false;
		}
	}
}
