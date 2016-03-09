package br.unipe.mplIII.data.ui;
import java.util.Scanner;

import br.unipe.mplIII.data.modelo.Data;

public class Teste {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int dia;
		int mes;
		int ano;
		
		System.out.println("Informe um dia:");
		dia = scan.nextInt();
		
		System.out.println("Informe um mês:");
		mes = scan.nextInt();

		System.out.println("Informe um ano:");
		ano = scan.nextInt();
		
		Data calendario = new Data(dia, mes, ano);
		
		calendario.setDia(dia);
		calendario.setMes(mes);
		calendario.setAno(ano);
		
		System.out.println(calendario);

	}

}
