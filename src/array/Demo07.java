package array;

public class Demo07 {

	public static void main(String[] args) {
		//int randomLength = (int) (Math.random() *5) + 5;
		//System.out.println(randomLength);
		int[] a = new int[(int) ((Math.random()* 5) + 5)];
		int[] b = new int[(int) ((Math.random()* 5) + 5)];
		//������a�����ֵ
		System.out.println("����a:");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random()* 100);
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		//������b�����ֵ
		System.out.println("����b:");
		for (int i = 0; i < b.length; i++) {
			b[i] = (int) (Math.random()* 100);
			System.out.print(b[i] + " ");
		}
		//����һ������c��������a�ĳ��Ⱥ�b�ĳ���֮��
		int[] c = new int[a.length+ b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println();
		System.out.println("����c��");
		//��ǿ��forѭ���������
		for(int i : c){
			System.out.print(i + " ");
		}
		
	}

}
