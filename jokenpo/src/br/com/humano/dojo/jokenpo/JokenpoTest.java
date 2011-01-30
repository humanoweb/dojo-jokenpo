package br.com.humano.dojo.jokenpo;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Simular um jogo de Jokenpo entre 2 jogadores para determinar quem eh o vencedor.
 * @author rodrigo.ferreira
 *
 */
public class JokenpoTest {

	@Test
	public void pedraGanhaDeTesoura() {
		Assert.assertEquals(Jokenpo.GANHOU, Jokenpo.rodada(Jokenpo.PEDRA, Jokenpo.TESOURA));
	}
	
	@Test
	public void pedraPerdeDePapel() {
		Assert.assertEquals(Jokenpo.PERDEU, Jokenpo.rodada(Jokenpo.PEDRA, Jokenpo.PAPEL));
	}
	
	@Test
	public void pedraEmpataComPedra() {
		Assert.assertEquals(Jokenpo.EMPATOU, Jokenpo.rodada(Jokenpo.PEDRA, Jokenpo.PEDRA));
	}
	
	@Test
	public void tesouraPerderDePedra() {
		Assert.assertEquals(Jokenpo.PERDEU, Jokenpo.rodada(Jokenpo.TESOURA, Jokenpo.PEDRA));
	}
	
	@Test
	public void tesouraGanharDePapel() {
		Assert.assertEquals(Jokenpo.GANHOU, Jokenpo.rodada(Jokenpo.TESOURA, Jokenpo.PAPEL));
	}
	
	@Test
	public void tesouraEmpataComTesoura() {
		Assert.assertEquals(Jokenpo.EMPATOU, Jokenpo.rodada(Jokenpo.TESOURA, Jokenpo.TESOURA));
	}
	
	@Test
	public void papelGanhaDePedra() {
		Assert.assertEquals(Jokenpo.GANHOU, Jokenpo.rodada(Jokenpo.PAPEL, Jokenpo.PEDRA));
	}
	
	@Test
	public void papelPerdeDeTesoura() {
		Assert.assertEquals(Jokenpo.PERDEU, Jokenpo.rodada(Jokenpo.PAPEL, Jokenpo.TESOURA));
	}
	
	@Test
	public void papelEmpataComPapel() {
		Assert.assertEquals(Jokenpo.EMPATOU, Jokenpo.rodada(Jokenpo.PAPEL, Jokenpo.PAPEL));
	}
}
