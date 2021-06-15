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
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.println(" |" + mapa[l][c] + " | " + mapa[l][c] + " | " + mapa[l][c] + " | ");
				System.out.println("-------------");
				System.out.println("|" + mapa[l][c] + "|" + mapa[l][c] + " | " + mapa[l][c] + " | ");
				System.out.println("-------------");
				System.out.println("|" + mapa[l][c] + "|" + mapa[l][c] + " | " + mapa[l][c] + " | ");
			}
		}
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
		int jogada = 0;
		boolean jogadorVenceu = false;
		for (int i = 0; i < mapa.length; i++) {
			jogada++;
			if (mapa[0][i] == jogador && mapa[0][i] == jogador && mapa[0][i] == jogador) {
				jogadorVenceu = true;
			} else if (mapa[1][i] == jogador && mapa[1][i] == jogador && mapa[1][i] == jogador) {
				jogadorVenceu = true;
			} else if (mapa[2][i] == jogador && mapa[2][i] == jogador && mapa[2][i] == jogador) {
				jogadorVenceu = true;
			} else if (mapa[0][0] == jogador && mapa[1][1] == jogador && mapa[2][2] == jogador) {
				jogadorVenceu = true;
			} else if (mapa[0][2] == jogador && mapa[1][1] == jogador && mapa[2][0] == jogador) {
				jogadorVenceu = true;
			} else if (mapa[0][i] == jogador && mapa[0][i] == jogador && mapa[0][i] == jogador) {
				jogadorVenceu = true;
			} else if (mapa[1][i] == jogador && mapa[1][i] == jogador && mapa[1][i] == jogador) {
				jogadorVenceu = true;
			} else if (mapa[2][i] == jogador && mapa[2][i] == jogador && mapa[2][i] == jogador) {
				jogadorVenceu = true;
			} else if (jogada == 9) {
				System.out.println("Empate");
				return jogadorVenceu;
			}
		}
		return jogadorVenceu;
	}

}
