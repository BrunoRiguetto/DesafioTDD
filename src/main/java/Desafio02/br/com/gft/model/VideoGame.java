package Desafio02.br.com.gft.model;

import Desafio01.br.com.gft.exceptions.BusinessException;
import Desafio02.br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto{
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	public VideoGame() {
	}

	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}
	
	@Override
	public double calculaImposto() {
		double valorImposto = 0.0;
		try {
			if(this.isUsado == true) {
				valorImposto = this.getPreco() * 0.25;
				System.out.println("Imposto " + this.getNome() + " " + this.getModelo() +" usado, R$ " + valorImposto + ".");
			}else {
				valorImposto = this.getPreco() * 0.45;
				System.out.println("Imposto " + this.getNome() + " " + this.getModelo() + " R$ " + valorImposto + ".");
			}				
		}catch (BusinessException e) {
			System.out.println(e.getMessage());
		}		
		return valorImposto;
	}
	
	@Override
	public String toString() {
		return "Video-game: " 
			+ this.getNome()
			+ " "
			+ this.getModelo()
			+ " , preço: "
			+ this.getPreco()
			+ " , quantidade: "
			+ this.getQtd()
			+ " em estoque.\n";
	}	
}
