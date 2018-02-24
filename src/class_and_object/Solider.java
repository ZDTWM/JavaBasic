package class_and_object;
/**
 * 传参：
 * （1）基本类型传参
 * （2）类类型传参
 * @author Administrator
 *
 */
public class Solider {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	public Solider(String name,float hp){
		this.name = name;
		this.hp = hp;
	}
	// 攻击一个英雄，并让他掉damage点血
	public void attack(Solider solider,int damage){
		solider.hp = solider.hp - damage;
	}
	
	public static void main(String[] args) {
		Solider teemo = new Solider("提莫",383);
		Solider garen = new Solider("盖伦",616);
		//类类型又叫引用 
		//通过调用garen.attack(teemo, 100); 使得这两个引用（29行的引用teemo和20行的引用solider）都指向了同一个对象 
		garen.attack(teemo, 100);
		System.out.println(teemo.hp);
		
	}
}
