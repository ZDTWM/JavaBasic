package class_and_object;
/**
 * ���췽����
 * 	ͨ��һ���ഴ��һ������������̽���ʵ���� 
 * 	ʵ������ͨ�����ù��췽��(�ֽ���������)ʵ�ֵ�
 * @author Administrator
 *
 */
public class Cat {
	String name;
	int price;
	String color;
	float weight;
	/**
	 * 1��ʲô�ǹ��췽��
	 */
	//������������һ����������Сд��
	//û�з�������
	//ʵ����һ�������ʱ�򣬱�Ȼ���ù��췽��
	public Cat(){
		System.out.println("ʵ����һ�������ʱ�򣬱�Ȼ���ù��췽��");
	}
	
	/**
	 * 2����ʽ�Ĺ��췽��
	 */
    //����޲εĹ��췽���������д��
    //�ͻ�Ĭ���ṩһ���޲εĹ��췽��
	//public Cat(){
	//	System.out.println("ʵ����һ�������ʱ�򣬱�Ȼ���ù��췽��");
	//}	
	
	/**
	 * 3������ṩ��һ���вεĹ��췽��
	 */
	//һ���ṩ��һ���вεĹ��췽�� 
	//ͬʱ��û����ʽ���ṩһ���޲εĹ��췽�� 
	//��ôĬ�ϵ��޲εĹ��췽������ û����
	
	//��һ�������Ĺ��췽��
	public Cat(String catname){
		name = catname;
	}
	/**
	 * 4�����췽��������
	 */
	//����ͨ����һ�������췽��Ҳ��������
	//�����������Ĺ��췽��
	public Cat(String catname,float catweight){
		name = catname;
		weight = catweight;
	}
	/**
	 * 5����ϰ��4�������Ĺ��췽��
	 * 
	 */
	public Cat(String catname,int catprice,float catweight,String catcolor){
		name = catname;
		price = catprice;
		weight = catweight;
		color = catcolor;
	}
	public static void main(String[] args) {
		//1��ʵ����һ�������ʱ�򣬱�Ȼ���ù��췽��
		Cat aCat = new Cat();
		
		//3���вεĹ��췽��
		Cat bCat = new Cat("����");
	}
	
}
