package Desafio01Teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Desafio01.br.com.gft.exceptions.BusinessException;
import Desafio01.br.com.gft.model.Veiculo;

public class VeiculoTeste {

	private Veiculo veiculo;

	@BeforeEach
	public void setup() {
		veiculo = new Veiculo("Ford", "Fusion", "FDK-6754", "vermelho", 0, true, 0, 100, 110000.00);

	}

	@Test
	void deveAcelerarOVeiculo() throws Exception {
		int valorEsperado = 120;
		veiculo.acelerar();
		Assertions.assertEquals(valorEsperado, veiculo.getVelocidade());
	}

	@Test
	void deveAbastecerOVeiculoComQuantidadeCorreta() throws Exception {
		int quantidade = 60;
		int valorEsperado = 60;
		veiculo.abastecer(quantidade);
		Assertions.assertEquals(valorEsperado, veiculo.getLitrosCombustivel());
	}

	@Test
	void naoDeveAbastecerOVeiculiComQuantidadeAMais() throws Exception {
		try {
			veiculo.abastecer(70);
		} catch (BusinessException e) {
			String message = e.getMessage();
			Assertions.assertEquals("Não é possível abastecer essa quantidade.", message);
		}
	}

	@Test
	void deveFrearOVeiculo() throws Exception {
		int valorEsperado = 80;
		veiculo.frear();
		Assertions.assertEquals(valorEsperado, veiculo.getVelocidade());
	}

	@Test
	void naoDeveFrearSeOVeiculoEstiverParado() throws Exception {
		try {
			veiculo.setVelocidade(0);
			veiculo.frear();

		} catch (BusinessException e) {
			String message = e.getMessage();
			Assertions.assertEquals("O Veiculo já está parado!", message);
		}
	}

	@Test
	void deveLigarOVeiculo() throws Exception {
		boolean valorEsperado = true;
		veiculo.ligar();
		Assertions.assertEquals(valorEsperado, veiculo.isLigado());
	}

	@Test
	void deveDesligarOVeiculoQuandoAVelocidadeForZero() throws Exception {
		boolean valorEsperado = false;
		veiculo.setVelocidade(0);
		veiculo.desligar();
		Assertions.assertEquals(valorEsperado, veiculo.isLigado());
	}

	@Test
	void naodeveDesligarSeOVeiculoEstiverEmMovimento() throws Exception {
		try {
			veiculo.desligar();
		} catch (BusinessException e) {
			String message = e.getMessage();
			Assertions.assertEquals("Não é possível parar, veículo ainda em movimento.", message);
		}
	}
}
