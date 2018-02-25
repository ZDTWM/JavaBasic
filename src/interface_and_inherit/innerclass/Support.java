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
public abstract class Support {
    String name; //姓名
    
    float hp; //血量
          
    float armor; //护甲
          
    int moveSpeed; //移动速度
      
    public abstract void attack();
    
    /**
     * 4、本地类
     */
    //本地类可以理解为有名字的匿名类 
    //与内部类不一样的是，内部类必须声明在成员的位置，即与属性和方法平等的位置。 
    //本地类和匿名类一样，直接声明在代码块里面，可以是主方法，for循环里等等地方
    public static void main(String[] args) {
		class SomeHero extends Support{
			@Override
			public void attack() {
				System.out.println(name + "新的进攻手段");
				
			}			
		}
		SomeHero h = new SomeHero();
		h.name = "地卜师";
		h.attack();
	}
    
}
