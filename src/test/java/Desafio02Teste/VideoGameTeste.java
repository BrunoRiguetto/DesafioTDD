package Desafio02Teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Desafio02.br.com.gft.model.VideoGame;

public class VideoGameTeste {
	
	private VideoGame videoGame;
	
	@BeforeEach
	public void setup() {
		videoGame = new VideoGame();
		videoGame.setNome("PS4");
		videoGame.setModelo("Slim");
		videoGame.setPreco(1000.00);
	}
	
	@Test
	void deveCalcularImpostoParaVideoGameUsado() throws Exception {
		videoGame.setUsado(true);
		Assertions.assertEquals(250.0, videoGame.calculaImposto());
	}
	
	@Test
	void deveCalcularImpostoParaVideoGameNovo() throws Exception {
		videoGame.setUsado(false);
		Assertions.assertEquals(450.0, videoGame.calculaImposto());
	}
}
