package singleton;

public class GiantDragon {
	/**
	 * 1、单例模式：
	 * 	单例模式又叫做 Singleton模式，指的是一个类，在一个JVM里，只有一个实例存在。
	 */
	/**
	 * 2、饿汉式单例模式
	 */
	//私有化构造方法使得该类无法在外部通过new 进行实例化
	private GiantDragon(){
		
	}
	
	//准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个
	private static GiantDragon instance = new GiantDragon();
	
	//public static 方法，提供给调用者获取12行定义的对象
	public static GiantDragon getInstance(){
		return instance;
	}
}
