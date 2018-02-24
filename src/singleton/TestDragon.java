package singleton;

public class TestDragon {

	public static void main(String[] args) {
		//通过new实例化会报错
		//Dragon g = new Dragon();
		
		//只能通过getInstance得到对象
		Dragon d1 = Dragon.getInstance();
		Dragon d2 = Dragon.getInstance();
		Dragon d3 = Dragon.getInstance();
		
		//都是同一个对象
		System.out.println(d1 == d2);
		System.out.println(d1 == d3);
	}
	/**
	 * 4、什么时候使用饿汉式，什么时候使用懒汉式
	 */
	//饿汉式是立即加载的方式，无论是否会用到这个对象，都会加载。
	//如果在构造方法里写了性能消耗较大，占时较久的代码，比如建立与数据库的连接，那么就会在启动的时候感觉稍微有些卡顿。

	//懒汉式，是延迟加载的方式，只有使用的时候才会加载。 并且有线程安全的考量(鉴于同学们学习的进度，暂时不对线程的章节做展开)。
	//使用懒汉式，在启动的时候，会感觉到比饿汉式略快，因为并没有做对象的实例化。 但是在第一次调用的时候，会进行实例化操作，感觉上就略慢。

	//看业务需求，如果业务上允许有比较充分的启动和初始化时间，就使用饿汉式，否则就使用懒汉式
}
