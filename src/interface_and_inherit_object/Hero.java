package interface_and_inherit_object;
/**
 * 1、Object类是所有类的父类
 * @author Administrator
 *
 */
//声明一个类的时候，默认是继承了Object 
//public class Hero extends Object
public class Hero extends Object{
	
    String name; //姓名
    
    float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed; //移动速度
    
    /**
     * 2、toString()
     */
    //Object类提供一个toString方法，所以所有的类都有toString方法
    //toString()的意思是返回当前对象的字符串表达
    //通过 System.out.println 打印对象就是打印该对象的toString()返回值
    public String toString(){
    	return name;
    }
    
    public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "盖伦";
		System.out.println(h.toString());
		//直接打印对象就是打印该对象的toString()返回值
		System.out.println(h);
	}
}
