package class_and_object;
/**
 * this��
 * ͨ��this���������Ĺ��췽��
 * ���Ҫ��һ�����췽���У�������һ�����췽��������ʹ��this()
 * @author Administrator
 *
 */
public class Pig {
	String name;
	String color;
	int price;
	float weight;
	
	//��һ�������Ĺ��췽��
	public Pig(String name){
		System.out.println("һ�������Ĺ��췽��");
		this.name = name;
	}
	//�����������Ĺ��췽��
	public Pig(String name,float weight){
		//���Ҫ��һ�����췽���У�������һ�����췽��������ʹ��this()
		this(name);
		System.out.println("���������Ĺ��췽��");
		this.weight = weight;
	}
	
	public static void main(String[] args) {
		Pig aPig = new Pig("����",383);
		System.out.println(aPig.name);
	}
}
