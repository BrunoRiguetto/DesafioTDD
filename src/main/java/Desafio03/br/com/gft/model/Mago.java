package Desafio03.br.com.gft.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {

	private List<Magia> magias = new ArrayList<Magia>();

	Random random = new Random();

	public Mago() {
	}

	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	public List<Magia> getMagia() {
		return magias;
	}

	@Override
	public void lvlUp() {
		setLevel(getLevel() + 1);
		setVida(getVida() + 50);
		setMana(getMana() + 10);
		setXp(getXp() + 5);
		setInteligencia(getInteligencia() + 10);
		setForca(getForca() + 5);
	}

	public void attack(Guerreiro guerreiro) {
		int numero = random.nextInt(300);
		int ataque = (this.getInteligencia() * this.getLevel()) + numero;
		guerreiro.setVida(getVida() - ataque);
	}

	public void aprenderMagia(Magia magia) {
		this.magias.add(magia);
	}

	public void listaMagia() {
		if (magias.isEmpty()) {
			System.out.println("O mago " + this.getNome() + " não possui magias.");
			System.out.println("---------------------------------------------");
		} else {
			System.out.println("O mago " + this.getNome() + " possui as seguintes magias: ");
			magias.forEach(System.out::print);
			System.out.println("---------------------------------------------");
		}
	}

	@Override
	public String toString() {
		return "\nMago: " + this.getNome() + "\n Level: " + this.getLevel() + "\n Vida: " + this.getVida() + "\n Mana: "
				+ this.getMana() + "\n XP: " + this.getXp() + "\n Inteligencia: " + this.getInteligencia()
				+ "\n Força: " + this.getForca() + "\n---------------------------------------------";
	}
}
