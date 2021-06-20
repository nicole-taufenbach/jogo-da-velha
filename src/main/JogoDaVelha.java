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
			System.out.print("Deseja jogar novamente (s/n)? ");
			isJogarNovamente = teclado.next().charAt(0);
		}
		teclado.close();
	}

	private void jogar(Scanner teclado) {
		boolean ganhou = false;
		boolean isJogador = false;
		int jogada = 0;
		int sorteio = jogoMapa.sortear(0,2); // PC = 0 || Jogador = 1
		jogoMapa.limpar();
		
		if (sorteio == 1) {
			isJogador = true;
		}
		
		while (jogada <= 9) {
			
			if (jogada == 9) {
				jogoMapa.desenhar(jogada);
				System.out.println("Empate");
				break;
			}
			
			jogoMapa.desenhar(jogada); //Vai desenhar normalmente o mapa a cada jogada.
			
			if (isJogador) {
				ganhou = jogoJogador.jogar(teclado);
				jogada++;
				isJogador = false;
				if (ganhou) {
					jogoMapa.desenhar(jogada); // Se o jogador ganhou, imprime o mapa final e termina o laço.
					break;
				}

				
			} else {
				ganhou = jogoPC.jogar();
				jogada++;
				isJogador = true;
				if (ganhou) {
					jogoMapa.desenhar(jogada); // Mesmo funcionamento para o PC
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		new JogoDaVelha();
	}
}
