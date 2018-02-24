package class_and_object;

public class ADHero extends Hero{
	/**
	 * 1、attack方法的重载
	 */
	public void attack(){
		 System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
		 
	}
	public void attack(Hero h1){
		 System.out.println(name + "对" + h1.name + "进行了一次攻击 ");
	}
	public void attack(Hero h1,Hero h2){
		System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");
	}
	/**
	 * 2、可变数量的参数
	 */
	//只需要设计一个方法
	//public void attack(Hero ...heros)
	//即可代表上述所有的方法了
	//在方法里，使用操作数组的方式处理参数heros即可
	public void attack (Hero ...heros){
		for (int i = 0; i < heros.length; i++) {
			System.out.println(name + "攻击了" + heros[i].name);
		}
	}
	public static void main(String[] args) {
		
		ADHero bh = new ADHero();
		bh.name = "赏金";
		Hero h1 = new Hero();
		h1.name = "盖伦";
		Hero h2 = new Hero();
		h2.name = "提莫";
		Hero h3 = new Hero();
		h3.name = "雪人";
		bh.attack();
		bh.attack(h1);
		bh.attack(h1,h2);
		System.out.println("---------------------------------");
		bh.attack(h1,h2,h3);
	}
}
