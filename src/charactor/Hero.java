package charactor;//在最开始的地方声明该类所处于的包名

/**
 * 2、使用其他包下的类，必须import
 * 	使用同一个包下的其他类，直接使用即可 
 * 	但是要使用其他包下的类，必须import
 */
import property.Weapon;//Weapon类在其他包里，使用必须进行import

/**
 * 1、把比较接近的类，规划在同一个包下
 * @author Administrator
 *
 */
public class Hero {
	/**
	 * 2、private 私有的
	 * 	使用private修饰属性 
	 * 	自身：是可以访问的 
	 * 	同包子类：不能继承 
	 * 	不同包子类：不能继承 
	 * 	同包类：不能访问 
	 * 	其他包类：不能访问
	 */
	private int id;
	
	//Hero,ADHero 规划在一个包，叫做charactor（角色）
	//Item,Weapon规划在另一个包下，叫做 property(道具)
	//在最开始的地方声明该类所处于的包名
	/**
	 * 3、package/friendly/default 不写：没有修饰符
	 * 
	 */
    // 无修饰符的属性 hp
    // 自己可以访问
 
    // 同包子类可以继承
    // 不同包子类不能继承
 
    // 同包类可以访问
    // 不同包类不能访问
    String name; //姓名
    /**
     * 4、protected ：受保护的
     */
    // protected饰符的属性 hp
    // 自己可以访问
 
    // 同包子类可以继承
    // 不同包子类可以继承
 
    // 同包类可以访问
    // 不同包类不能访问
    protected float hp; //血量
    /**
     * 5、public :公共的
     */
    // public的属性 name
    // 自己可以访问
 
    // 同包子类可以继承
    // 不同包子类可以继承
 
    // 同包类可以访问
    // 不同包类可以访问    
    public float armor; //护甲
        
    int moveSpeed; //移动速度
    //准备一把武器
    public void equip(Weapon w){
    	
    }
}
