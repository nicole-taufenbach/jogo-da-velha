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
		boolean isJogadaValida = true;
		
		System.out.println("Jogador ..");
		System.out.print("	linha: ");
		int linha = teclado.nextInt();
		System.out.print("	coluna: ");
		int coluna = teclado.nextInt();
		
		if (linha >= 3 || linha < 0 || coluna >= 3 || coluna < 0) 
			isJogadaValida = false;
		else if ((mapa.jogar(linha, coluna, letra)) == false) 
			isJogadaValida = false;
		
		while (!isJogadaValida) {
			System.out.println("Jogador ..");
			System.out.print("	linha: ");
			linha = teclado.nextInt();
			System.out.print("	coluna: ");
			coluna = teclado.nextInt();
			isJogadaValida = mapa.jogar(linha, coluna, letra);
			break;
		}

		if (mapa.verificarGanhador(letra)) {
			System.out.println("... Jogador GANHOU!");
			return true;
		} else {
			return false;
		}
		
	}
}
