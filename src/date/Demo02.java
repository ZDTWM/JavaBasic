package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat ���ڸ�ʽ����
 * @author Administrator
 *
 */
public class Demo02 {
	
	public static void main(String[] args) {
		
		/**
		 * 1������ת�ַ���
		 */
        //y ������
        //M ������
        //d ������
        //H ����24���Ƶ�Сʱ
        //h ����12���Ƶ�Сʱ
        //m �������
        //s ������
        //S �������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		Date date1 = new Date();
		String str1 = sdf.format(date1);
		System.out.println("��ǰʱ��ͨ�� yyyy-MM-dd HH:mm:ss SSS ��ʽ��������: " +str1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date date2 = new Date();
		String str2 = sdf2.format(date2);
		System.out.println("��ǰʱ��ͨ�� yyyy-MM-dd ��ʽ��������: " + str2);
		System.out.println("-----------------------");
		/**
		 * 2���ַ���ת����
		 */
		//ģʽ��yyyy/MM/dd HH:mm:ss����Ҫ���ַ�����ʽ����һ�£������һ���ͻ��׳������쳣ParseException
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String str3 = "2016/1/5 12:12:12";
		try {
			Date date3 = sdf3.parse(str3);
			System.out.printf("�ַ��� %s ͨ����ʽ  yyyy/MM/dd HH:mm:ss %nת��Ϊ���ڶ���: %s",str3,date3.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}
