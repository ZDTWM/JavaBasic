package work.flow;
/**
 * break:
 * 直接结束当前循环
 * @author Administrator
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		/**
		 * 1、break
		 */
		for (int i = 0; i < 10; i++) {
			if(0==i%2)
				break;//如果是双数，直接结束循环
			System.out.println(i);
		}
		System.out.println("ss");

	}

}
