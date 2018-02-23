package work.flow;

import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 1、for
		 * 	比较for和while
		 */
		//使用while打印0到4 
		int a = 0;
		while(a<5){
			System.out.println("while循环输出的a:" + a);
			a++;
		}
		//使用for打印0到4 
		for (int i = 0; i < 5; i++) {
			System.out.println("for循环输出的i:" + i);
		}
		/**
		 * 2、练习：
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("输入天数：");
		int day =scan.nextInt();
		String name = "洪七公";
		int total = 0;
		int dayIncome = 1;
		for ( int i = 1; i <= day; i++) {
			total = total + dayIncome;
			System.out.println(name + "第" + i +"天的收入是："+ total);
			dayIncome*=2;
		}
		System.out.println(name + "干了" + day + "，收入是："+total);
	}
}
