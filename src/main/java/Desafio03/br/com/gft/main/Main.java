package Desafio03.br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import Desafio03.br.com.gft.model.Guerreiro;
import Desafio03.br.com.gft.model.Habilidade;
import Desafio03.br.com.gft.model.Magia;
import Desafio03.br.com.gft.model.Mago;
import Desafio03.br.com.gft.model.Personagem;

public class Main {

	public static void main(String[] args) {
				
		Mago mago1 = new Mago("Gandalf o Branco", 10000, 80, 50f, 60, 80, 10);
		Mago mago2 = new Mago("Radagast o Castanho", 10000, 60, 30f, 70, 50, 6);
		Mago mago3 = new Mago("Saruman", 10000, 80, 50f, 90, 80, 9);
		Guerreiro guerreiro1 = new Guerreiro("Aragorn", 10000, 40, 30f, 50, 40, 6);
		Guerreiro guerreiro2 = new Guerreiro("Legolas", 10000, 50, 50f, 60, 50, 5);
		Guerreiro guerreiro3 = new Guerreiro("Gimli", 10000, 40, 20f, 40, 30, 4);

		List<Mago> magos = new ArrayList<>();
		magos.add(mago1);
		magos.add(mago2);
		magos.add(mago3);
		
		List<Guerreiro> guerreiros = new ArrayList<>();
		guerreiros.add(guerreiro1);
		guerreiros.add(guerreiro2);
		guerreiros.add(guerreiro3);
		
		mago1.lvlUp();
		mago2.lvlUp();
		mago3.lvlUp();
		guerreiro1.lvlUp();
		guerreiro2.lvlUp();
		guerreiro3.lvlUp();
		
		mago1.attack(guerreiro1);
		mago2.attack(guerreiro2);
		guerreiro1.attack(mago1);
		guerreiro2.attack(mago3);
		
		mago1.aprenderMagia(new Magia("Invocar Águias Gigantes"));
		mago1.aprenderMagia(new Magia("Esquentar metal"));
		mago1.aprenderMagia(new Magia("Super luz"));
		mago2.aprenderMagia(new Magia("Entender animais"));
		mago2.aprenderMagia(new Magia("Anular encantamento"));
				
		guerreiro1.aprenderHabilidade(new Habilidade("Ouvir pedras"));
		guerreiro1.aprenderHabilidade(new Habilidade("Desvendar pistas"));
		guerreiro2.aprenderHabilidade(new Habilidade("Deslizar com escudo"));
		guerreiro2.aprenderHabilidade(new Habilidade("Escalar Olifantes"));
		guerreiro2.aprenderHabilidade(new Habilidade("Super leveza"));		
				
		System.out.println(mago1);
		mago1.listaMagia();
		System.out.println(mago2);
		mago2.listaMagia();
		System.out.println(mago3);
		mago3.listaMagia();
		System.out.println(guerreiro1);
		guerreiro1.listaHabilidade();
		System.out.println(guerreiro2);
		guerreiro2.listaHabilidade();
		System.out.println(guerreiro3);
		guerreiro3.listaHabilidade();
		
		System.out.println("Total de personagens criados: " + Personagem.ProximoPersonagem());
	}
}
