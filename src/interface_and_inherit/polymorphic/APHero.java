package interface_and_inherit.polymorphic;
/**
 * 类的多态：
 * 	使用多态
 * @author Administrator
 *
 */
	/*如果物品的种类特别多，那么就需要设计很多的方法
	比如useArmor,useWeapon等等
	
	这个时候采用多态来解决这个问题
	设计一个方法叫做useItem，其参数类型是Item
	如果是使用血瓶，调用该方法
	如果是使用魔瓶，还是调用该方法
	无论英雄要使用什么样的物品，只需要一个方法即可*/
public class APHero {
	
    public String name;
    protected float hp;
    
    //使用多态只要一个方法就可以了
    public void useItem(Item item){
    	item.effect();
    }
    
    public static void main(String[] args) {
		APHero aphero = new APHero();
		aphero.name = "魔法攻击类英雄";
		
		LifePotion lp = new LifePotion();
		MagicPotion mp = new MagicPotion();
		
		aphero.useItem(lp);
		aphero.useItem(mp);
	}
}
