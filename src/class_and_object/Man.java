package class_and_object;
/**
 * 属性初始化
 * @author Administrator
 *
 */
public class Man {
	/**
	 * 1、对象属性初始化
	 * 	1）声明该属性的时候初始化
	 *  2）构造方法中初始化
	 *  3）初始化块
	 */
	public String name = "some man";//声明该属性的时候初始化
	protected float hp;
	float maxHP;
	{
		maxHP = 200;//初始化块
	}
	public Man(){
		hp = 100;//构造方法中初始化
	}
	
	/**
	 * 2、类属性初始化
	 * 	（1）声明该属性的时候初始化
	 * 	（2）静态初始化块
	 */
	//物品栏的容量
	public static int itemCapacity = 8;//声明的时候初始化
	static {
		itemCapacity = 6;//静态初始化块   初始化
	}
	
	public static void main(String[] args) {
		System.out.println(Man.itemCapacity);
	}
	
}
