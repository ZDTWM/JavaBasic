package variable.quantity;

public class Demo02 {

	public static void main(String[] args) {
		/**
		 * 基本类型的变量：
		 * 	整型（4种）:byte、short、int、long
		 * 	字符型（1种）
		 * 	浮点型（2种）
		 * 	布尔型（1种）
		 */
		//1、整型
		byte b = 1;
		short s = 200;
		int i = 300;
		long l = 400;
		//byte b2 = 200;//如果试图给byte类型的变量赋予超出其范围的值，就会产生编译错误
		
		//2、字符型
		char c = '中';
		//char 只能存放一个字符，超过一个字符就会产生编译错误
		//char c2 = '中国';
		//char c3 = 'ab';
		
		//3、浮点型
		double d = 123.45;
		//该行会出现编译错误，因为54.321是double型的
		//float f = 54.321;
		float f2 = 54.321f;
		
		//4、布尔型
		boolean b1 = true;
		boolean b2 = false;
        // 虽然布尔型真正存放的数据是0(false) 1(true)
        // 但是，不能直接使用0 1 进行赋值
		//boolean b3 = 1;
		
		//注：String 不是基本类型，是Immutable(不可变类型)
		String str = "Hello Java";
	}

}
