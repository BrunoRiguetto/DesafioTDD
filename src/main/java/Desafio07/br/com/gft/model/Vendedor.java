package Desafio07.br.com.gft.model;

public class Vendedor extends Funcionario{
	
	private String setor;
	
	public Vendedor() {
	}

	public Vendedor(String nome, int idade, double salario, String setor) {
		super(nome, idade, salario);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	@Override
	public double bonificacao() {
		this.setSalario(getSalario() + 3000.00);
		return this.getSalario();
	}	
	
	@Override
	public String toString() {
		return "Vendedor: "
				+ this.getNome()
				+ ", Idade: "
				+ this.getIdade()
				+ " do setor: "
				+ this.getSetor()
				+ ", salário com bonificação: "
				+ this.getSalario()
				+ ".\n";
	}	
}
