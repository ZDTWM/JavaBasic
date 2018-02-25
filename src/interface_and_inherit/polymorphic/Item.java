package interface_and_inherit.polymorphic;

public class Item {
	
	String name;
	int price;
	
    public void buy(){
        System.out.println("购买");
    }
	
	public void effect(){
		System.out.println("物品使用后，可以有效果 ");
	}
	
	public static void main(String[] args) {
		/**
		 * 类的多态条件：
		 * 	1. 父类（接口）引用指向子类对象
		 *  2. 调用的方法有重写
		 */
		Item item1 = new LifePotion();
		Item item2 = new MagicPotion();
		System.out.print("item1是Item类型，执行effect打印:");
		item1.effect();
		System.out.print("item2是Item类型，执行effect打印:");
		item2.effect();
	}
	
}
