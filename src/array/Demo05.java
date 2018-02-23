package array;
/**
 * 增强型for循环在遍历一个数组的时候会更加快捷
 * @author Administrator
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		/**
		 * 1、增强型for循环
		 */
		int values [] = new int[]{18,62,68,82,65,9};
		//常规遍历
		System.out.println("常规遍历：");
		for (int i = 0; i < values.length; i++) {
			int each = values[i];
			System.out.println(each);
		}
		System.out.println("增强的for循环遍历：");
		//增强型for循环遍历
		for (int each : values) {
			System.out.println(each);
		}
		/**
		 * 2、练习：增强的for循环找出最大的数
		 */
		int max = -1;
		for (int each : values) {
			if(each > max)
				max = each;
		}
		System.out.println("最大的数是:" + max);
	}

}
