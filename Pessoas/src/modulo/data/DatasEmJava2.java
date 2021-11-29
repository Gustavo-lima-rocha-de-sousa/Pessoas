package modulo.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava2 {
		public static void main(String[] args) throws ParseException {
			
		Calendar calendar = Calendar.getInstance();	
			
			calendar.setTime( new SimpleDateFormat("dd-MM-yyyy").parse("29-11-2021"));/*Definindo uma data qualquer*/


			calendar.add(calendar.DAY_OF_MONTH, -40);
			
			System.out.println("Somando dia do Mês: " +  new SimpleDateFormat("dd-MM-yyyy").
					format(calendar.getTime()));
			
			calendar.add(calendar.MONTH, 1);
			System.out.println("Somando um mês: " + new SimpleDateFormat("dd-MM-yyyy").
					format(calendar.getTime()));
			
			calendar.add(calendar.YEAR, 1);
			System.out.println("Somando o ano: " + new SimpleDateFormat("dd-MM-yyyy").
					format(calendar.getTime()));
			
		}
}
