package operator;
/**
 * �߼�������
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		/**
		 * 1����·��Ͷ�·�� & ��&&
		 */
		int i = 2;
		//��·��  ���۵�һ�����ʽ��ֵ��true����false,�ڶ�����ֵ�����ᱻ����
		System.out.println(i==1 & i++ ==2);
		//�������i++���ᱻִ�У�����i��ֵ�����3
		System.out.println(i);
		//��·�� ֻҪ��һ�����ʽ��ֵ��false�ģ��ڶ������ʽ��ֵ���Ͳ���Ҫ����������
		int j = 2;
		//��Ϊj==1����false,�����ұߵ�j++��û��ִ���ˣ�����j��ֵ������2
		System.out.println(j == 1 && j++ ==2);
		/**
		 * 2����·��Ͷ�·�� | �� ||
		 */
		//��·��  ���۵�һ�����ʽ��ֵ��true����false,�ڶ�����ֵ�����ᱻ����
		int a = 2;
		//�������i++���ᱻִ�У�����i��ֵ�����3
		System.out.println(i==1 | i++ ==2);
		//��·�� ֻҪ��һ�����ʽ��ֵ��true�ģ��ڶ������ʽ��ֵ���Ͳ���Ҫ����������
		int b = 2;
		//��Ϊj==2����true,�����ұߵ�j++��û��ִ���ˣ�����j��ֵ������2
		System.out.println(b ==2 || b++ ==2);
		/**
		 * 3��ȡ����
		 */
		boolean c = true;
		System.out.println(c);//true
		System.out.println(!c);//false
		/**
		 * 4�����^
		 */
		boolean d = true;
		boolean e = false;
		System.out.println(d^e);//true
		System.out.println(d^!e);//false
	}

}
