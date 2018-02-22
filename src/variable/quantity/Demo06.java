package variable.quantity;

public class Demo06 {
	/**
	 * 1、字段、属性、成员变量、Field:
	 * 	当一个变量被声明在类下面，变量叫做：字段、属性、成员变量、Field
	 */
	int i = 1;
	int j = i;
	//方法一：
	public void method1(){
		System.out.println(i);
	}
	//方法二：
	public void method2(){
		System.out.println(j);
	}
	/**
	 * 2、参数：如果一个变量，是声明在一个方法上的，就叫做参数
	 * 	（1）参数的作用域即为该方法内的所有代码
	 * 	（2）其他方法不能访问该参数
	 * 	（3）类里面也不能访问该参数
	 * @param i
	 */
	//方法三：
	public void method3(int i){//参数i的作用域即方法method3
		System.out.println(i);
	}
	/**
	 * 3、局部变量：
	 * 	声明在方法内的变量，叫做局部变量
	 * 	其作用域在声明开始的位置，到其所处于的块结束位置
	 * @param args
	 */
	public void method4(){
		int i = 5;
		System.out.println(i);
		{//子块
			System.out.println(i);//可以访问i
			int j1 = 6;
			System.out.println(j1);//可以访问j
		}
		//System.out.println(j1);不能访问j1,因为其作用域到第42行就结束了
	}
	public static void main(String[] args) {
		Demo06 demo = new Demo06();
		demo.method1();
		demo.method2();
		demo.method3(2);
		System.out.println("------------");
		demo.method4();
	}

}
