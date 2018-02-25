package interface_and_inherit.property;

public class LifePoint extends Item {
	
	public void effect(){
		System.out.println("血瓶使用后，可以回血");
	}
	
	public static void main(String[] args) {
		/**
		 * 调用重写的方法
		 */
		Item item = new Item();
		item.effect();//物品使用后，可以有效果
		
		LifePoint lifePoint  = new LifePoint();
		lifePoint.effect();//"血瓶使用后，可以回血"
	}
}
