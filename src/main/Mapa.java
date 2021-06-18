package main;

public class Mapa {

	private char[][] mapa = new char[3][3];

	public int sortear(int inicio, int fim) {
		return (int) ((Math.random() * fim) - inicio);
	}

	public void limpar() {
		for (int l = 0; l < 3; l++)
			for (int c = 0; c < 3; c++)
				mapa[l][c] = ' ';
	}

	public void desenhar(int jogada) {
		System.out.println("------------- .. jogada: " + jogada);
		System.out.println("| " + mapa[0][0] + " | " + mapa[0][1] + " | " + mapa[0][2] + " |");
		System.out.println("-------------");
		System.out.println("| " + mapa[1][0] + " | " + mapa[1][1] + " | " + mapa[1][2] + " |");
		System.out.println("-------------");
		System.out.println("| " + mapa[2][0] + " | " + mapa[2][1] + " | " + mapa[2][2] + " |");
		System.out.println("----------------------------");
	}

	public boolean jogar(int l, int c, char jogador) {
		boolean isCelulaValida = false;
		
	 if (mapa[l][c] != 'O' && mapa[l][c] != 'X') {
			isCelulaValida = true;
			mapa[l][c] = jogador;
		}
	 
		return isCelulaValida;
	}

	public boolean verificarGanhador(char jogador) {
		boolean jogadorVenceu = false;
		
			if ((mapa[0][0] == jogador && mapa[0][1] == jogador && mapa[0][2] == jogador) || 
				(mapa[1][0] == jogador && mapa[1][1] == jogador && mapa[1][2] == jogador) ||
				(mapa[2][0] == jogador && mapa[2][1] == jogador && mapa[2][2] == jogador)) 
				jogadorVenceu = true;
			                                        
			if ((mapa[0][0] == jogador && mapa[1][0] == jogador && mapa[0][2] == jogador) || 
				(mapa[0][1] == jogador && mapa[1][1] == jogador && mapa[1][2] == jogador) ||
				(mapa[0][2] == jogador && mapa[1][2] == jogador && mapa[2][2] == jogador)) 
				jogadorVenceu = true;               
			
			if ((mapa[0][2] == jogador && mapa[1][1] == jogador && mapa[2][0] == jogador) || 
				(mapa[0][1] == jogador && mapa[1][1] == jogador && mapa[2][2] == jogador)) 
				jogadorVenceu = true;               

		return jogadorVenceu;
	}

}
