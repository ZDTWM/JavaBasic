package operator;

import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) {
		/**
		 * 1����Ԫ������
		 */
		int a = 5;
		int b = 6;
		int c = a < b ? 99:98;
		//�൱��
		if(a < b){
			c = 99;
		}else{
			c = 98;
		}
		System.out.println(c);
		/**
		 * 2����ϰ������һ��1~7�����ж��ǹ����ջ�����ĩ
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("�������ܼ���");
		int d = scan.nextInt();
		String str = d <=5 ? "�����ǹ�����":"��������Ϣ��";
		System.out.println(str);
	}

}
