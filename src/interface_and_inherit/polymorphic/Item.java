package interface_and_inherit.polymorphic;

public class Item {
	
	String name;
	int price;
	
    public void buy(){
        System.out.println("����");
    }
	
	public void effect(){
		System.out.println("��Ʒʹ�ú󣬿�����Ч�� ");
	}
	
	public static void main(String[] args) {
		/**
		 * ��Ķ�̬������
		 * 	1. ���ࣨ�ӿڣ�����ָ���������
		 *  2. ���õķ�������д
		 */
		Item item1 = new LifePotion();
		Item item2 = new MagicPotion();
		System.out.print("item1��Item���ͣ�ִ��effect��ӡ:");
		item1.effect();
		System.out.print("item2��Item���ͣ�ִ��effect��ӡ:");
		item2.effect();
	}
	
}
