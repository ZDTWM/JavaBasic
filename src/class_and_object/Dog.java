package class_and_object;
/**
 * this:
 * 	this����ؼ��֣��൱����ͨ����ġ��ҡ� 
 * 	С��˵ ���ҳ��ˡ� ���ʱ�򣬡��ҡ� ����С�� 
 * 	С��˵ ���ҳ��ˡ� ���ʱ�򣬡��ҡ� ����С�� 
 * 	"��"����ǰ���� 
 * 	this����ؼ��֣��൱����ͨ����ġ��ҡ� 
 * 	this������ǰ����
 * @author Administrator
 *
 */
public class Dog {
	String name;
	float weight;
	String color;
	int price;
	/**
	 * 1��this����ǰ����
	 */
	//��ӡ�ڴ��е������ַ
	public void showAddressInMemory(){
		System.out.println("��ӡthis�����������ַ��" + this);
	}
	
	public static void main(String[] args) {
		Dog aDog = new Dog();
		aDog.name = "A��";
        //ֱ�Ӵ�ӡ���󣬻���ʾ�ö������ڴ��е������ַ
        //��ʽ��class_and_object.Dog@139a55�������ַ��ÿ��ִ�У��õ��ĵ�ַ��һ��һ��
		System.out.println("��ӡ���󿴵��������ַ��" + aDog);
		//����showAddressInMemory����ӡ�ö����this��
		//��ʾ��ͬ�������ַ��class_and_object.Dog@139a55
		aDog.showAddressInMemory();
		
		Dog bDog = new Dog();
		bDog.name = "B��";
		System.out.println("��ӡ���󿴵��������ַ��" + bDog);//class_and_object.Dog@1db9742
		bDog.showAddressInMemory();//class_and_object.Dog@1db9742
		
	}
}
