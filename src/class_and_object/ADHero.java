package class_and_object;

public class ADHero extends Hero{
	/**
	 * 1��attack����������
	 */
	public void attack(){
		 System.out.println(name + " ������һ�ι��� �����ǲ�ȷ������˭��");
		 
	}
	public void attack(Hero h1){
		 System.out.println(name + "��" + h1.name + "������һ�ι��� ");
	}
	public void attack(Hero h1,Hero h2){
		System.out.println(name + "ͬʱ��" + h1.name + "��" + h2.name + "�����˹��� ");
	}
	/**
	 * 2���ɱ������Ĳ���
	 */
	//ֻ��Ҫ���һ������
	//public void attack(Hero ...heros)
	//���ɴ����������еķ�����
	//�ڷ����ʹ�ò�������ķ�ʽ�������heros����
	public void attack (Hero ...heros){
		for (int i = 0; i < heros.length; i++) {
			System.out.println(name + "������" + heros[i].name);
		}
	}
	public static void main(String[] args) {
		
		ADHero bh = new ADHero();
		bh.name = "�ͽ�";
		Hero h1 = new Hero();
		h1.name = "����";
		Hero h2 = new Hero();
		h2.name = "��Ī";
		Hero h3 = new Hero();
		h3.name = "ѩ��";
		bh.attack();
		bh.attack(h1);
		bh.attack(h1,h2);
		System.out.println("---------------------------------");
		bh.attack(h1,h2,h3);
	}
}
