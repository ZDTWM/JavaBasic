package array;

public class Demo07 {

	public static void main(String[] args) {
		//int randomLength = (int) (Math.random() *5) + 5;
		//System.out.println(randomLength);
		int[] a = new int[(int) ((Math.random()* 5) + 5)];
		int[] b = new int[(int) ((Math.random()* 5) + 5)];
		//给数组a赋随机值
		System.out.println("数组a:");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random()* 100);
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		//给数组b赋随机值
		System.out.println("数组b:");
		for (int i = 0; i < b.length; i++) {
			b[i] = (int) (Math.random()* 100);
			System.out.print(b[i] + " ");
		}
		//声明一个数组c：长度是a的长度和b的长度之和
		int[] c = new int[a.length+ b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println();
		System.out.println("数组c：");
		//增强的for循环遍历输出
		for(int i : c){
			System.out.print(i + " ");
		}
		
	}

}
