package interface_and_inherit.property;

public class LifePoint extends Item {
	
	public void effect(){
		System.out.println("Ѫƿʹ�ú󣬿��Ի�Ѫ");
	}
	
	public static void main(String[] args) {
		/**
		 * ������д�ķ���
		 */
		Item item = new Item();
		item.effect();//��Ʒʹ�ú󣬿�����Ч��
		
		LifePoint lifePoint  = new LifePoint();
		lifePoint.effect();//"Ѫƿʹ�ú󣬿��Ի�Ѫ"
	}
}
