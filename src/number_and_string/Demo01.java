package number_and_string;
/**
 * װ�����
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		
		/**
		 * 1����װ��
		 */
		//���еĻ������ͣ����ж�Ӧ�������� 
		//����int��Ӧ������Integer 
		//������ͽ�����װ��
		int i = 5;
		//��һ���������͵ı���,ת��ΪInteger����
		Integer it = new Integer(i);
		//��һ��Integer����ת��Ϊһ���������͵�int
		int i2 = it.intValue();
		
		/**
		 * 2��Number��
		 */
		//Number�����ࣺByte��Short��Long��Float��Double
		int a = 5;
		Integer it2 = new Integer(a);
		System.out.println(it2 instanceof Number);//true
		/**
		 * 3����������ת��װ��
		 */
		int b = 5;
		//��������ת���ɷ�װ����
		Integer it3 = new Integer(b);
		
		/**
		 * 4����װ��ת��������
		 */	
		int c = 5;
		//��������ת���ɷ�װ����
		Integer it4 = new Integer(c);
		//��װ����ת���ɻ�������
		int d = it4.intValue();
		/**
		 * 5���Զ�װ��
		 */	
		//����Ҫ���ù��췽����ͨ��=�����Զ��� �������� ת��Ϊ ������ �ͽ�װ��
		int e = 5;
		 //��������ת���ɷ�װ����
		Integer it5 = new Integer(e);
		//�Զ�ת���ͽ�װ��
		Integer it6 = e;
		
		/**
		 * 6���Զ�����
		 */
		//����Ҫ����Integer��intValue������ͨ��=���Զ�ת����int���ͣ��ͽв���
		int f = 5;
		//��������ת���ɷ�װ����
		Integer it7 = new Integer(f);
		//��װ����ת���ɻ�������
		int g = it7.intValue();
		//�Զ�ת���ͽв���
		int h = it7;
		/**
		 * 7��int�����ֵ����Сֵ
		 */	
		//int�����ֵ����ͨ�����Ӧ�ķ�װ��Integer.MAX_VALUE��ȡ
		//int���ֵ
		System.out.println(Integer.MAX_VALUE);
		//int��Сֵ
		System.out.println(Integer.MIN_VALUE);
		/**
		 * 8����ϰ
		 */	
		// 1. ��byte,short,float,double�����Զ�������Զ�װ��
		byte b1 = 2;
		short s = 3;
		float f1 = 3.2F;
		double d1 = 3.24;
		//�Զ�װ��
		Byte by = b1;
		Short sh = s;
		Float fl = f1;
		Double dou = d1;
		//�Զ�����
		b1 = by;
		s = sh;
		f1 = fl;
		d1 = dou;
		
		//2. byte��Integer֮���ܷ�����Զ�������Զ�װ��
		byte b3 = 3;
		//Integer inte = b3;//���ܰ�byteֱ���Զ�װ���Integer
		//b3 = new Integer(2);//Ҳ���ܰ�Integer�Զ������ byte
		
		//3.ͨ��Byte��ȡbyte�����ֵ
		System.out.println(Byte.MAX_VALUE);//127
		System.out.println(Short.MAX_VALUE);//32767
	}
	
	
}
