package br.unipe.mplIII.locadora.modelo;

public class FitaLancamento extends Fita {

	public void setPrecoDeLocacao(double precoDeLocacao) {
		super.setPrecoDeLocacao(precoDeLocacao + (precoDeLocacao * 0.2));
	}
}
