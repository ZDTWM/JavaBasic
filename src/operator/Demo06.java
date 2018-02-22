package operator;
/**
 * Scanner的用法
 */
import java.util.Scanner;

public class Demo06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/**
		 * 1、使用Scanner读取整数
		 */
		System.out.println("请输入一个整数：");
		int a = scan.nextInt();
		System.out.println("读取的整数是：" + a);
		/**
		 * 2、使用Scanner读取浮点数
		 */
		System.out.println("请输入一个浮点数：");
		float b = scan.nextFloat();
		System.out.println("读取的浮点数是：" + b);
		/**
		 * 3、使用Scanner读取字符串
		 */
		System.out.println("请输入一个字符串：");
		String rn = scan.nextLine();//读取了整数后，接着读取字符串
		String str = scan.nextLine();
		System.out.println("输入的字符串是：" + str);
		/**
		 * 4、读取了整数后，接着读取字符串
		 * 
		 */
/*		需要注意的是，如果在通过nextInt()读取了整数后，再接着读取字符串，
		读出来的是回车换行:"\r\n",因为nextInt仅仅读取数字信息，而不会读走回车换行"\r\n".

		所以，如果在业务上需要读取了整数后，接着读取字符串，
		那么就应该连续执行两次nextLine()，第一次是取走整数，第二次才是读取真正的字符串*/
	}

}
