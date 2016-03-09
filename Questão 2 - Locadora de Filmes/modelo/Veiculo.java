package br.unipe.mplIII.veiculo.modelo;

public class Veiculo {
	
	protected String placa;
	protected String marca;
	protected String modelo;
	protected String chassi;
	protected int ano; 
	protected double valorKmRodado;
	protected int kmInicial;
	protected int kmFinal;
	protected double valorLocacao;
	protected Pessoa locatario;
	
	public Veiculo(){
	}
	
	public Veiculo(String placa, String marca, String modelo, String chassi, int ano, int valorKmRodado, int kmInicial,
			int kmFinal, double valorLocacao, Pessoa locatario) {
		
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.chassi = chassi;
		this.ano = ano;
		this.valorKmRodado = valorKmRodado;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
		this.valorLocacao = valorLocacao;
		this.locatario = locatario;
		
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValorKmRodado() {
		return valorKmRodado;
	}

	public double setValorKmRodado(double valorKmRodado) {
		return this.valorKmRodado = valorKmRodado;
	}

	public int getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}

	public int getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
	
	public Pessoa getLocatario() {
		return locatario;
	}

	public void setLocatario(Pessoa locatario) {
		this.locatario = locatario;
	}
	
	
	public String toString() {
		return "Veiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", chassi=" + chassi + ", ano="
				+ ano + ", valorKmRodado=" + valorKmRodado + ", kmInicial=" + kmInicial + ", kmFinal=" + kmFinal
				+ ", valorLocacao=" + valorLocacao + ", locatario=" + locatario + "]";
	
	}
}