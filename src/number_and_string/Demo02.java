package number_and_string;

import java.util.Arrays;

/**
 * �ַ���ת��
 * @author Administrator
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 1������ת�ַ���
		 */
		int a = 5;
		//����һ��ʹ��String��ľ�̬����valueOf 
		String str = String.valueOf(a);
		//���������Ȱѻ�������װ��Ϊ����Ȼ����ö����toString
		int b = 4;
		Integer it = b;
		String str2 = it.toString();
		/**
		 * 2���ַ���ת����
		 */
		String str3 = "123";
		int c = Integer.parseInt(str3);
		System.out.println(c);
		/**
		 * 3������תΪ�ַ���
		 */
		int[] s = new int[]{1,2,3};
		System.out.println(Arrays.toString(s));
		/**
		 * 4����ϰ: 
		 * 	�Ѹ����� 3.14 ת��Ϊ �ַ��� "3.14"
		 * 	�ٰ��ַ��� ��3.14�� ת��Ϊ ������ 3.14
		 */
		float f = 3.14F;
		//����һ��ʹ��String��ľ�̬����valueOf
		String str4 = String.valueOf(f);
		//���������Ȱѻ�������װ��Ϊ����Ȼ����ö����toString
		Float flo = f;
		String str5 = flo.toString();
		
		String str6 = "3.14";
		float f2 = Float.parseFloat(str6);
		
		String str7 = "3.1a4";
		Float f3 = Float.parseFloat(str7);
		
		System.out.println(f2);
		//����ַ������ݲ��ǺϷ������ֱ���ôת���ͻᱨ��(�׳��쳣)
		//System.out.println(f3);
		
	}
}
