package Desafio03.br.com.gft.model;

public class Magia {

	private String magia;

	public Magia(String magia) {
		this.magia = magia;
	}

	public String getMagia() {
		return magia;
	}

	public void setMagia(String magia) {
		this.magia = magia;
	}

	@Override
	public String toString() {
		return  magia + "\n";
	}	
}
