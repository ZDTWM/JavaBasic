package class_and_object;
/**
 * 1���෽��
 * @author Administrator
 *
 */
public class Bird {
	
	//�෽���� �ֽ�����̬����
	//���󷽷��� �ֽ�ʵ���������Ǿ�̬����
	//����һ�����󷽷������뽨������һ�������ǰ��Ļ�����
	//�����෽��������Ҫ����Ĵ��ڣ�ֱ�Ӿͷ���
	public String name;
	protected float hp;
	
    //ʵ������,���󷽷����Ǿ�̬����
    //�����ж�����ܹ�����
	public void die(){
		hp = 0;
	}
	
    //�෽������̬����
    //ͨ����Ϳ���ֱ�ӵ���
	public static void battleWin(){
		System.out.println("battle win");
	}
	
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.name = "С��";
		//������һ��������ܵ���
		bird.die();
		
		Bird bird2 = new Bird();
		bird2.name = "С��2";
		
		//�������ֱ��ͨ�������
		Bird.battleWin();
		/**
		 * 2�������෽��
		 * 	��1������.�෽��
		 *  ��2����.�෽��
		 */
		bird2.battleWin();
		Bird.battleWin();
	}
}
