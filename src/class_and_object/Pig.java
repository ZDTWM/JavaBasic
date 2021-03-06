package class_and_object;
/**
 * this：
 * 通过this调用其他的构造方法
 * 如果要在一个构造方法中，调用另一个构造方法，可以使用this()
 * @author Administrator
 *
 */
public class Pig {
	String name;
	String color;
	int price;
	float weight;
	
	//带一个参数的构造方法
	public Pig(String name){
		System.out.println("一个参数的构造方法");
		this.name = name;
	}
	//带两个参数的构造方法
	public Pig(String name,float weight){
		//如果要在一个构造方法中，调用另一个构造方法，可以使用this()
		this(name);
		System.out.println("两个参数的构造方法");
		this.weight = weight;
	}
	//带四个参数的构造方法
	public Pig(String name,String color,int price,float weight){
		this(name,weight);
		System.out.println("四个参数的构造方法");
		this.color = color;
		this.price = price;
	}
	public static void main(String[] args) {
		Pig aPig = new Pig("佩奇",383);
		System.out.println(aPig.name);
		
		Pig bPig = new Pig("佩奇","黑色",1000,200);
		System.out.println(bPig.name +","+ bPig.color +","+ bPig.price +","+ bPig.weight);
	}
}
