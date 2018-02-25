package interface_and_inherit.property;

public class MagicPotion extends Item{
	/**
	 * 练习：重写
	 */
	public void effect(){
		System.out.println("可以回复魔法值");
	}
	
	public static void main(String[] args) {
		MagicPotion magicPotion = new MagicPotion();
		magicPotion.effect();
	}
	
}
