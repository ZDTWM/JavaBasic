package variable.quantity;
/**
 * final 修饰一个变量，有很多种说法，比如不能改变等等 
 * 准确的描述是 当一个变量被final修饰的时候，该变量只有一次赋值的机会
 * @author Administrator
 *
 */
public class Demo07 {
	
	/**
	 * 1、在声明的时候赋值
	 */
	public void method1(){
		final int i = 5;
		//i = 10;//i在第14行已经被赋值过了，所以这里会出现编译错误
		System.out.println(i);
	}
	/**
	 * 2、在声明的时候没有赋值
	 */
	public void method2(){
		final int i;
		i = 10;//i在第21行，只是被声明，但是没有被赋值，所以在这里可以进行第一次赋值
		//i = 11;//i在第22行已经被赋值过了，所以这里会出现编译错误
		System.out.println(i);
	}
	/**
	 * 3、注：如果final修饰的是参数，能否在方法里给这个参数赋值？答：不可以，因为在调用方法的时候，就一定会第一次赋值了，后面不能再进行多次赋值
	 * @param i
	 */
	public void method3(final int i){
		//i = 5;//编译出错，不可以，因为在调用方法的时候，就一定会第一次赋值了，后面不能再进行多次赋值
		System.out.println(i);
	}
	public static void main(String[] args) {
		Demo07 demo = new Demo07();
		demo.method1();
		demo.method2();
		demo.method3(3);
	}

}
