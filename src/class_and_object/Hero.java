package class_and_object;

public class Hero {
	String name;//����
	float hp;//Ѫ��
	float armor;//����
	float moveSpeed;//�ƶ��ٶ�
	/**
	 * 1�����ú�ָ��
	 */
	//����һ������
	//new Hero();
	//ʹ��һ��������ָ���������
	Hero h = new Hero();
	/**
	 * 2��������ã�һ������
	 */
	//ʹ��һ��������ָ���������
	Hero h1 = new Hero();
	Hero h2 = h1;//h2ָ��h1��ָ��Ķ���
	Hero h3 = h1;
	Hero h4 = h1;
	Hero h5 = h4;
	//h1,h2,h3,h4,h5 ������ã���ָ��ͬһ������
	/**
	 * 3��һ�����á��������
	 */
	Hero garen = new Hero();
	//garen = new Hero();
}
