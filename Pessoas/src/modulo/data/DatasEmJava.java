package modulo.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
				
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: " + date.getTime() );
		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());
		
		System.out.println("Dia do mês: " + date.getDate() );
		System.out.println("Dia do Mês em Calendar: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Dia da semana: " + date.getDay() );
		System.out.println("Dia da semana em Calendar: " + (calendar.get(Calendar.DAY_OF_WEEK) -1));
		
		System.out.println("Hora do dia: " + date.getHours() + ":"+ date.getMinutes() + ":" + date.getSeconds() );
		System.out.println("Hora Calendar: " + calendar.get(Calendar.HOUR_OF_DAY) + ":"+ calendar.get(Calendar.MINUTE)
		+":"+ calendar.get(Calendar.SECOND));
		
		System.out.println("Ano: " + (date.getYear() + 1900));
		System.out.println("Ano em Calendar:" + calendar.get(Calendar.YEAR) );
		
		/*----------------Simple Date Format---------------*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println("Data atual em formato padrao e String: " + simpleDateFormat.format(date));
		System.out.println("Data atual em Calendar formato padrao e String: " + simpleDateFormat.format(calendar.getTime()));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		System.out.println("Data atual em formato para banco de dados: " + simpleDateFormat.format(date));
		System.out.println("Data atual em Calendar formato para banco de dados: " + simpleDateFormat.format(calendar.getTime()));
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("18/10/1987"));
		
	}
	
}
