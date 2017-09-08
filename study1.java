package test;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.*;

public class cdn{
	public static void main(String args[])
	{
		double[] mylist= {1.1,2.2,3.3};
		double lisrp[]= {1.2,1.3,1.4};
		for(int i=0;i<mylist.length;i++)
		{
			System.out.println(mylist[i]);
		}
		for(double element:mylist)
		{
			System.out.println(element);
		}
		Date date=new Date();
		System.out.println(date.getTime());
		
		cdn.function1();
		cdn.functoin2();
		cdn.function3();
		
	}
	private static void function1()
	{
		Date dNow=new Date();
		SimpleDateFormat ft=new SimpleDateFormat("hhmmss");
		ft.applyPattern("yyyy.MM.dd+++hh:mm:ss a zzz");//修改format格式
		ft.applyPattern("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println(ft.format(dNow));
		
	}
	private static void functoin2()
	{
		Calendar c=Calendar.getInstance();//初始化
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int day=c.get(Calendar.DATE);
		int minute=c.get(Calendar.MINUTE);
		int second=c.get(Calendar.SECOND);
		int day_of=c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day_of);
	}
	private static void function3()
	{
		 String months[] = {
			      "Jan", "Feb", "Mar", "Apr",
			      "May", "Jun", "Jul", "Aug",
			      "Sep", "Oct", "Nov", "Dec"};
			      
			      int year;
			      // 初始化 Gregorian 日历
			      // 使用当前时间和日期
			      // 默认为本地时间和时区
			      GregorianCalendar gcalendar = new GregorianCalendar();
			      // 显示当前时间和日期的信息
			      System.out.print("Date: ");
			      System.out.print(months[gcalendar.get(Calendar.MONTH)]);
			      System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
			      System.out.println(year = gcalendar.get(Calendar.YEAR));
			      System.out.print("Time: ");
			      System.out.print(gcalendar.get(Calendar.HOUR) + ":");
			      System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
			      System.out.println(gcalendar.get(Calendar.SECOND));
			      
			      // 测试当前年份是否为闰年
			      if(gcalendar.isLeapYear(year)) {
			         System.out.println("当前年份是闰年");
			      }
			      else {
			         System.out.println("当前年份不是闰年");
			      }
	}
	
	
	
	
}
