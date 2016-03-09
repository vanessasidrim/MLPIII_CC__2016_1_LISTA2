package br.unipe.mplIII.data.modelo;

public class Data {
	
	public int dia;
	public int mes;
	public int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
		if(this.dia < 1 || this.dia > 31)
			System.out.println("Data Inválida");
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
		if(this.mes < 1 || this.mes > 12)
			System.out.println("Data Inválida");
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
		if(this.ano < 0)
			System.out.println("Data Inválida");
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
	

	
	
	
	

}
