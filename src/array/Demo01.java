package array;

public class Demo01 {

	public static void main(String[] args) {
		/**
		 * 1、声明数组
		 */
		//声明一个数组
		int[] a;
		int b[];//二者没有区别，看习惯
		/**
		 * 2、创建数组
		 */
		//声明一个引用
		int [] c;
		//创建一个长度是5的数组，并且使用引用c指向改数组
		c = new int[5];
		int d[] = new int[4];//声明的同时，指向一个数组
		
		/**
		 * 3、访问数组
		 * 	数组下标基0
		 */
		int e[];
		e = new int[5];
		e[0] = 1; //下标0，代表数组里的第一个数
		e[1] = 2;
		e[2] = 3;
		e[3] = 4;
		e[4] = 5;
		/**
		 * 4、数组长度
		 * 	.length属性用于访问一个数组的长度
		 */
		int f[];
		f = new int[5];
		System.out.println(f.length);//打印数组的长度
		f[4] = 100;//下标4，实质上是“第5个”，既最后一个
		//f[5] = 101;//下标5，实质上是“第6个”，超出范围 ,产生数组下标越界异常
		System.out.println("-------------------------------");
		/**
		 * 5、练习 ：输出数组中最小的数
		 */
		int[] g = new int[5];
		int min = 100;
		for (int i = 0; i < g.length; i++) {
			g[i] = (int) (Math.random() * 100);
			System.out.print(g[i] + " ");
			System.out.println();
			if(g[i] < min){
				min = g[i];
			}
		}
		System.out.println("数组中最小的数是："+min);

		
	}

}
