package array;
/**
 * ��ǿ��forѭ���ڱ���һ�������ʱ�����ӿ��
 * @author Administrator
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		/**
		 * 1����ǿ��forѭ��
		 */
		int values [] = new int[]{18,62,68,82,65,9};
		//�������
		System.out.println("���������");
		for (int i = 0; i < values.length; i++) {
			int each = values[i];
			System.out.println(each);
		}
		System.out.println("��ǿ��forѭ��������");
		//��ǿ��forѭ������
		for (int each : values) {
			System.out.println(each);
		}
		/**
		 * 2����ϰ����ǿ��forѭ���ҳ�������
		 */
		int max = -1;
		for (int each : values) {
			if(each > max)
				max = each;
		}
		System.out.println("��������:" + max);
	}

}
