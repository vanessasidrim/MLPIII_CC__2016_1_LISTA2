package br.unipe.mplIII.veiculo.modelo;

public class VeiculoPasseio extends Veiculo{

	boolean arCondicionado;
	int qtdPortas;
	
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	public int getQtdPortas() {
		return qtdPortas;
	}
	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	
	
	public String toString() {
		return "VeiculoPasseio [arCondicionado=" + arCondicionado + ", qtdPortas=" + qtdPortas + "]";
	}

}
