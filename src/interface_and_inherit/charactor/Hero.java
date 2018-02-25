package interface_and_inherit.charactor;

public class Hero {
	String name;
	float hp;
	int moveSpeed;
	float armor;
	
	public static void main(String[] args) {
		/**
		 * 1、子类型转父类型（向上转型）
		 */
		Hero h = new Hero();
		ADHero ad = new ADHero();
        //类型转换指的是把一个引用所指向的对象的类型，转换为另一个引用的类型
        
        //把ad引用所指向的对象的类型是ADHero
        //h引用的类型是Hero
        //把ADHero当做Hero使用，一定可以
		
		h = ad;
		/**
		 * 2、父类转子类（向下转型）
		 */
		Support s = new Support();
		h = ad;
		ad = (ADHero) h;
		h = s;
		//ad = (ADHero) h;// java.lang.ClassCastException:类型转换异常
		
		/**
		 * 3、没有继承关系的两个类，互相转换
		 */
		ADHero ad1 = new ADHero();
		APHero ap1 = new APHero();
		//没有继承关系的类型进行互相转换一定会失败，所以会出现编译错误
		//ad = (ADHero)ap;
		
		/**
		 * 4、实现类转换成接口(向上转型)
		 */
		ADHero ad2 = new ADHero();
		AD adi2 = ad2;
		
		/**
		 * 5、接口转换成实现类（向下转型）
		 */
		ADHero ad3 = new ADHero();
		AD adi3 = ad3;
		ADHero adhero3 = (ADHero) adi3;
		//ADAPHero adaphero3 = (ADAPHero) adi3;//java.lang.ClassCastException：类型转换异常
		//adaphero3.magicAttack();
		
		/**
		 * 6、instanceof Hero 判断一个引用所指向的对象，是否是Hero类型，或者Hero的子类
		 */
		ADHero ad4 = new ADHero();
		APHero ap4 = new APHero();
		
		Hero h1 = ad4;
		Hero h2 = ap4;
		
		//判断引用h1指向的对象，是否是ADHero类型
		System.out.println(h1 instanceof ADHero);//true
		//判断引用h2指向的对象，是否是APHero类型
		System.out.println(h2 instanceof APHero);//true
		//判断引用h1指向的对象，是否是Hero的子类型
		System.out.println(h1 instanceof Hero);
	}
}
