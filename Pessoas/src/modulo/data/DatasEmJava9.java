package modulo.data;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava9 {

	public static void main(String[] args) throws ParseException, InterruptedException {		
		
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		
		for (int mes = 1; mes<=12; mes++) {
			dataBase.plusMonths(1);
			
			int valor = 25000/12;
			
			System.out.println("Data de vencimento boleto: " + dataBase.format
					(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + 
					" do Mês: " + mes + " e o valor é de: " + valor);
		}
	}
}
