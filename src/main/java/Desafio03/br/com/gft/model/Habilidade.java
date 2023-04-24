package Desafio03.br.com.gft.model;

public class Habilidade {
	
	public String habilidade;

	public Habilidade(String habilidade) {
		this.habilidade = habilidade;
	}

	public String getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}

	@Override
	public String toString() {
		return  habilidade + "\n";
	}	
}
