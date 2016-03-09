package br.unipe.mplIII.locadora.modelo;

public class FitaInfantil extends Fita {

	public void setPrecoDeLocacao(double precoDeLocacao) {
		super.setPrecoDeLocacao(precoDeLocacao - (precoDeLocacao * 0.4));
	}

}

	

