package work.flow;

import java.util.Scanner;

/**
 * switch
 * switch����ʹ��byte,short,int,char,String,enum
 * ע: ÿ�����ʽ��������Ӧ����һ��break;
 * ע: String��Java1.7֮ǰ�ǲ�֧�ֵ�, 
 * 	  Java��1.7��ʼ֧��switch��String�ģ�
 *    ������ǰ�Stringת��Ϊhashֵ����ʵ��������
 * ע: enum��ö������
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		/**
		 * 1��switch
		 */
		//���ʹ��if else
		int day = 5;
		if(day==1)
			System.out.println("����һ");
		else if(day==2)
			System.out.println("���ڶ�");
		else if(day==3)
			System.out.println("������");
		else if(day==4)
			System.out.println("������");
		else if(day==5)
			System.out.println("������");
		else if(day==6)
			System.out.println("������");
		else if(day==7)
			System.out.println("������");
		else
			System.out.println("����ɶ��");
		//���ʹ��switch
		switch(day){
			case 1:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;				
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;				
			case 7:
				System.out.println("������");
				break;				
			default:
				System.out.println("���Ǹ�ɶ��");
		}
		/**
		 * ��ϰ�������·ݣ��жϼ���
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int month = scan.nextInt();
		switch(month){
			case 1:
			case 2:
			case 3:
				System.out.println("����");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("����");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("����");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("����");
				break;
			default:
				System.out.println("����ɶ��");
		}
	}

}
