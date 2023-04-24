package Desafio07.br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import Desafio07.br.com.gft.model.Gerente;
import Desafio07.br.com.gft.model.Supervisor;
import Desafio07.br.com.gft.model.Vendedor;

public class Main {

	public static void main(String[] args) {
			
		Gerente g1 = new Gerente("Antonio", 49, 12000.00, "Qualidade");
		Gerente g2 = new Gerente("Maria", 45, 12500.00, "Logistica");
		Gerente g3 = new Gerente("Sonia", 55, 18500.00, "Geral");
		
		Supervisor s1 = new Supervisor("João", 36, 7500.00, 10);
		Supervisor s2 = new Supervisor("Rubens", 41, 8200.00, 15);
		Supervisor s3 = new Supervisor("Joana", 35, 7500.00, 12);

		Vendedor v1 = new Vendedor("Bruna", 25, 3200.00, "interno");
		Vendedor v2 = new Vendedor("Lucas", 26, 3500.00, "externo");
		Vendedor v3 = new Vendedor("Kleber", 28, 3700.00, "externo");

		List<Gerente> gerentes = new ArrayList<>();
		gerentes.add(g1);
		gerentes.add(g2);
		gerentes.add(g3);
		
		List<Supervisor> supervisores = new ArrayList<>();
		supervisores.add(s1);
		supervisores.add(s2);
		supervisores.add(s3);
		
		List<Vendedor> vendedores = new ArrayList<>();
		vendedores.add(v1);
		vendedores.add(v2);
		vendedores.add(v3);
		
		for(Gerente gt : gerentes) {
			System.out.println("Gerente: "+ gt.getNome() + ", Idade: " + gt.getIdade() + " da area: " + gt.getArea() + " salário com bonificação: "	+ gt.bonificacao());
		}
		System.out.println("-------------------------------------------------------------------------------------");
		
		for(Supervisor sp : supervisores) {
			System.out.println("Supervisor(a): "+ sp.getNome() + ", Idade: " + sp.getIdade() + ", supervisiona: " + sp.getQtdColaboradores() + " colaboradores,  salário com bonificação: " + sp.bonificacao());
		}
		System.out.println("-------------------------------------------------------------------------------------");
		
		for(Vendedor vd : vendedores) {
			System.out.println("Vendedor(a): "+ vd.getNome() + ", Idade: " + vd.getIdade() + ", do setor: " + vd.getSetor() + ",  salário com bonificação: " + vd.bonificacao());
		}
	}
}