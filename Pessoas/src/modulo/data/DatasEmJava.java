package modulo.data;

import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: " + date.getTime() );
		System.out.println("Dia do m�s: " + date.getDate() );
		System.out.println("Dia da semana: " + date.getDay() );
		System.out.println("Hora do dia: " + date.getHours() + ":"+ date.getMinutes() + ":" + date.getSeconds() );
		System.out.println("Ano: " + (date.getYear() + 1900));
	}
	
}
