package Desafio02Teste;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Desafio02.br.com.gft.model.Livro;
import Desafio02.br.com.gft.model.Loja;
import Desafio02.br.com.gft.model.VideoGame;

public class LojaTeste {
	
	private Loja loja;

	
	@BeforeEach
	public void setup() {
		loja = new Loja();

	}
	
	@Test
	void deveVerificarSeAListaDeLivrosEstaVazia() throws Exception {
		loja.getLivros();
		Assertions.assertNull(loja.getLivros());
		
	}
	
	@Test
	void deveVerificarSeAListaDeLivrosEstaCheia() throws Exception {
		Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
		Livro l2 = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
		Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);
		List<Livro> livros = List.of(l1, l2, l3);
		
		loja.getLivros();
		Assertions.assertNotNull(livros);
	}
	
	@Test
	void deveVerificarSeAListaDeVideoGamesEstaVazia() throws Exception {
		Assertions.assertNull(loja.getVideoGames());
	}
	
	@Test
	void deveVerificarSeAListaDeVideoGamesEstaCheia() throws Exception {
		VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
		VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);
		List<VideoGame> videoGame = List.of(ps4, ps4Usado, xbox);
		Assertions.assertNotNull(videoGame);
	}
	
	@Test
	void deveCalcularOPatrimonioDaLoja() throws Exception {
		Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
		Livro l2 = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
		Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);
		List<Livro> livros = List.of(l1, l2, l3);
		loja.setLivros(livros);
		VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
		VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);
		List<VideoGame> videoGame = List.of(ps4, ps4Usado, xbox);
		loja.setVideoGames(videoGame);
		
		Assertions.assertEquals(941800.0, loja.calculaPatrimonio());
	}
}
