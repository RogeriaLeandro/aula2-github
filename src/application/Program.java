package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {	
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		//acrescentando horas no dia
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		//obtendo unidadee de tempo
		int minutes = cal.get(Calendar.MINUTE); 
		System.out.println("Minutes: " + minutes);
		
		int hours = cal.get(Calendar.HOUR); 
		System.out.println("Hours: " + (hours - 1));
		
		int month = cal.get(Calendar.MONTH); 
		System.out.println("Month: " + (month + 1));
		
		//inclusão de comentário para git.
		
		// inclusão de comentário para git 2.
	
		// inclusão de comentário para git 3.

	}

}
