package array;

public class Demo01 {

	public static void main(String[] args) {
		/**
		 * 1����������
		 */
		//����һ������
		int[] a;
		int b[];//����û�����𣬿�ϰ��
		/**
		 * 2����������
		 */
		//����һ������
		int [] c;
		//����һ��������5�����飬����ʹ������cָ�������
		c = new int[5];
		int d[] = new int[4];//������ͬʱ��ָ��һ������
		
		/**
		 * 3����������
		 * 	�����±��0
		 */
		int e[];
		e = new int[5];
		e[0] = 1; //�±�0������������ĵ�һ����
		e[1] = 2;
		e[2] = 3;
		e[3] = 4;
		e[4] = 5;
		/**
		 * 4�����鳤��
		 * 	.length�������ڷ���һ������ĳ���
		 */
		int f[];
		f = new int[5];
		System.out.println(f.length);//��ӡ����ĳ���
		f[4] = 100;//�±�4��ʵ�����ǡ���5�����������һ��
		//f[5] = 101;//�±�5��ʵ�����ǡ���6������������Χ ,���������±�Խ���쳣
		System.out.println("-------------------------------");
		/**
		 * 5����ϰ �������������С����
		 */
		int[] g = new int[5];
		int min = 100;
		for (int i = 0; i < g.length; i++) {
			g[i] = (int) (Math.random() * 100);
			System.out.print(g[i] + " ");
			System.out.println();
			if(g[i] < min){
				min = g[i];
			}
		}
		System.out.println("��������С�����ǣ�"+min);

		
	}

}
