package interface_and_inherit_object;
/**
 * finalize()
 * 
 * @author Administrator
 *
 */
//��һ������û���κ�����ָ���ʱ�����������������յ�����
//�������������յ�ʱ������finalize() �����ͻᱻ���á�
//finalize() ���ǿ�����Ա�������õķ����������������JVM���õ�
public class Item {
	
    public String name;
    protected float hp;
    
    public void finalize(){
    	System.out.println("���Ӣ�����ڱ�����");
    }
    
    public static void main(String[] args) {
		Item item;
		for (int i = 0; i < 100000; i++) {
            //���������µĶ���
            //ÿ����һ������ǰһ�����󣬾�û������ָ����
            //��Щ���󣬾������������յ�����
            //���������ѻ��ıȽ϶��ʱ�򣬾ͻᴥ����������
            //һ��������󱻻��գ�����finalize()�����ͻᱻ����
			item = new Item();
		}
	}
    
}	
