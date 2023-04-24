package Desafio02.br.com.gft.model;

import java.util.List;

public class Loja {

	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGames;
	
	public Loja() {
	}
	
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	public String listaLivros() {
		String lista = null;
		if(this.getLivros().isEmpty()) {
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("A loja " + this.getNome() + " não tem livros no seu estoque.");
		}else {
			System.out.println("-------------------------------------------------------------------------------");
			lista = "A loja " + this.getNome() + " possui estes livros para venda: ";
			livros.forEach(System.out::print);
		}
		return lista;
	}
	
	public void listaVideoGame() {
		if(this.getVideoGames().isEmpty()) {
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("A loja " + this.getNome() + " não tem video-games no seu estoque.");
		}else {
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("A loja " + this.getNome() + " possui estes video-games para venda: ");
			videoGames.forEach(System.out::print);
		}
	}
	
	public double calculaPatrimonio() {
		double patrimonioLivros = 0.0;
		double patrimonioTotal = 0.0;
		for (Livro valorTotalLivros : livros) {
			patrimonioLivros = valorTotalLivros.getPreco() * valorTotalLivros.getQtd();
			patrimonioTotal += patrimonioLivros;
		}
		double patrimonioGames = 0.0;
		for (VideoGame valorTotalGames : videoGames) {
			patrimonioGames = valorTotalGames.getPreco() * valorTotalGames.getQtd();
			patrimonioTotal += patrimonioGames;
		}
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("O patrimonio da loja: " + this.nome + " é de R$ " + patrimonioTotal);
		return patrimonioTotal;
	}
}