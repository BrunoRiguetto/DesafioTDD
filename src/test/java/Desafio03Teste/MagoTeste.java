package Desafio03Teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Desafio03.br.com.gft.model.Magia;
import Desafio03.br.com.gft.model.Mago;

public class MagoTeste {
	
	Mago mago1;
	Mago mago3;
		
	@BeforeEach
	public void setup() {
		mago1 = new Mago("Gandalf o Branco", 10000, 80, 50f, 60, 80, 10);
	}	

	@Test
	void deveSubirDeNivel() throws Exception {
		mago1.lvlUp();
		Assertions.assertEquals(11, mago1.getLevel());
	}
	
	@Test
	void deveSubirVida() throws Exception {
		mago1.lvlUp();
		Assertions.assertEquals(10050, mago1.getVida());
	}
	
	@Test
	void deveSubirMana() throws Exception {
		mago1.lvlUp();
		Assertions.assertEquals(90, mago1.getMana());
	}

	@Test
	void deveSubirXp() throws Exception {
		mago1.lvlUp();
		Assertions.assertEquals(55f, mago1.getXp());
	}
	
	@Test
	void deveSubirInteligencia() throws Exception {
		mago1.lvlUp();
		Assertions.assertEquals(70, mago1.getInteligencia());
	}
	
	@Test
	void deveSubirForca() throws Exception {
		mago1.lvlUp();
		Assertions.assertEquals(85, mago1.getForca());
	}
	
	@Test
	void deveAprenderMagia() throws Exception {
		mago1.aprenderMagia(new Magia("Invocar Águias Gigantes"));
		mago1.aprenderMagia(new Magia("Esquentar metal"));
		mago1.aprenderMagia(new Magia("Super luz"));
		Assertions.assertNotNull(mago1.getMagia());
	}
	
	@Test
	void deveVerificarSeAListaDeMagiasEstaVazia() throws Exception {
		Assertions.assertTrue(mago1.getMagia().isEmpty());
	}
	
	@Test
	void deveVerificarSeAListaDeMagiasContemElementos() throws Exception {
		mago1.aprenderMagia(new Magia("Invocar Águias Gigantes"));
		mago1.aprenderMagia(new Magia("Esquentar metal"));
		mago1.aprenderMagia(new Magia("Super luz"));
		Assertions.assertNotNull(mago1.getMagia());
	}
}
