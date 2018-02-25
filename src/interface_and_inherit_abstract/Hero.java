package interface_and_inherit_abstract;
/**
 * 抽象类
 * @author Administrator
 *
 */
public abstract class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
    // 抽象方法attack
    // Hero的子类会被要求实现attack方法
	public abstract void attack();
	
	public void die(){
		System.out.println(name + "这个英雄死了");
	}
	
	public static void main(String[] args) {
		//一旦被声明为了抽象类，就不能够直接被实例化
		//Hero hero = new Hero();
	}
	
}
