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
	
	//回血
	//基本类型传参 
	//在方法内，无法修改方法外的基本类型参数
	//xp = 0,下面的xueping = 100无法修改！
	public void huixue(int xp){
		hp = hp + xp;
		//回血完毕后，血瓶=0
		xp = 0;
	}
	
	public static void main(String[] args) {
		Student student = new Student("提莫",383);
		//血瓶，其值是100
		int xueping = 100;
		//提莫通过这个血瓶回血
		student.huixue(xueping);
		System.out.println(xueping);//100
	}
	
}
