package interface_and_inherit_final;
/**
 * 1、当Hero被修饰成final的时候，表示Hero不能够被继承
 * 	    其子类会出现编译错误
 * @author Administrator
 *
 */
public final class Hero {
	/**
	 * 5、常量
	 * 	常量指的是可以公开，直接访问，不会变化的值 
	 * 	比如 itemTotalNumber 物品栏的数量是6个
	 */
	public static final int itemTotalNumber = 6;//物品栏的数量
    String name; //姓名
    
    float mp ;//蓝量
    
    float hp; //血量
    /**
     * 2、final修饰方法
     * Hero的useItem方法被修饰成final,那么该方法在ADHero中，不能够被重写
     * @param i
     */
    public final void uesItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }
    
    public static void main(String[] args) {
		/**
		 * 3、final修饰基本类型变量：表示该变量只有一次赋值机会 
		 */
    	
    	final int hp;
    	hp = 5;
    	//hp = 6;
    	
    	/**
    	 * 4、final 修饰引用
    	 */
    	//final修饰引用
    	//h引用被修饰成final，表示该引用只有1次指向对象的机会
    	//所以17行会出现编译错误
    	//但是，依然通过h引用修改对象的属性值hp，因为hp并没有final修饰
    	final Hero h;
    	h = new Hero();
    	//h = new Hero();
    	h.mp = 5;
	}
    
}
