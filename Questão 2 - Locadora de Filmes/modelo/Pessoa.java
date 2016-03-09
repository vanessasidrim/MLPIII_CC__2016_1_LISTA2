package br.unipe.mplIII.veiculo.modelo;

public class Pessoa {
	
	protected String proprietario;
	
	public Pessoa(){
	}

	public Pessoa(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String toString() {
		return "Pessoa [proprietario=" + proprietario + "]";
	}
	
}
