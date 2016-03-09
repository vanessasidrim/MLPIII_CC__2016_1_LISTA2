package br.unipe.mplIII.locadora.modelo;
public class Autor {
	
	protected String autor;
	
	public Autor(String autor) {
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return autor;
	}

	
	
}
