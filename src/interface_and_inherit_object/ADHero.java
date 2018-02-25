package interface_and_inherit_object;
/**
 * 4、equals():
 * 	equals() 用于判断两个对象的内容是否相同
 * 	假设，当两个英雄的hp相同的时候，我们就认为这两个英雄相同
 * @author Administrator
 *
 */
public class ADHero {
	
    public String name;
    protected float hp;
    
    public boolean equals(Object o){
    	if( o instanceof ADHero){
    		ADHero adhero = (ADHero)o;
    		return this.hp == adhero.hp;
    	}
    	return false;
    }
    
    public static void main(String[] args) {
		ADHero adhero1 = new ADHero();
		adhero1.hp = 300;
		ADHero adhero2 = new ADHero();
		adhero2.hp = 400;
		ADHero adhero3 = new ADHero();
		adhero3.hp = 300;
		
		System.out.println(adhero1.equals(adhero2));//false
		System.out.println(adhero1.equals(adhero3));//true
		
		/**
		 * 5、==
		 */
		//这不是Object的方法，但是用于判断两个对象是否相同
		//更准确的讲，用于判断两个引用，是否指向了同一个对象
		System.out.println(adhero1 == adhero2);//false
		System.out.println(adhero1 == adhero3);//false
	}
}
