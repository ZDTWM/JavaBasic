package interface_and_inherit.polymorphic;
/**
 * 多态：
 * 	操作符的多态
 * @author Administrator
 *
 */
public class Hero {
	
	public String name;
	protected float hp;
	
	public static void main(String[] args) {
		
		int i = 5;
		int j = 6;
		int k = i + j;//如果+号两侧都是整型，那么+代表 数字相加
		System.out.println(k);
		
		int a = 5;
		String b = "5";
		String c = a + b;
		System.out.println(c);//如果+号两侧，任意一个是字符串，那么+代表字符串连接
		
	}
}
