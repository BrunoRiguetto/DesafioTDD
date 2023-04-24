package Desafio07.br.com.gft.model;

public class Gerente extends Funcionario{

	private String area;

	public Gerente(String nome, int idade, double salario, String area) {
		super(nome, idade, salario);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public double bonificacao() {
		this.setSalario(getSalario() + 10000.0);
		return this.getSalario();
	}	
}