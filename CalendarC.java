package project2;

import java.util.Calendar;

public class CalendarC {
	public static String getDay(int d) {
		String [] day = {"�Ͽ��� ", "������ ", "ȭ���� ", "������ ", "����� ", "�ݿ��� ", "����� "};
		return day[d-1];
	}
	
	public static String time(int d) {
		if(d > 12) {
			return "����";
		}
		else
			return "����";
	}
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.get(Calendar.YEAR)+"�� " + (c.get(Calendar.MONTH)+1) + 
				"�� "+ c.get(Calendar.DATE)+"��");
		System.out.println(getDay(c.get(Calendar.DAY_OF_WEEK)) + 
				time(c.get(Calendar.HOUR_OF_DAY)));
		System.out.println(c.get(Calendar.HOUR)+"�� "+c.get(Calendar.MINUTE)+"�� "
				+c.get(Calendar.SECOND)+"��");
	}
}
