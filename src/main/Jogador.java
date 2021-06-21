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
		int linha, coluna;
		boolean isValido = true;

		do {
			System.out.println("Jogador ..");
			System.out.print("	linha: ");
			linha = teclado.nextInt();
			System.out.print("	coluna: ");
			coluna = teclado.nextInt();
			
			if (linha >= 3 || linha < 0 || coluna >= 3 || coluna < 0) {
				isValido = false;
			} else if (mapa.jogar(linha, coluna, letra) == false) {
				System.out.println(" posição inválida!");
				isValido = false;
			} else {
				isValido = true;
			}
			
		} while (!isValido);

		if (mapa.verificarGanhador(letra)) {
			System.out.println("... Jogador GANHOU!");
			return true;
		} else {
			return false;
		}

	}
}
