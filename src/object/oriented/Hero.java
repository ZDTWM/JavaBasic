package object.oriented;

public class Hero {
	String name;//����
	float hp;//Ѫ��
	float armor;//����
	int moveSpeed;//�ƶ��ٶ�
	/**
	 * 1���޷���ֵ���͵ķ���
	 */
	//�Ӷ���
	void keng(){
		System.out.println("�Ӷ���");
	}
	/**
	 * 2���з���ֵ���͵ķ���
	 * @return
	 */
	//��ȡ����
	float getArmor(){
		return armor;
	}
	/**
	 * 3�������Ĳ���
	 * @param speed
	 */
	//�����ƶ��ٶ�
	void addSpeed(int speed){
		//��ԭ���Ļ����������ٶ�
		moveSpeed = moveSpeed + speed;
	}
	public static void main(String[] args) {
		Hero garen  = new Hero();
		garen.name = "����";
		garen.hp = 417.01f;
		garen.armor = 45.9f;
		garen.moveSpeed = 315;
		
		Hero temmo = new Hero();
		temmo.name = "��Ī";
		temmo.hp = 342.4f;
		temmo.armor = 34.5f;
		temmo.moveSpeed = 315;
	}
}
