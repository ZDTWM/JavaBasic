package work.flow;

import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 1��for
		 * 	�Ƚ�for��while
		 */
		//ʹ��while��ӡ0��4 
		int a = 0;
		while(a<5){
			System.out.println("whileѭ�������a:" + a);
			a++;
		}
		//ʹ��for��ӡ0��4 
		for (int i = 0; i < 5; i++) {
			System.out.println("forѭ�������i:" + i);
		}
		/**
		 * 2����ϰ��
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("����������");
		int day =scan.nextInt();
		String name = "���߹�";
		int total = 0;
		int dayIncome = 1;
		for ( int i = 1; i <= day; i++) {
			total = total + dayIncome;
			System.out.println(name + "��" + i +"��������ǣ�"+ total);
			dayIncome*=2;
		}
		System.out.println(name + "����" + day + "�������ǣ�"+total);
	}
}
