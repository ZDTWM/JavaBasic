package class_and_object;
/**
 * ���Σ�
 * ��1���������ʹ���
 * ��2�������ʹ���
 * @author Administrator
 *
 */
public class Solider {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	public Solider(String name,float hp){
		this.name = name;
		this.hp = hp;
	}
	// ����һ��Ӣ�ۣ���������damage��Ѫ
	public void attack(Solider solider,int damage){
		solider.hp = solider.hp - damage;
	}
	
	public static void main(String[] args) {
		Solider teemo = new Solider("��Ī",383);
		Solider garen = new Solider("����",616);
		//�������ֽ����� 
		//ͨ������garen.attack(teemo, 100); ʹ�����������ã�29�е�����teemo��20�е�����solider����ָ����ͬһ������ 
		garen.attack(teemo, 100);
		System.out.println(teemo.hp);
		
	}
}
