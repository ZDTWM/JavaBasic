package variable.quantity;

public class Demo04 {

	public static void main(String[] args) {
		/**
		 * 1��ת������
		 */
		char c = 'A';
		short s = 80;
        //��Ȼshort��char����16λ�ģ�������һ����
        //���Ǳ˴�֮�䣬��Ȼ��Ҫ����ǿ��ת��
		c = (char) s;
		s = (short) c;
		//ֱ�ӽ���ת��������ֱ������
		//s = c;//Type mismatch: cannot convert from short to char
		//c = s ;
		/**
		 * 2���;�����߾���ת��
		 */
		long l = 50L;
		int i = 50;
		//int�Ƚ�С��Ҫ�Ž��Ƚϴ��long,�����ô�������ŵĽ�ȥ
		l = i;
		i = (int) l;
		/**
		 * 3���߾�����;���ת��
		 */
		byte b = 5;
		System.out.println(b);//5
		int i1 = 10;
		int i2 = 300;
		b = (byte) i1;
        //��Ϊi1��ֵ����byte��Χ֮�ڣ����Լ������ǿ��ת��
        //���õ���ֵ��Ҳ��10
		System.out.println(b);//10
		i1 = b;
        //��Ϊi2��ֵ����byte��Χ֮�⣬���Ծͻᰴ��byte�ĳ��Ƚ��н�ȡ
        //i2��ֵ��300�����Ӧ�Ķ��������� 100101100
        //����byte�ĳ���8λ���н�ȡ����ֵΪ 00101100 ��44
		b = (byte) i2;
		System.out.println(b);
		/**
		 * ע���鿴һ��������Ӧ�����Ƶķ�����
		 */
		System.out.println(Integer.toBinaryString(i2));//100101100
	}

}
