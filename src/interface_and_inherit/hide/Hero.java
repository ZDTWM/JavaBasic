package interface_and_inherit.hide;
/**
 * 隐藏：
 * 	与重写类似，方法的重写是子类覆盖父类的对象方法 
 * 	隐藏，就是子类覆盖父类的类方法
 * @author Administrator
 *
 */
public class Hero {
	
    public String name;
    protected float hp;
    
    //类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin(){
    	System.out.println("hero battle win");
    }
    /**
     * 练习：
     * 
     */
    //h.battleWin(); //battleWin是一个类方法
    //h是父类类型的引用
    //但是指向一个子类对象
    //h.battleWin(); 会调用父类的方法？还是子类的方法？
    public static void main(String[] args) {
		Hero h = new ADHero();
		h.battleWin();//hero battle win
		h=null;
		h.battleWin();//hero battle win
	}
    
}
