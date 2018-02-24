package class_and_object;
/**
 * this:
 * 	this这个关键字，相当于普通话里的“我” 
 * 	小明说 “我吃了” 这个时候，“我” 代表小明 
 * 	小红说 “我吃了” 这个时候，“我” 代表小红 
 * 	"我"代表当前人物 
 * 	this这个关键字，相当于普通话里的“我” 
 * 	this即代表当前对象
 * @author Administrator
 *
 */
public class Dog {
	String name;
	float weight;
	String color;
	int price;
	/**
	 * 1、this代表当前对象
	 */
	//打印内存中的虚拟地址
	public void showAddressInMemory(){
		System.out.println("打印this看到的虚拟地址：" + this);
	}
	
	public static void main(String[] args) {
		Dog aDog = new Dog();
		aDog.name = "A狗";
        //直接打印对象，会显示该对象在内存中的虚拟地址
        //格式：class_and_object.Dog@139a55即虚拟地址，每次执行，得到的地址不一定一样
		System.out.println("打印对象看到的虚拟地址：" + aDog);
		//调用showAddressInMemory，打印该对象的this，
		//显示相同的虚拟地址：class_and_object.Dog@139a55
		aDog.showAddressInMemory();
		
		Dog bDog = new Dog();
		bDog.name = "B狗";
		System.out.println("打印对象看到的虚拟地址：" + bDog);//class_and_object.Dog@1db9742
		bDog.showAddressInMemory();//class_and_object.Dog@1db9742
		
	}
}
