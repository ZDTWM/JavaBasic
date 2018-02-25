package interface_and_inherit.innerclass;


/**
 * 内部类：
 * 	（1）非静态内部类
 *  （2）静态内部类
 *  （3）匿名类
 *  （4）本地类
 * @author Administrator
 *
 */
public abstract class APHero {
	
    String name; //姓名
    
    float hp; //血量
          
    float armor; //护甲
          
    int moveSpeed; //移动速度
    
    public abstract void attack();
    /**
     * 3、匿名内部类
     */
    //匿名类指的是在声明一个类的同时实例化它，使代码更加简洁精练
    //通常情况下，要使用一个接口或者抽象类，都必须创建一个子类

    //有的时候，为了快速使用，直接实例化一个抽象类，并“当场”实现其抽象方法。
    //既然实现了抽象方法，那么就是一个新的类，只是这个类，没有命名。
    //这样的类，叫做匿名类
    public static void main(String[] args) {
        APHero ap = new APHero(){
        	//当场实现attack方法
    		@Override
    		public void attack() {
    			System.out.println("新的攻击手段");
    			
    		}
        	
        };
        ap.attack();
        System.out.println(ap);//APHero$1@1db9742
	}
    
    
}
