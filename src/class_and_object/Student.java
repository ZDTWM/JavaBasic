package class_and_object;

public class Student {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	public Student(){
		
	}
	
	public Student(String name,float hp){
		this.name = name;
		this.hp = hp;
	}
	
	//��Ѫ
	//�������ʹ��� 
	//�ڷ����ڣ��޷��޸ķ�����Ļ������Ͳ���
	//xp = 0,�����xueping = 100�޷��޸ģ�
	public void huixue(int xp){
		hp = hp + xp;
		//��Ѫ��Ϻ�Ѫƿ=0
		xp = 0;
	}
	
	public static void main(String[] args) {
		Student student = new Student("��Ī",383);
		//Ѫƿ����ֵ��100
		int xueping = 100;
		//��Īͨ�����Ѫƿ��Ѫ
		student.huixue(xueping);
		System.out.println(xueping);//100
	}
	
}
