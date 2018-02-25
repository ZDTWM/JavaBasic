package interface_and_inherit.charactor;

public class Hero {
	String name;
	float hp;
	int moveSpeed;
	float armor;
	
	public static void main(String[] args) {
		/**
		 * 1��������ת�����ͣ�����ת�ͣ�
		 */
		Hero h = new Hero();
		ADHero ad = new ADHero();
        //����ת��ָ���ǰ�һ��������ָ��Ķ�������ͣ�ת��Ϊ��һ�����õ�����
        
        //��ad������ָ��Ķ����������ADHero
        //h���õ�������Hero
        //��ADHero����Heroʹ�ã�һ������
		
		h = ad;
		/**
		 * 2������ת���ࣨ����ת�ͣ�
		 */
		Support s = new Support();
		h = ad;
		ad = (ADHero) h;
		h = s;
		//ad = (ADHero) h;// java.lang.ClassCastException:����ת���쳣
		
		/**
		 * 3��û�м̳й�ϵ�������࣬����ת��
		 */
		ADHero ad1 = new ADHero();
		APHero ap1 = new APHero();
		//û�м̳й�ϵ�����ͽ��л���ת��һ����ʧ�ܣ����Ի���ֱ������
		//ad = (ADHero)ap;
		
		/**
		 * 4��ʵ����ת���ɽӿ�(����ת��)
		 */
		ADHero ad2 = new ADHero();
		AD adi2 = ad2;
		
		/**
		 * 5���ӿ�ת����ʵ���ࣨ����ת�ͣ�
		 */
		ADHero ad3 = new ADHero();
		AD adi3 = ad3;
		ADHero adhero3 = (ADHero) adi3;
		//ADAPHero adaphero3 = (ADAPHero) adi3;//java.lang.ClassCastException������ת���쳣
		//adaphero3.magicAttack();
		
		/**
		 * 6��instanceof Hero �ж�һ��������ָ��Ķ����Ƿ���Hero���ͣ�����Hero������
		 */
		ADHero ad4 = new ADHero();
		APHero ap4 = new APHero();
		
		Hero h1 = ad4;
		Hero h2 = ap4;
		
		//�ж�����h1ָ��Ķ����Ƿ���ADHero����
		System.out.println(h1 instanceof ADHero);//true
		//�ж�����h2ָ��Ķ����Ƿ���APHero����
		System.out.println(h2 instanceof APHero);//true
		//�ж�����h1ָ��Ķ����Ƿ���Hero��������
		System.out.println(h1 instanceof Hero);
	}
}
