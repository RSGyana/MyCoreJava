package in.nit.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class dateTime {

	public static void main(String[] args) {
		/*
		 * LocalDate d=LocalDate.now(); 
		 * System.out.println(d); //2020-06-05 int
		 * month=d.getDayOfMonth(); 
		 * int day=d.getDayOfYear(); int
		 * curdate=d.getMonthValue();
		 *  System.out.println(curdate);//6
		 * System.out.println(month);//5
		 *  System.out.println(day); //157 int
		 * year=d.getYear();//2020 System.out.println(year);
		 * 
		 * LocalTime t=LocalTime.now(); //here we will see at a time hh:mm::ss:ns
		 * System.out.println(t); //00:15:45.882445
		 * 
		 * //but we can print separately also int h=t.getHour(); int m=t.getMinute();
		 * int s=t.getSecond(); int ns=t.getNano();
		 * System.out.printf("%d %d %d %d",h,m,s,ns);
		 */
		LocalDate birthday=LocalDate.of(1995, 07, 1);
		LocalDate today=LocalDate.now();
		Period p=Period.between(birthday, today);
		System.out.printf("the age of ur is %d-%d-%d",p.getYears(),p.getMonths(),p.getDays());
	}

}
