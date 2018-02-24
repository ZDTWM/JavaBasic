package class_and_object;
/**
 * 类属性
 * @author Administrator
 *
 */
public class Teacher {
	/**
	 * 1、类属性
	 */
	//类属性： 又叫做静态属性 
	//对象属性： 又叫实例属性，非静态属性 
	//如果一个属性声明成类属性，那么所有的对象，都共享这么一个值 
	//给英雄设置一个类属性叫做“版权" (copyright), 无论有多少个具体的英雄，所有的英雄的版权都属于 Riot Games公司。
	public String name;//实例属性，对象属性，非静态属性
	protected float hp;
	static String copyright;//类属性，静态属性
	
	public static void main(String[] args) {
		Teacher teacher1 = new Teacher();
		teacher1.name = "老师1";
		Teacher.copyright = "都是四中的老师";
		System.out.println(teacher1.name);
		System.out.println(teacher1.copyright);
		/**
		 * 2、练习，通过teacher1来修改copyright
		 * 		teacher2的copyright也会改变
		 * 	因为类属性只有一个，不同的对象都共享这么一个类属性
		 */
		teacher1.copyright = "二中老师";
		
		Teacher teacher2 = new Teacher();
		teacher2.name = "老师2";
		System.out.println(teacher2.name);
		System.out.println(teacher2.copyright);
		
	}
}
