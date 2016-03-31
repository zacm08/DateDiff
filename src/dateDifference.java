import java.util.Scanner;
import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
public class dateDifference {
 //imported joda.time since I kept getting slightly wrong answers with Java Date classes
	public static void main(String[] args) throws Exception  {
		
		String date1;
		String date2;
		//setting the date format for which the user should input
		DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyyMMdd");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Earlier Date (yyyyMMdd): ");
		date1 = in.nextLine();
		
		Scanner in2 = new Scanner(System.in);
		System.out.println("Enter Later Date (yyyyMMdd): ");
		date2 = in2.nextLine();
		
		//converting the input string to the corrected format
		final org.joda.time.DateTime d1 = dtf.parseDateTime(date1);
		final org.joda.time.DateTime d2 = dtf.parseDateTime(date2);

		//if d1 < d2 then code below
		if (d1.isBefore(d2)){
		    Interval interval = new Interval(d1, d2);
		    org.joda.time.Period period = interval.toPeriod();
		    System.out.println(period.getYears() + " years, " + period.getMonths() + " months, " + period.getWeeks() + " weeks, " + period.getDays() + " days");
		 //else printout d1>d2   		   
	} else{
		System.out.println("Please enter earlier date first");
	}
	}}
