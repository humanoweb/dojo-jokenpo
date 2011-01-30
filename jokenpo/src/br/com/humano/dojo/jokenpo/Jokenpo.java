package br.com.humano.dojo.jokenpo;

public class Jokenpo {

	public static final int TESOURA = 3;
	public static final int PAPEL   = 2;
	public static final int PEDRA	= 1;
	
	public static final int GANHOU = 1;
	public static final int PERDEU = -1;
	public static final int EMPATOU = 0;
	
	public static int rodada(int jogador1, int jogador2) {
		// TESOURA > PAPEL > PEDRA > TESOURA
		if(jogador1 == PEDRA && jogador2 == TESOURA) {
			return GANHOU;
		} else if(jogador1 == TESOURA && jogador2 == PEDRA) {
			return PERDEU;
		} else if(jogador1 > jogador2) {
			return GANHOU;
		} else if(jogador1 < jogador2) {
			return PERDEU;
		} else {
			return EMPATOU;
		}
		
//		switch (jogador1) {
//			case PEDRA:
//				if(jogador2 == TESOURA) {
//					return GANHOU;		
//				}
//				if(jogador2 == PAPEL) {
//					return PERDEU;
//				}
//				break;
//			case TESOURA:
//				if(jogador2 == PEDRA) {
//					return PERDEU;
//				}
//				if (jogador2 == PAPEL) {
//					return GANHOU;
//				}
//				break;
//			case PAPEL:
//				if(jogador2 == PEDRA) {
//					return GANHOU;
//				}
//				if(jogador2 == TESOURA) {
//					return PERDEU;
//				}
//				break;
//		}
//		
//		return 0;
	}

}
