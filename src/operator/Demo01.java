package operator;
/**
 * 算数操作符
 */
import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		/**
		 * 1、基本算数操作符：加、减、乘、除
		 */
		int a = 10;
		int b = 5;
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a / b;
		/**
		 * 2、练习-求和
		 */
		Scanner scan  = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int g = scan.nextInt();
		System.out.println("请输入第二个整数：");
		int h = scan.nextInt();
		int i = g + h;
		System.out.println("两个数的和为：" + i);
		/**
		 * 3、任意运算单元的长度超过int:
		 * 	如果有任何运算单元的长度超过int,那么运算结果就按照最长的长度计算 
		 */
		int j = 5;
		long k = 6;
		int l = (int) (j + k);//a+b的运算结果是long型，所以要进行强制转换
		long m = j + k;
		/**
		 * 4、任意运算单元的长度小于int
		 * 	如果任何运算单元的长度都不超过int,那么运算结果就按照int来计算 
		 */
		byte n = 1;
		byte o = 2;
		byte p = (byte) (n + o);//虽然a b都是byte类型，但是运算结果是int类型，需要进行强制转换
		int q = n + o;
		/**
		 * 5、% 取余数，又叫取模 
		 */
		int r = 5;
		int s = 2;
		System.out.println(r%s);//输出为1
		/**
		 * 6、自增、自减
		 * 	++
		 * 	--
		 */
		int t = 5;
		t++;
		System.out.println(t);//6
		/**
		 * 7、自增 自减操作符置前以及置后的区别
		 * 	i++：先取值，再运算
		 * 	++i：先运算，再取值
		 */
		int u = 5;
		System.out.println(u++);
		System.out.println(u);
		int v = 5;
		System.out.println(++v);
		System.out.println(v);
	}

}
