package main;

import java.util.Scanner;


public class JogoDaVelha {
	
	private Mapa jogoMapa;
	private PC jogoPC;
	private Jogador jogoJogador;
	
	private JogoDaVelha() {
		Scanner teclado = new Scanner(System.in);
		
		char isJogarNovamente = 's';
		jogoMapa = new Mapa();
		jogoPC = new PC(jogoMapa);
		jogoJogador = new Jogador(jogoMapa);
		
		while (Character.toLowerCase(isJogarNovamente) == 's') {
			jogar(teclado);
			System.out.print("Deseja jogar novamente (s/n)?");
			isJogarNovamente = teclado.next().charAt(0);
		}
		teclado.close();
	}

	private void jogar(Scanner teclado) {
		int jogada = 0;
		jogoMapa.limpar();
		// 1 2 3 
		// 4 5 6 
		// 7 8 9
		// (9) Possibilidades
		int sorteio = jogoMapa.sortear(0,2); //0,1 | O PC vai ser 0 e o Jogador 1; //
		while (jogada <= 9) {
			
			if (sorteio == 1) {
				jogoJogador.jogar(teclado);
				jogoMapa.desenhar(jogada);
				jogada++;
			} else {
				jogoPC.jogar();
				jogoMapa.desenhar(jogada);
				jogada++;
			}
		}
	}

	public static void main(String[] args) {
		new JogoDaVelha();
	}
}
