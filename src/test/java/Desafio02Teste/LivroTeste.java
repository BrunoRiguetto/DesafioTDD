package Desafio02Teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Desafio02.br.com.gft.exceptions.BusinessException;
import Desafio02.br.com.gft.model.Livro;

public class LivroTeste {

	private Livro livro;
	
	@BeforeEach
	public void setup() {
		livro = new Livro();
	}
	
	@Test
	void deveCalcularImpostoDeLivrosNãoEducativos() throws Exception {
		livro.setTema("fantasia");
		livro.setNome("Senhor dos Anéis");
		livro.setPreco(60.0);
		Assertions.assertEquals(6.00, livro.calculaImposto());
	}
	
	@Test
	void naodeveCalcularImpostoDeLivrosEducativos() throws Exception {
		try {
			livro.setTema("educativo");
			livro.setNome("Java POO");
			livro.calculaImposto();
		} catch (BusinessException e) {
			String message = e.getMessage();
			Assertions.assertEquals("Livro educativo não tem imposto: ", message);
		}
	}
}
