package number_and_string;

import java.util.Arrays;

/**
 * 字符串转换
 * @author Administrator
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 1、数字转字符串
		 */
		int a = 5;
		//方法一：使用String类的静态方法valueOf 
		String str = String.valueOf(a);
		//方法二：先把基本类型装箱为对象，然后调用对象的toString
		int b = 4;
		Integer it = b;
		String str2 = it.toString();
		/**
		 * 2、字符串转数字
		 */
		String str3 = "123";
		int c = Integer.parseInt(str3);
		System.out.println(c);
		/**
		 * 3、数组转为字符串
		 */
		int[] s = new int[]{1,2,3};
		System.out.println(Arrays.toString(s));
		/**
		 * 4、练习: 
		 * 	把浮点数 3.14 转换为 字符串 "3.14"
		 * 	再把字符串 “3.14” 转换为 浮点数 3.14
		 */
		float f = 3.14F;
		//方法一：使用String类的静态方法valueOf
		String str4 = String.valueOf(f);
		//方法二：先把基本类型装箱为对象，然后调用对象的toString
		Float flo = f;
		String str5 = flo.toString();
		
		String str6 = "3.14";
		float f2 = Float.parseFloat(str6);
		
		String str7 = "3.1a4";
		Float f3 = Float.parseFloat(str7);
		
		System.out.println(f2);
		//如果字符串内容不是合法的数字表达，那么转换就会报错(抛出异常)
		//System.out.println(f3);
		
	}
}
