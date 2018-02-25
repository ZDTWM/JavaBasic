package interface_and_inherit_super;

import interface_and_inherit.charactor.AD;

public class ADHero extends Hero implements AD{
	
	int moveSpeed = 400;//移动速度
	
	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
		
	}
	
	public int getMoveSpeed(){
		return this.moveSpeed;
	}
	/**
	 * 5、使用super调用父类属性
	 * @return
	 */
	public int getMoveSpeed2(){
		return super.moveSpeed;
	}
	
	/**
	 * 6、调用父类方法
	 */
	//ADHero重写了useItem方法，并且在useItem中通过super调用父类的useItem方法
	public void useItem(Item item){
		System.out.println("adhero use item");
		super.useItem(item);
	}
	
	public ADHero(){
		System.out.println("ADHero的无参构造方法");
	}
	
	public ADHero(String name){
		//使用关键字super 显式调用父类带参的构造方法
		super(name);
		System.out.println("ADHero的有一个参数的构造方法");
	}
	
	
	
	public static void main(String[] args) {
		/**
		 * 2、实例化子类，父类的构造方法一定会被调用
		 * 
		 */
/*		实例化一个ADHero(), 其构造方法会被调用 
		其父类的构造方法也会被调用 
		并且是父类构造方法先调用 
		子类构造方法会默认调用父类的 无参的构造方法*/
		new ADHero();
		/**
		 * 4、子类显式调用父类带参构造方法
		 */
		new ADHero("德莱文");
		/**
		 * 5、使用super调用父类属性
		 */
		ADHero adh = new ADHero();
		System.out.println(adh.getMoveSpeed());//400
		System.out.println(adh.getMoveSpeed2());//0
		/**
		 * 6、调用父类方法
		 */
		Item item = new Item();
		adh.useItem(item);
	}
}
