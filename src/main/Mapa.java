package main;

public class Mapa {

	private char[][] mapa;

	public int sortear(int inicio, int fim) {
		return (int) ((Math.random() * fim) - inicio);
	}

	public void limpar() {
		System.out.println(" ");
	}

	public void desenhar(int jogada) {
		System.out.println("-------------");
		System.out.println("|   |   |   |");
		System.out.println("-------------");
		System.out.println("|   |   |   |");
		System.out.println("-------------");
		System.out.println("|   |   |   |");
		System.out.println("----------------------------");
	}

	public boolean jogar(int l, int c, char jogador) {
		boolean isCelulaLivre = false;

		if (mapa[l][c] != 'O' || mapa[l][c] != 'X') {
			isCelulaLivre = true;
			mapa[l][c] = jogador;
		}

		return isCelulaLivre;
	}

	public boolean verificarGanhador(char jogador) {
		return false;
	}

}
