package operator;
/**
 * 赋值操作符
 * @author Administrator
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		/**
		 * 1、赋值操作
		 */
		int a = 5 + 5;
		//int 啊 = 2 + 2;
		/**
		 * 2、对本身进行运算、并赋值
		 */
		int b = 3;
		b += 2;//b = b+2
		System.out.println(b);
		int c = 3;
		c = c + 3;
		System.out.println(c);
	}

}
