package object.oriented;

public class Hero {
	String name;//姓名
	float hp;//血量
	float armor;//护甲
	int moveSpeed;//移动速度
	/**
	 * 1、无返回值类型的方法
	 */
	//坑队友
	void keng(){
		System.out.println("坑队友");
	}
	/**
	 * 2、有返回值类型的方法
	 * @return
	 */
	//获取护甲
	float getArmor(){
		return armor;
	}
	/**
	 * 3、方法的参数
	 * @param speed
	 */
	//增加移动速度
	void addSpeed(int speed){
		//在原来的基础上增加速度
		moveSpeed = moveSpeed + speed;
	}
	public static void main(String[] args) {
		Hero garen  = new Hero();
		garen.name = "盖伦";
		garen.hp = 417.01f;
		garen.armor = 45.9f;
		garen.moveSpeed = 315;
		
		Hero temmo = new Hero();
		temmo.name = "提莫";
		temmo.hp = 342.4f;
		temmo.armor = 34.5f;
		temmo.moveSpeed = 315;
	}
}
