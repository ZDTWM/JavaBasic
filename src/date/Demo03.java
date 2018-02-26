package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Calendar类即日历类，常用于进行“翻日历”，比如下个月的今天是多久
 * @author Administrator
 *
 */
public class Demo03 {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static void main(String[] args) {
		/**
		 * 1、Calendar与Date进行转换
		 */
		//采用单例模式获取日历对象Calendar.getInstance();
		Calendar c = Calendar.getInstance();
		Date date1 = c.getTime();
		System.out.println(c);//java.util.GregorianCalendar[time=1519612505991,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2018,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=5,DAY_OF_MONTH=26,DAY_OF_YEAR=57,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=35,SECOND=5,MILLISECOND=991,ZONE_OFFSET=28800000,DST_OFFSET=0]
		System.out.println(date1);//Mon Feb 26 10:35:21 CST 2018
		
		Date date2 = new Date(0);
		c.setTime(date2);//把这个日历，调成日期 : 1970.1.1 08:00:00
		System.out.println(c);//java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=8,HOUR_OF_DAY=8,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=28800000,DST_OFFSET=0]

		/**
		 * 2、翻日历
		 */
		//add方法，在原日期上增加年/月/日
		//set方法，直接设置年/月/日
		
		Calendar cal = Calendar.getInstance();
		Date now = cal.getTime();
		//当前日期
		System.out.println("当前日期：\t" + format(cal.getTime()));
		// 下个月的今天
		cal.setTime(now);
		cal.add(Calendar.MONTH, 1);
		System.out.println("下个月的今天:\t" +format(cal.getTime()));
		//去年的今天
		cal.setTime(now);
		cal.add(Calendar.YEAR,-1);
		System.out.println("去年的今天:\t" +format(cal.getTime()));
		// 上个月的第三天
		cal.setTime(now);
		cal.add(Calendar.MONTH, -1);
		cal.set(Calendar.DATE, 3);
		System.out.println("上个月的第三天:\t" +format(cal.getTime()));
	}

	private static String format(Date time) {
		return sdf.format(time);
	}
}
