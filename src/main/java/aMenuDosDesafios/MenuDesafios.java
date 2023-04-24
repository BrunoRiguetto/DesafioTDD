package aMenuDosDesafios;

import java.util.Scanner;

public class MenuDesafios {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem-vindo aos desafios de TDD.");
		System.out.println("Autor: Bruno Riguetto");
		System.out.print("Qual desafio deseja selecionar? Digite 1, 2, 3 ou 7: ");
		int numDesafio = sc.nextInt();

		switch (numDesafio) {
		case 1:
			System.out.println();
			System.out.println("Desafio 01: Veículo");
			System.out.println("-------------------------------------------------------------------------------");
			Desafio01.br.com.gft.main.Main.main(args);
			break;

		case 2:
			System.out.println();
			System.out.println("Desafio 02: Loja");
			System.out.println("-------------------------------------------------------------------------------");
			Desafio02.br.com.gft.main.Main.main(args);
			break;

		case 3:
			System.out.println();
			System.out.println("Desafio 03: Jogo RPG");
			System.out.println("-------------------------------------------------------------------------------");
			Desafio03.br.com.gft.main.Main.main(args);
			break;

		case 7:
			System.out.println();
			System.out.println("Desafio 07: Funcionário");
			System.out.println("-------------------------------------------------------------------------------------");
			Desafio07.br.com.gft.main.Main.main(args);
			break;
			
		default:
			System.out.println("Não existe exercicio com esse número.");
			break;
		}
		sc.close();
	}
}
