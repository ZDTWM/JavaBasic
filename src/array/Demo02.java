package array;

public class Demo02 {

	public static void main(String[] args) {
		/**
		 * 1������ռ��븳ֵ�ֲ�����
		 */
		int[] a = new int[5];//�����˳�����5�����飬����û�и�ֵ
        //û�и�ֵ����ô�ͻ�ʹ��Ĭ��ֵ
        //��Ϊint���͵����飬Ĭ��ֵ��0
		System.out.println(a[0]);
		//���и�ֵ
		a[0] = 100;
		a[1] = 101;
		a[2] = 102;
		a[3] = 103;
		a[4] = 104;
		/**
		 * 2������ռ䣬ͬʱ��ֵ
		 */
		//д��һ�� ����ռ�ͬʱ��ֵ
		int[] b = new int[]{100,101,102,103,104};
		//д������ ʡ����new int[],Ч��һ��
		int[] c = {100,101,102,103,104};
		//д������ͬʱ����ռ䣬��ָ������
        //����������������3��������5��������ì����
        //�������ָ������������ݣ��Ͳ���ͬʱ��������ĳ���
		//int[] d = new int[3]{100,101,102,103,104};
		//int [] e = new int [3]{1,2,3};
		System.out.println("------------------------------");
		/**
		 * 3����ϰ�����鷭ת
		 */
		int[] f = new int[5];
		//����һ����������ұ��������
		System.out.println("��ת֮ǰ�����飺");
		for (int i = 0; i < f.length; i++) {
			f[i] = (int) (Math.random() * 100);
			
			System.out.print("f["+i+"]="+f[i]+" ");
			System.out.println();
		}
		//������β����
		for (int i = 0; i < f.length/2; i++) {
			int middle  = f[f.length -i -1];
			f[a.length-i-1] = f[i];
			f[i] = middle;
		}
		//����������飺
		System.out.println("��ת֮������飺");
		for (int i = 0; i < f.length; i++) {
			
			System.out.print("f["+i+"]="+f[i]+" ");
			System.out.println();
		}
		
	}

}
