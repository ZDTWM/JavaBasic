package date;

import java.util.Date;

public class Demo01 {
		/**
		 * 1��ʱ��ԭ�����
		 */
		//���е��������ͣ������������������������������ַ����������Ҫ�����ֵ���ʽ���ֳ�����
		//��������Ҳ�����⣬���仰˵��һ�����ڣ�����2020��10��1�գ��ڼ���������һ�����������档
		//��ô�������һ�����֣�������. ��������֣��ʹ���Java�е�ʱ��ԭ�㣬���Ӧ��������1970��1��1�� 8��0��0�� �� (Ϊʲô��8�㣬��Ϊ�й���̫ƽ��ʱ����UTC-8���պú͸�������ʱ���8��Сʱ)
		//Ϊʲô��Ӧ1970���أ� ��Ϊ1969�귢���˵�һ�� UNIX �汾��AT&T���ۺϿ��ǣ���ʱ�Ͱ�1970�굱����ʱ��ԭ�㡣
		//���е����ڣ�������Ϊ���0��Ϊ��׼��ÿ��һ���룬��+1��
	public static void main(String[] args) {
		/**
		 * 2���������ڶ���
		 */
		Date date1 = new Date();
		System.out.println("��ǰʱ�䣺");
		System.out.println(date1);
		System.out.println();
		
		// ��1970��1��1�� ����8��0��0�� ��ʼ�����ĺ�����
		Date date2 = new Date(5000);
		System.out.println("��1970��1��1�� ����8��0��0�� ��ʼ������5���ʱ��");
		System.out.println(date2);
		System.out.println("-----------------------------------");
		/**
		 * 3��getTime
		 */
        //ע�⣺��java.util.Date;
        //���� java.sql.Date�������Ǹ����ݿ���ʵ�ʱ��ʹ�õ�
		Date now = new Date();
		//��ӡ��ǰʱ��
		System.out.println("��ǰʱ�䣺" + now.toString());
		System.out.println("��ǰʱ�䣺" + now);
        //getTime() �õ�һ��long�͵�����
        //����������� 1970.1.1 08:00:00:000��ÿ����һ���룬����1
		System.out.println("��ǰʱ��getTime()���ص�ֵ�ǣ�" + now.getTime());
		
		Date zero = new Date(0);
		System.out.println("��0��Ϊ���췽�����õ���������:" + zero);
		System.out.println("---------------------------------");
		
		/**
		 * 4����ǰ���ڵĺ�������System.currentTimeMillis()
		 */
		//��ǰ���ڵĺ�����
		//new Date().getTime() �� System.currentTimeMillis() ��һ����
		//�������ڻ������ܵ�ԭ�򣬿��ܻ���ʮ���룬�Ͼ�ÿִ��һ�д��룬������Ҫʱ���
		Date date3 = new Date();
		System.out.println("Date.getTime() \t\t\t����ֵ: " + date3.getTime());
		System.out.println("System.currentTimeMillis() \t����ֵ: " + System.currentTimeMillis());
	}
}
