package main;

import java.util.Scanner;

public class Jogador {

	private char letra;
	private Mapa mapa;

	public Jogador(Mapa mapa) {
		this.mapa = mapa;
	}

	public boolean jogar(Scanner teclado) {
		letra = 'X';
		System.out.println("Jogador ..");
		System.out.print("	linha: ");
		int linha = teclado.nextInt();
		System.out.print("	coluna: ");
		int coluna = teclado.nextInt();

		boolean isPosicaoValida = mapa.jogar(linha, coluna, letra);

		while (!isPosicaoValida) 
			isPosicaoValida = mapa.jogar(linha, coluna, letra);

		if (mapa.verificarGanhador(letra)) {
			System.out.println("... Jogador GANHOU!");
			return true;
		} else {
			return false;
		}

	}
}
