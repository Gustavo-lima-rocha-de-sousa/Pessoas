package modulo.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = 
				new SimpleDateFormat("dd/MM/yyyy");
		Date dataVencimentoBoleto = simpleDateFormat.parse("30/11/2021");
		
		Date dataAtualHoje = simpleDateFormat.parse("29/11/2021");
		
		if(dataVencimentoBoleto.after(dataAtualHoje)) {
			System.out.println("Boleto não vencido.");
						
		}else {
			System.out.println("Boleto Vencido - Urgente");
			
			}
		
		}
	}
	

