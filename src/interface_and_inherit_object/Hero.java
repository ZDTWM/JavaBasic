package interface_and_inherit_object;
/**
 * 1��Object����������ĸ���
 * @author Administrator
 *
 */
//����һ�����ʱ��Ĭ���Ǽ̳���Object 
//public class Hero extends Object
public class Hero extends Object{
	
    String name; //����
    
    float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed; //�ƶ��ٶ�
    
    /**
     * 2��toString()
     */
    //Object���ṩһ��toString�������������е��඼��toString����
    //toString()����˼�Ƿ��ص�ǰ������ַ������
    //ͨ�� System.out.println ��ӡ������Ǵ�ӡ�ö����toString()����ֵ
    public String toString(){
    	return name;
    }
    
    public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "����";
		System.out.println(h.toString());
		//ֱ�Ӵ�ӡ������Ǵ�ӡ�ö����toString()����ֵ
		System.out.println(h);
	}
}
