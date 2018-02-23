package class_and_object;

public class Hero {
	String name;//姓名
	float hp;//血量
	float armor;//护甲
	float moveSpeed;//移动速度
	/**
	 * 1、引用和指向
	 */
	//创建一个对象
	//new Hero();
	//使用一个引用来指向这个对象
	Hero h = new Hero();
	/**
	 * 2、多个引用，一个对象
	 */
	//使用一个引用来指向这个对象
	Hero h1 = new Hero();
	Hero h2 = h1;//h2指向h1所指向的对象
	Hero h3 = h1;
	Hero h4 = h1;
	Hero h5 = h4;
	//h1,h2,h3,h4,h5 五个引用，都指向同一个对象
	/**
	 * 3、一个引用、多个对象
	 */
	Hero garen = new Hero();
	//garen = new Hero();
}
