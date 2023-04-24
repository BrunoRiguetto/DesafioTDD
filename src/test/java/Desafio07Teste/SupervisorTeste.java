package Desafio07Teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Desafio07.br.com.gft.model.Supervisor;

public class SupervisorTeste {
	
	@Test
	void deveCalcularBonificacaoDoSupervisor() throws Exception {
		Supervisor supervisor = new Supervisor("João", 36, 5000.00, 10);
		supervisor.bonificacao();
		Assertions.assertEquals(10000.0, supervisor.getSalario(), 0.0001);
	}
}

