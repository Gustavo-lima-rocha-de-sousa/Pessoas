package modulo.data;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEmJava6 {

	public static void main(String[] args) throws ParseException {
	
		LocalDate localDate = LocalDate.now();
		System.out.println("Data Atual: " + localDate.format
				(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana: " + 
		localDate.getDayOfWeek().name());
		
		System.out.println("Dia do m�s: " + 
				localDate.getDayOfMonth());
		
		System.out.println("Dia do ano: " + 
				localDate.getDayOfYear());
		
		System.out.println("M�s: " + 
				localDate.getMonth());
		
		System.out.println("Dia do ano: " + 
				localDate.getYear());
		
	}
}
