package interface_and_inherit_super;
/**
 * super
 * @author Administrator
 *
 */
public class Hero {
	
    String name; //姓名
    
    float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed; //移动速度
    /**
     * 1、准备一个显式提供无参构造方法的父类
     */
    public Hero(){
    	System.out.println("Hero的无参构造方法");
    }
    
    public Hero(String name){
    	System.out.println("Hero的有一个参数的构造方法");
    	this.name = name;
    }
    
    public void useItem(Item item){
    	System.out.println("hero use item");
    	item.effect();
    }
    
    public static void main(String[] args) {
		new Hero();
	}
    
}
