package work.flow;

import java.util.Scanner;

/**
 * while��do while
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		/**
		 * 1��while:����Ϊtrueʱ �ظ�ִ��
		 * 	ֻҪwhile�еı��ʽ�������ͻ᲻�ϵ�ѭ��ִ��
		 */
		int a = 0;
		while(a<5){
			System.out.println(a);
			a++;
		}
		/**
		 * 2��do while:����Ϊtrueʱ �ظ�ִ�У����ٻ�ִ��һ��
		 * 	��while�������ǣ������Ƿ��������ִ��һ�Σ��ٽ����ж�
		 */
		int b = 0;
		do{
			System.out.println(b);
			b++;
		}while(b<5);
		
		/**
		 * 3����ϰ
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ��������");
		int c = scan.nextInt();
		int sum = 1;
		while(c > 0){
			sum = sum * c;
			c--;
		}
		System.out.println(sum);
	}

}
