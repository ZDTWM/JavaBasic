package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat 日期格式化类
 * @author Administrator
 *
 */
public class Demo02 {
	
	public static void main(String[] args) {
		
		/**
		 * 1、日期转字符串
		 */
        //y 代表年
        //M 代表月
        //d 代表日
        //H 代表24进制的小时
        //h 代表12进制的小时
        //m 代表分钟
        //s 代表秒
        //S 代表毫秒
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		Date date1 = new Date();
		String str1 = sdf.format(date1);
		System.out.println("当前时间通过 yyyy-MM-dd HH:mm:ss SSS 格式化后的输出: " +str1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date date2 = new Date();
		String str2 = sdf2.format(date2);
		System.out.println("当前时间通过 yyyy-MM-dd 格式化后的输出: " + str2);
		System.out.println("-----------------------");
		/**
		 * 2、字符串转日期
		 */
		//模式（yyyy/MM/dd HH:mm:ss）需要和字符串格式保持一致，如果不一样就会抛出解析异常ParseException
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String str3 = "2016/1/5 12:12:12";
		try {
			Date date3 = sdf3.parse(str3);
			System.out.printf("字符串 %s 通过格式  yyyy/MM/dd HH:mm:ss %n转换为日期对象: %s",str3,date3.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}
