package array;

import java.util.Arrays;

/**
 * Arrays���������Ĺ����࣬���Խ��� ���򣬲��ң��������ȹ��ܡ�
 *  �������˿�����Ա�Ĺ���Ч�ʡ�
 * @author Administrator
 *
 */
public class Demo09 {

	public static void main(String[] args) {
		/**
		 * 1�����鸴��
		 */
		int a[] = new int[]{18, 62, 68, 82, 65, 9};
        // copyOfRange(int[] original, int from, int to)
        // ��һ��������ʾԴ����
        // �ڶ���������ʾ��ʼλ��(ȡ�õ�)
        // ������������ʾ����λ��(ȡ����)
		int b[] = Arrays.copyOfRange(a, 0,3);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
		}
		/**
		 * 2��ת��Ϊ�ַ���
		 */
		int c[] = new int[]{18, 62, 68, 82, 65, 9 };
		String content = Arrays.toString(c);
		System.out.println(content);
		/**
		 * 3������
		 */
		int d[] = new int[]{18, 62, 68, 82, 65, 9};
		System.out.println("����ǰ:");
		System.out.println(Arrays.toString(d));
		Arrays.sort(d);
		System.out.println("�����:");
		System.out.println(Arrays.toString(d));
		System.out.println("-------------------------");
		/**
		 * 4������
		 */
		//��ѯԪ�س��ֵ�λ��
		//��Ҫע����ǣ�ʹ��binarySearch���в���֮ǰ������ʹ��sort��������
		//����������ж����ͬ��Ԫ�أ����ҽ���ǲ�ȷ����
		int e[] = new int[]{18, 62, 68, 82, 65, 9};
		Arrays.sort(e);
		System.out.println(Arrays.toString(e));
		//ʹ��binarySearch֮ǰ��������ʹ��sort��������
		System.out.println("���� 62 ���ֵ�λ�ã�" + Arrays.binarySearch(e, 62));
		/**
		 * 5���ж��Ƿ���ͬ
		 */
        int f[] = new int[] { 18, 62, 68, 82, 65, 9 };
        int g[] = new int[] { 18, 62, 68, 82, 65, 8 };
		int h[] = new int[] { 18, 62, 68, 82, 65, 9 };
		System.out.println(Arrays.equals(f, g));
		System.out.println(Arrays.equals(f, h));
		
		/**
		 * 6�����
		 */
		int i[] = new int[10];
		Arrays.fill(i, 5);
		System.out.println(Arrays.toString(i));
	}

}
