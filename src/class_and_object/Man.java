package class_and_object;
/**
 * ���Գ�ʼ��
 * @author Administrator
 *
 */
public class Man {
	/**
	 * 1���������Գ�ʼ��
	 * 	1�����������Ե�ʱ���ʼ��
	 *  2�����췽���г�ʼ��
	 *  3����ʼ����
	 */
	public String name = "some man";//���������Ե�ʱ���ʼ��
	protected float hp;
	float maxHP;
	{
		maxHP = 200;//��ʼ����
	}
	public Man(){
		hp = 100;//���췽���г�ʼ��
	}
	
	/**
	 * 2�������Գ�ʼ��
	 * 	��1�����������Ե�ʱ���ʼ��
	 * 	��2����̬��ʼ����
	 */
	//��Ʒ��������
	public static int itemCapacity = 8;//������ʱ���ʼ��
	static {
		itemCapacity = 6;//��̬��ʼ����   ��ʼ��
	}
	
	public static void main(String[] args) {
		System.out.println(Man.itemCapacity);
	}
	
}
