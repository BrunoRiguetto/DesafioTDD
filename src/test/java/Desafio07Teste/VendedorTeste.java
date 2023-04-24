package Desafio07Teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Desafio07.br.com.gft.model.Vendedor;

public class VendedorTeste {

	@Test
	void deveCalcularBonificacaoDoVendedor() throws Exception {
		Vendedor vendedor = new Vendedor("Bruna", 25, 3000.00, "interno");
		vendedor.bonificacao();
		Assertions.assertEquals(6000.0, vendedor.getSalario(), 0.0001);
	}
}

