package interface_and_inherit.polymorphic;
/**
 * ��̬��
 * 	�������Ķ�̬
 * @author Administrator
 *
 */
public class Hero {
	
	public String name;
	protected float hp;
	
	public static void main(String[] args) {
		
		int i = 5;
		int j = 6;
		int k = i + j;//���+�����඼�����ͣ���ô+���� �������
		System.out.println(k);
		
		int a = 5;
		String b = "5";
		String c = a + b;
		System.out.println(c);//���+�����࣬����һ�����ַ�������ô+�����ַ�������
		
	}
}
