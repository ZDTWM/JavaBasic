package number_and_string;
/**
 * 装箱拆箱
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		
		/**
		 * 1、封装类
		 */
		//所有的基本类型，都有对应的类类型 
		//比如int对应的类是Integer 
		//这种类就叫做封装类
		int i = 5;
		//把一个基本类型的变量,转换为Integer对象
		Integer it = new Integer(i);
		//把一个Integer对象，转换为一个基本类型的int
		int i2 = it.intValue();
		
		/**
		 * 2、Number类
		 */
		//Number的子类：Byte、Short、Long、Float、Double
		int a = 5;
		Integer it2 = new Integer(a);
		System.out.println(it2 instanceof Number);//true
		/**
		 * 3、基本类型转封装类
		 */
		int b = 5;
		//基本类型转换成封装类型
		Integer it3 = new Integer(b);
		
		/**
		 * 4、封装类转基本类型
		 */	
		int c = 5;
		//基本类型转换成封装类型
		Integer it4 = new Integer(c);
		//封装类型转换成基本类型
		int d = it4.intValue();
		/**
		 * 5、自动装箱
		 */	
		//不需要调用构造方法，通过=符号自动把 基本类型 转换为 类类型 就叫装箱
		int e = 5;
		 //基本类型转换成封装类型
		Integer it5 = new Integer(e);
		//自动转换就叫装箱
		Integer it6 = e;
		
		/**
		 * 6、自动拆箱
		 */
		//不需要调用Integer的intValue方法，通过=就自动转换成int类型，就叫拆箱
		int f = 5;
		//基本类型转换成封装类型
		Integer it7 = new Integer(f);
		//封装类型转换成基本类型
		int g = it7.intValue();
		//自动转换就叫拆箱
		int h = it7;
		/**
		 * 7、int的最大值、最小值
		 */	
		//int的最大值可以通过其对应的封装类Integer.MAX_VALUE获取
		//int最大值
		System.out.println(Integer.MAX_VALUE);
		//int最小值
		System.out.println(Integer.MIN_VALUE);
		/**
		 * 8、练习
		 */	
		// 1. 对byte,short,float,double进行自动拆箱和自动装箱
		byte b1 = 2;
		short s = 3;
		float f1 = 3.2F;
		double d1 = 3.24;
		//自动装箱
		Byte by = b1;
		Short sh = s;
		Float fl = f1;
		Double dou = d1;
		//自动拆箱
		b1 = by;
		s = sh;
		f1 = fl;
		d1 = dou;
		
		//2. byte和Integer之间能否进行自动拆箱和自动装箱
		byte b3 = 3;
		//Integer inte = b3;//不能把byte直接自动装箱成Integer
		//b3 = new Integer(2);//也不能把Integer自动拆箱成 byte
		
		//3.通过Byte获取byte的最大值
		System.out.println(Byte.MAX_VALUE);//127
		System.out.println(Short.MAX_VALUE);//32767
	}
	
	
}
