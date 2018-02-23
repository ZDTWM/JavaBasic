package work.flow;

import java.util.Scanner;

/**
 * while和do while
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		/**
		 * 1、while:条件为true时 重复执行
		 * 	只要while中的表达式成立，就会不断地循环执行
		 */
		int a = 0;
		while(a<5){
			System.out.println(a);
			a++;
		}
		/**
		 * 2、do while:条件为true时 重复执行，至少会执行一次
		 * 	与while的区别是，无论是否成立，先执行一次，再进行判断
		 */
		int b = 0;
		do{
			System.out.println(b);
			b++;
		}while(b<5);
		
		/**
		 * 3、练习
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int c = scan.nextInt();
		int sum = 1;
		while(c > 0){
			sum = sum * c;
			c--;
		}
		System.out.println(sum);
	}

}
