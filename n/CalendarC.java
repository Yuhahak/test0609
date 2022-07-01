package project2;

import java.util.Calendar;

public class CalendarC {
	public static String getDay(int d) {
		String [] day = {"일요일 ", "월요일 ", "화요일 ", "수요일 ", "목요일 ", "금요일 ", "토요일 "};
		return day[d-1];
	}
	
	public static String time(int d) {
		if(d > 12) {
			return "오후";
		}
		else
			return "오전";
	}
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.get(Calendar.YEAR)+"년 " + (c.get(Calendar.MONTH)+1) + 
				"월 "+ c.get(Calendar.DATE)+"일");
		System.out.println(getDay(c.get(Calendar.DAY_OF_WEEK)) + 
				time(c.get(Calendar.HOUR_OF_DAY)));
		System.out.println(c.get(Calendar.HOUR)+"시 "+c.get(Calendar.MINUTE)+"분 "
				+c.get(Calendar.SECOND)+"초");
	}
}
