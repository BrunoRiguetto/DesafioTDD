package Desafio01.br.com.gft.main;

import Desafio01.br.com.gft.model.Veiculo;

public class Main {

	public static void main(String[] args) throws Exception {
		
		String marca = "Ford";
		String modelo = "Fusion";
		String placa = "FDK-6754";
		String cor = "vermelho";
		float km = 0;
		boolean isLigado = true;
		int litrosCombustivel = 30;
		int velocidade = 100;
		Double preco = 110000.00;
		
		Veiculo veiculo1 = new Veiculo(marca,modelo,placa,cor,km,isLigado,litrosCombustivel,velocidade,preco);
		
		veiculo1.pintar(cor);
		veiculo1.ligar();
		veiculo1.abastecer(30);
		veiculo1.acelerar();
		veiculo1.frear();
		veiculo1.acelerar();
		veiculo1.desligar();			
		
	}
}