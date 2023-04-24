package Desafio01.br.com.gft.model;

import Desafio01.br.com.gft.exceptions.BusinessException;

public class Veiculo {
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private Double preco;

	public Veiculo() {
	}

	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, Double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public void acelerar() {
		this.velocidade += 20;
		System.out.println("O carro acelerou mais 20km/h. A velocidade atual e de: " + this.velocidade + " km/h.");
	}

	public int abastecer(int combustivel) {
		try {
			if (combustivel > 60 - this.litrosCombustivel) {
				throw new BusinessException("Não é possível abastecer essa quantidade.");
			} else {
				this.litrosCombustivel += combustivel;
				System.out.println("Abastecimento concluido, o tanque de combustivel tem: " + this.litrosCombustivel
						+ " litros de combustivel.");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		return this.litrosCombustivel;
	}

	public int frear() {
		try {
			if (velocidade > 0) {
				this.velocidade -= 20;
				System.out.println("Freio acionado, a velocidade atual do veiculo e de: " + this.velocidade + " km/h.");
			} else {
				throw new BusinessException("O Veiculo já está parado!");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		return this.velocidade;
	}

	public void pintar(String cor) {
		this.cor = cor;
		System.out.println("A cor do veiculo foi alterada para: " + this.cor + ".");
	}

	public void ligar() {
		if (isLigado == true) {
			System.out.println("O veiculo ja esta ligado!");
		} else {
			this.isLigado = true;
			System.out.println("Veiculo ligado.");
		}
	}

	public boolean desligar() {
		try {
			if (isLigado == true && velocidade == 0) {
				this.isLigado = false;
				System.out.println("O Veiculo foi desligado!");
			} else if (isLigado == true && velocidade > 0) {
				throw new BusinessException("Não é possível parar, veículo ainda em movimento.");
			} else if (isLigado == false) {
				System.out.println("Veiculo ja esta desligado.");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		return this.isLigado;
	}

}