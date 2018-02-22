package operator;

import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) {
		/**
		 * 1、三元操作符
		 */
		int a = 5;
		int b = 6;
		int c = a < b ? 99:98;
		//相当于
		if(a < b){
			c = 99;
		}else{
			c = 98;
		}
		System.out.println(c);
		/**
		 * 2、练习：输入一个1~7的数判断是工作日还是周末
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("今天是周几？");
		int d = scan.nextInt();
		String str = d <=5 ? "今天是工作日":"今天是休息日";
		System.out.println(str);
	}

}
