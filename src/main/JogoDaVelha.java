package main;

import java.util.Scanner;

public class JogoDaVelha {

	public JogoDaVelha() {
		Scanner teclado = new Scanner(System.in);

		// Mapa jogoMapa = new Mapa();
		// PC jogoPC = new PC(jogoMapa);
		// Jogador jogoJogador = new Jogador(jogoMapa);

		char isJogarNovamente = teclado.next().charAt(0);

		if (isJogarNovamente == 's') {
			jogar(teclado);
		}
	}

	private void jogar(Scanner teclado) {
		// int jogada;
		// jogoMapa.limpar();
		// jogoMapa.sortear(0,2); //0,1,2 | 0,1,2 | O PC vai ser 0 e o Jogador 1; //
		// jogoMapa.desenhar(jogada);
		// TODO: verificar qual laço utilizar para fazer a alternância entre jogador e pc;
	}

	public static void main(String[] args) {
		new JogoDaVelha();
	}
}
