package array;

public class Demo02 {

	public static void main(String[] args) {
		/**
		 * 1、分配空间与赋值分步进行
		 */
		int[] a = new int[5];//分配了长度是5的数组，但是没有赋值
        //没有赋值，那么就会使用默认值
        //作为int类型的数组，默认值是0
		System.out.println(a[0]);
		//进行赋值
		a[0] = 100;
		a[1] = 101;
		a[2] = 102;
		a[3] = 103;
		a[4] = 104;
		/**
		 * 2、分配空间，同时赋值
		 */
		//写法一： 分配空间同时赋值
		int[] b = new int[]{100,101,102,103,104};
		//写法二： 省略了new int[],效果一样
		int[] c = {100,101,102,103,104};
		//写法三：同时分配空间，和指定内容
        //在这个例子里，长度是3，内容是5个，产生矛盾了
        //所以如果指定了数组的内容，就不能同时设置数组的长度
		//int[] d = new int[3]{100,101,102,103,104};
		//int [] e = new int [3]{1,2,3};
		System.out.println("------------------------------");
		/**
		 * 3、练习：数组翻转
		 */
		int[] f = new int[5];
		//设置一个随机数组且遍历输出：
		System.out.println("翻转之前的数组：");
		for (int i = 0; i < f.length; i++) {
			f[i] = (int) (Math.random() * 100);
			
			System.out.print("f["+i+"]="+f[i]+" ");
			System.out.println();
		}
		//进行首尾调换
		for (int i = 0; i < f.length/2; i++) {
			int middle  = f[f.length -i -1];
			f[a.length-i-1] = f[i];
			f[i] = middle;
		}
		//遍历输出数组：
		System.out.println("翻转之后的数组：");
		for (int i = 0; i < f.length; i++) {
			
			System.out.print("f["+i+"]="+f[i]+" ");
			System.out.println();
		}
		
	}

}
