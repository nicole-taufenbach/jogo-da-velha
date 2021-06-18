package main;

public class PC {

	private Mapa jogoMapa;
	private char letra = 'O';

	public PC(Mapa jogoMapa) {
		this.jogoMapa = jogoMapa;
	}

	public boolean jogar() {
		int linha = jogoMapa.sortear(0, 3);
		int coluna = jogoMapa.sortear(0, 3);
		boolean isPosicaoValida = jogoMapa.jogar(linha, coluna, letra);

		while (!isPosicaoValida) {
			linha = jogoMapa.sortear(0, 3);
			coluna = jogoMapa.sortear(0, 3);
			isPosicaoValida = jogoMapa.jogar(linha, coluna, letra);
		}

		//PC[0,0]
		System.out.println("PC[" + linha + "," + coluna + "]");
		
		if (jogoMapa.verificarGanhador(letra)) {
			System.out.println("... PC GANHOU!");
			return true;
		} else {
			return false;
		}
	}
}
