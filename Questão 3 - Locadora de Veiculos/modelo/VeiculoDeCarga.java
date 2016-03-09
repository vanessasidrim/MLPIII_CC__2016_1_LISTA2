package br.unipe.mplIII.veiculo.modelo;
public class VeiculoDeCarga extends Veiculo {
	
	protected int capacidadeDeCarga;

	public int getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}

	public void setCapacidadeDeCarga(int capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}

	@Override
	public String toString() {
		return "VeiculoDeCarga [capacidadeDeCarga=" + capacidadeDeCarga + "]";
	}
	
	
	
	
}	
	




