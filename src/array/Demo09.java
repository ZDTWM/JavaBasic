package array;

import java.util.Arrays;

/**
 * Arrays是针对数组的工具类，可以进行 排序，查找，复制填充等功能。
 *  大大提高了开发人员的工作效率。
 * @author Administrator
 *
 */
public class Demo09 {

	public static void main(String[] args) {
		/**
		 * 1、数组复制
		 */
		int a[] = new int[]{18, 62, 68, 82, 65, 9};
        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
		int b[] = Arrays.copyOfRange(a, 0,3);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
		}
		/**
		 * 2、转换为字符串
		 */
		int c[] = new int[]{18, 62, 68, 82, 65, 9 };
		String content = Arrays.toString(c);
		System.out.println(content);
		/**
		 * 3、排序
		 */
		int d[] = new int[]{18, 62, 68, 82, 65, 9};
		System.out.println("排序前:");
		System.out.println(Arrays.toString(d));
		Arrays.sort(d);
		System.out.println("排序后:");
		System.out.println(Arrays.toString(d));
		System.out.println("-------------------------");
		/**
		 * 4、搜索
		 */
		//查询元素出现的位置
		//需要注意的是，使用binarySearch进行查找之前，必须使用sort进行排序
		//如果数组中有多个相同的元素，查找结果是不确定的
		int e[] = new int[]{18, 62, 68, 82, 65, 9};
		Arrays.sort(e);
		System.out.println(Arrays.toString(e));
		//使用binarySearch之前，必须先使用sort进行排序
		System.out.println("数字 62 出现的位置：" + Arrays.binarySearch(e, 62));
		/**
		 * 5、判断是否相同
		 */
        int f[] = new int[] { 18, 62, 68, 82, 65, 9 };
        int g[] = new int[] { 18, 62, 68, 82, 65, 8 };
		int h[] = new int[] { 18, 62, 68, 82, 65, 9 };
		System.out.println(Arrays.equals(f, g));
		System.out.println(Arrays.equals(f, h));
		
		/**
		 * 6、填充
		 */
		int i[] = new int[10];
		Arrays.fill(i, 5);
		System.out.println(Arrays.toString(i));
	}

}
