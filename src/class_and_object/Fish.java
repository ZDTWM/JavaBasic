package class_and_object;

/**
 * this��
 * ͨ��this��������
 * @author Administrator
 *
 */
public class Fish {
	String name;
	int price;
	float weight;
	String color;
	
    //��������������һ��
    //�ڷ������У�ֻ�ܷ��ʵ�����name
	public void setName1(String name){
		name = name;
	}
	//Ϊ�˱���setName1�е����⣬���������ò�ʹ������������
	public void setName2(String fishname){
		name = fishname;
	}
	//ͨ��this��������
	public void setName3(String name){
        //name������ǲ���name
        //this.name�����������name
		this.name = name;
	}
	public static void main(String[] args) {
		Fish aFish = new Fish();
		aFish.setName1("A��");
		System.out.println(aFish.name);//null �ڷ������У�ֻ�ܷ��ʵ�����name
		
		aFish.setName2("B��");
		System.out.println(aFish.name);//B��
		
		aFish.setName3("C��");
		System.out.println(aFish.name);
	}
}
