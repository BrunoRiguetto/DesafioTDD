package Desafio07Teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Desafio07.br.com.gft.model.Gerente;

public class GerenteTeste {

	@Test
	void deveCalcularBonificacaoDoGerente() throws Exception {
		Gerente gerente = new Gerente("Antonio", 49, 12000.00, "Qualidade");
		gerente.bonificacao();
		Assertions.assertEquals(22000.0, gerente.getSalario(), 0.0001);
	}
}
