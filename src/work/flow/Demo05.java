package work.flow;
/**
 * continue 
 * 继续下一次循环
 * @author Administrator
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		/**
		 * 1、continue
		 * 	如果是双数，后面的代码不执行，直接进行下一次循环
		 */
		//打印单数
		for (int i = 0; i < 10; i++) {
			if(0==i%2)
				continue;//如果是双数，后面的代码不执行，直接进行下一次循环
			System.out.println(i);
		}		
		System.out.println("------------------");
		/**
		 * 2、练习：忽略倍数
		 */
		for (int i = 1; i <= 100; i++) {
			if(0==i%3||0==i%5)
				continue;
			System.out.println(i);
		}
	}

}
