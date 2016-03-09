package br.unipe.mplIII.locadora.modelo;

public class Fita {
	
	protected String titulo;
	protected double precoDeLocacao;
	protected Genero categoria;
	protected Autor criador;
	
	public Fita(){
	}

	public Fita(String titulo, double precoDeLocacao, Genero categoria, Autor criador) {
		this.titulo = titulo;
		this.precoDeLocacao = precoDeLocacao;
		this.categoria = categoria;
		this.criador = criador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecoDeLocacao() {
		return precoDeLocacao;
	}

	public void setPrecoDeLocacao(double precoDeLocacao) {
		this.precoDeLocacao = precoDeLocacao;
	}

	public Genero getCategoria() {
		return categoria;
	}

	public void setCategoria(Genero categoria) {
		this.categoria = categoria;
	}

	public Autor getCriador() {
		return criador;
	}

	public void setCriador(Autor criador) {
		this.criador = criador;
	}

	public String toString() {
		return "Titulo = " + titulo + ", Preço de Locação = " + precoDeLocacao +  ", Gênero = " + categoria
				+ ", Autor = " + criador;
	}
	

}
	

