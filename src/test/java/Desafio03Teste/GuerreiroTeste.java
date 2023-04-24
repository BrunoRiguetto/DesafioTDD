package Desafio03Teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Desafio03.br.com.gft.model.Guerreiro;
import Desafio03.br.com.gft.model.Habilidade;

public class GuerreiroTeste {
	
	Guerreiro guerreiro1;
	
	@BeforeEach
	public void setup() {
		guerreiro1 = new Guerreiro("Aragorn", 10000, 40, 30f, 50, 40, 6);
	}	

	@Test
	void deveSubirDeNivel() throws Exception {
		guerreiro1.lvlUp();
		Assertions.assertEquals(7, guerreiro1.getLevel());
	}
	
	@Test
	void deveSubirVida() throws Exception {
		guerreiro1.lvlUp();
		Assertions.assertEquals(10100, guerreiro1.getVida());
	}
	
	@Test
	void deveSubirMana() throws Exception {
		guerreiro1.lvlUp();
		Assertions.assertEquals(45, guerreiro1.getMana());
	}

	@Test
	void deveSubirXp() throws Exception {
		guerreiro1.lvlUp();
		Assertions.assertEquals(35f, guerreiro1.getXp());
	}
	
	@Test
	void deveSubirInteligencia() throws Exception {
		guerreiro1.lvlUp();
		Assertions.assertEquals(55, guerreiro1.getInteligencia());
	}
	
	@Test
	void deveSubirForca() throws Exception {
		guerreiro1.lvlUp();
		Assertions.assertEquals(50, guerreiro1.getForca());
	}
	@Test
	void deveAprenderHabilidade() throws Exception {
		guerreiro1.aprenderHabilidade(new Habilidade("Invocar Águias Gigantes"));
		guerreiro1.aprenderHabilidade(new Habilidade("Esquentar metal"));
		guerreiro1.aprenderHabilidade(new Habilidade("Super luz"));
		Assertions.assertNotNull(guerreiro1.getHabilidade());
	}
	
	@Test
	void deveVerificarSeAListaDeHabilidadesEstaVazia() throws Exception {
		Assertions.assertTrue(guerreiro1.getHabilidade().isEmpty());
	}
	
	@Test
	void deveVerificarSeAListaDeHabilidadesContemElementos() throws Exception {
		guerreiro1.aprenderHabilidade(new Habilidade("Invocar Águias Gigantes"));
		guerreiro1.aprenderHabilidade(new Habilidade("Esquentar metal"));
		guerreiro1.aprenderHabilidade(new Habilidade("Super luz"));
		Assertions.assertNotNull(guerreiro1.getHabilidade());
	}
	
}