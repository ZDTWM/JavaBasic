package class_and_object;
/**
 * 1、类方法
 * @author Administrator
 *
 */
public class Bird {
	
	//类方法： 又叫做静态方法
	//对象方法： 又叫实例方法，非静态方法
	//访问一个对象方法，必须建立在有一个对象的前提的基础上
	//访问类方法，不需要对象的存在，直接就访问
	public String name;
	protected float hp;
	
    //实例方法,对象方法，非静态方法
    //必须有对象才能够调用
	public void die(){
		hp = 0;
	}
	
    //类方法，静态方法
    //通过类就可以直接调用
	public static void battleWin(){
		System.out.println("battle win");
	}
	
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.name = "小鸟";
		//必须有一个对象才能调用
		bird.die();
		
		Bird bird2 = new Bird();
		bird2.name = "小鸟2";
		
		//无需对象，直接通过类调用
		Bird.battleWin();
		/**
		 * 2、调用类方法
		 * 	（1）对象.类方法
		 *  （2）类.类方法
		 */
		bird2.battleWin();
		Bird.battleWin();
	}
}
