package modulo.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DatasEmJava3 {

	public static void main(String[] args) throws ParseException {
	
	/*Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").*/
			/*parse("01/02/2021");*/
			
	long dias = ChronoUnit.MONTHS.between(LocalDate.parse("2020-04-01"), 
			LocalDate.now()); /*total de dias de uma data ate hoje*/
	
	System.out.println("Possuí: " + dias + " dias entre a faixa de data.");
		
	}
}