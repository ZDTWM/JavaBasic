package array;
/**
 * 数组的长度是不可变的，一旦分配好空间，是多长，就多长，不能增加也不能减少
 * @author Administrator
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 1、复制数组
		 */
		//把一个数组的值，复制到另一个数组中：
		//System.arraycopy(src, srcPos, dest, destPos, length)
		//src: 源数组
		//srcPos: 从源数组复制数据的起始位置
		//dest: 目标数组
		//destPos: 复制到目标数组的起始位置
		//length: 复制的长度
        int a [] = new int[]{18,62,68,82,65,9};
        int b[] = new int[3];//分配了长度是3的空间，但是没有赋值
        //通过数组赋值把，a数组的前3位赋值到b数组
		//方法一：for循环
        for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
        //把内容打印出来
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.println("-----------------------------");
        //方法二：
        int c[] = new int[4];
        System.arraycopy(a, 1, c, 1, 3);//从数组a的第一个位置，复制三个长度到从数组c第二个位置起。
        //把内容打印出来
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
	}
}
