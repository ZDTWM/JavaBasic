package class_and_object;
/**
 * 构造方法：
 * 	通过一个类创建一个对象，这个过程叫做实例化 
 * 	实例化是通过调用构造方法(又叫做构造器)实现的
 * @author Administrator
 *
 */
public class Cat {
	String name;
	int price;
	String color;
	float weight;
	/**
	 * 1、什么是构造方法
	 */
	//方法名和类名一样（包括大小写）
	//没有返回类型
	//实例化一个对象的时候，必然调用构造方法
	public Cat(){
		System.out.println("实例化一个对象的时候，必然调用构造方法");
	}
	
	/**
	 * 2、隐式的构造方法
	 */
    //这个无参的构造方法，如果不写，
    //就会默认提供一个无参的构造方法
	//public Cat(){
	//	System.out.println("实例化一个对象的时候，必然调用构造方法");
	//}	
	
	/**
	 * 3、如果提供了一个有参的构造方法
	 */
	//一旦提供了一个有参的构造方法 
	//同时又没有显式的提供一个无参的构造方法 
	//那么默认的无参的构造方法，就 没有了
	
	//带一个参数的构造方法
	public Cat(String catname){
		name = catname;
	}
	/**
	 * 4、构造方法的重载
	 */
	//和普通方法一样，构造方法也可以重载
	//带两个参数的构造方法
	public Cat(String catname,float catweight){
		name = catname;
		weight = catweight;
	}
	/**
	 * 5、练习：4个参数的构造方法
	 * 
	 */
	public Cat(String catname,int catprice,float catweight,String catcolor){
		name = catname;
		price = catprice;
		weight = catweight;
		color = catcolor;
	}
	public static void main(String[] args) {
		//1、实例化一个对象的时候，必然调用构造方法
		Cat aCat = new Cat();
		
		//3、有参的构造方法
		Cat bCat = new Cat("智障");
	}
	
}
