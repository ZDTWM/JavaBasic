package interface_and_inherit_abstract;
/**
 * ������
 * @author Administrator
 *
 */
public abstract class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
    // ���󷽷�attack
    // Hero������ᱻҪ��ʵ��attack����
	public abstract void attack();
	
	public void die(){
		System.out.println(name + "���Ӣ������");
	}
	
	public static void main(String[] args) {
		//һ��������Ϊ�˳����࣬�Ͳ��ܹ�ֱ�ӱ�ʵ����
		//Hero hero = new Hero();
	}
	
}
