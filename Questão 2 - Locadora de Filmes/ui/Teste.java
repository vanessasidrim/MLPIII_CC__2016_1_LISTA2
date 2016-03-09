package br.unipe.mplIII.veiculo.ui;

import br.unipe.mplIII.veiculo.modelo.Pessoa;
import br.unipe.mplIII.veiculo.modelo.VeiculoDeCarga;
import br.unipe.mplIII.veiculo.modelo.VeiculoPasseio;

public class Teste {

	public static void main(String[] args) {
		
		//Teste Veiculo De Carga
		
		VeiculoDeCarga cargaTeste = new VeiculoDeCarga();
		Pessoa clienteCarga = new Pessoa("Jorge Luis Ferreira");
		
		cargaTeste.setMarca("Scania");
		cargaTeste.setModelo("Streamline");
		cargaTeste.setAno(2015);
		cargaTeste.setCapacidadeDeCarga(33200);
		cargaTeste.setKmInicial(14000);
		cargaTeste.setKmFinal(14730);
		cargaTeste.setChassi("9BV114HJ09C730001");
		cargaTeste.setPlaca("VCC 7348");
		cargaTeste.setValorKmRodado(11.30);
		cargaTeste.setValorLocacao(568.00);
		cargaTeste.setLocatario(clienteCarga);

		
		//Teste Veiculo Passeio
		
		VeiculoPasseio passeioTeste = new VeiculoPasseio();
		Pessoa clientePasseio = new Pessoa("Maria Eduarda Cavalcanti");
		
		passeioTeste.setMarca("Jeep");
		passeioTeste.setModelo("Renegate");
		passeioTeste.setAno(2016);
		passeioTeste.setKmInicial(3000);
		passeioTeste.setKmFinal(3437);
		passeioTeste.setChassi("9BJ110YJ09C280903");
		passeioTeste.setPlaca("JRP 6439");
		passeioTeste.setValorKmRodado(7.32);
		passeioTeste.setValorLocacao(234.00);
		passeioTeste.setArCondicionado(true);
		passeioTeste.setQtdPortas(4);
		passeioTeste.setLocatario(clientePasseio);
		
	}

}
