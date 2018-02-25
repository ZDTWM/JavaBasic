package interface_and_inherit_abstract;

public interface AP {
	/**
	 * 抽象类和接口的区别
	 */
/*	区别1：
	子类只能继承一个抽象类，不能继承多个
	子类可以实现多个接口
	区别2：
	抽象类可以定义
	public,protected,package,private
	静态和非静态属性
	final和非final属性
	但是接口中声明的属性，只能是
	public
	静态
	final的
	即便没有显示的声明

	注: 抽象类和接口都可以有实体方法。 接口中的实体方法，叫做默认方法*/
	
	public static final int resisPhysic = 100;
    //resistMagic即便没有显式的声明为 public static final
    //但依然默认为public static final
	int resistMagic = 0;
	
	public void magicAttack();
	
}
