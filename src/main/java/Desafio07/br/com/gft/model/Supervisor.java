package Desafio07.br.com.gft.model;

public class Supervisor extends Funcionario{
	
	private int qtdColaboradores;
	
	public Supervisor() {
		
	}

	public Supervisor(String nome, int idade, double salario, int qtdColaboradores) {
		super(nome, idade, salario);
		this.qtdColaboradores = qtdColaboradores;
	}

	public int getQtdColaboradores() {
		return qtdColaboradores;
	}

	public void setQtdColaboradores(int qtdColaboradores) {
		this.qtdColaboradores = qtdColaboradores;
	}
	
	@Override
	public double bonificacao() {
		this.setSalario(getSalario() + 5000.00); 
		return this.getSalario();
	}	
}
