package modulo.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava4 {

	public static void main(String[] args) throws ParseException {
	
	Date dateInicial = new SimpleDateFormat("dd/MM/yyyy").parse("29/11/2021");
		
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(dateInicial);
		
	for(int parcela = 1; parcela <= 12; parcela++ ) {
		calendar.add(calendar.MONTH, 1);
		
		System.out.println("A parcela de número: " + parcela + " Vence dia: " +
				new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}
	}	
}
