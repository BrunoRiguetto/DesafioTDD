package Desafio03.br.com.gft.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {

	private List<Habilidade> habilidades = new LinkedList<>();

	Random random = new Random();

	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	public List<Habilidade> getHabilidade() {
		return habilidades;
	}

	@Override
	public void lvlUp() {
		setVida(getVida() + 100);
		setMana(getMana() + 5);
		setXp(getXp() + 5);
		setInteligencia(getInteligencia() + 5);
		setForca(getForca() + 10);
		setLevel(getLevel() + 1);
	}

	public void attack(Mago mago) {
		int numero = random.nextInt(300);
		int ataque = (this.getForca() * this.getLevel()) + numero;
		mago.setVida(getVida() - ataque);
	}

	public void aprenderHabilidade(Habilidade habilidade) {
		this.habilidades.add(habilidade);
	}

	public void listaHabilidade() {
		if (habilidades.isEmpty()) {
			System.out.println("O guerreiro " + this.getNome() + " não possui habilidades.");
			System.out.println("---------------------------------------------");
		} else {
			System.out.println("O guerreiro " + this.getNome() + " possui as seguintes habilidades: ");
			habilidades.forEach(System.out::print);
			System.out.println("---------------------------------------------");
		}
	}

	@Override
	public String toString() {
		return "\nGuerreiro: " + this.getNome() + "\n Level: " + this.getLevel() + "\n Vida: " + this.getVida()
				+ "\n Mana: " + this.getMana() + "\n XP: " + this.getXp() + "\n Inteligencia: " + this.getInteligencia()
				+ "\n Força: " + this.getForca() + "\n---------------------------------------------";
	}
}