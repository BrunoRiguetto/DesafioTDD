package Desafio03Teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Desafio03.br.com.gft.model.Guerreiro;
import Desafio03.br.com.gft.model.Mago;
import Desafio03.br.com.gft.model.Personagem;

public class PersonagemTeste {

	Mago mago1;
	Mago mago2;
	Mago mago3;
	Guerreiro guerreiro1;
	Guerreiro guerreiro2;
	Guerreiro guerreiro3;
	
	@BeforeEach
	public void setup() {
		mago1 = new Mago("Gandalf o Branco", 10000, 80, 50f, 60, 80, 10);
		mago2 = new Mago("Radagast o Castanho", 10000, 60, 30f, 70, 50, 6);
		mago3 = new Mago("Saruman", 10000, 80, 50f, 90, 80, 9);
		guerreiro1 = new Guerreiro("Aragorn", 10000, 40, 30f, 50, 40, 6);
		guerreiro2 = new Guerreiro("Legolas", 10000, 50, 50f, 60, 50, 5);
		guerreiro3 = new Guerreiro("Gimli", 10000, 40, 20f, 40, 30, 4);
	}
	
	@Test
	void deveVerificarQuantosPersonagemForamCriados() throws Exception {
		Assertions.assertEquals(6, Personagem.ProximoPersonagem());	
		}
}
