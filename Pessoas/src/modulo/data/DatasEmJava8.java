package modulo.data;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava8 {

	public static void main(String[] args) throws ParseException {
	
		LocalDate dataAntiga = LocalDate.parse("2019-10-05");
		
		LocalDate dataNova = LocalDate.parse("2021-10-10");
		
		System.out.println("Data amtiga ? maior que data nova: " 
		+ dataAntiga.isAfter(dataNova));
		
		
		System.out.println("Data amtiga ? anterior a data nova: " 
				+ dataAntiga.isBefore(dataNova));
		
		System.out.println("Datas s?o iguais? " + dataAntiga.isEqual(dataNova) );
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias: " + periodo.getDays());
		
		System.out.println("Quantos Meses: " + periodo.getMonths());
		
		System.out.println("Quantos Anos: " + periodo.getYears() );
		
		System.out.println("Somente Meses: " + periodo.toTotalMonths());
		
		System.out.println("Periodo ?: " + periodo.getYears() + " Anos, "  + periodo.getMonths() + 
				" Meses e " + periodo.getDays() +" Dias." );
		
		
		
	}
}