package interface_and_inherit_super;
/**
 * super
 * @author Administrator
 *
 */
public class Hero {
	
    String name; //����
    
    float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed; //�ƶ��ٶ�
    /**
     * 1��׼��һ����ʽ�ṩ�޲ι��췽���ĸ���
     */
    public Hero(){
    	System.out.println("Hero���޲ι��췽��");
    }
    
    public Hero(String name){
    	System.out.println("Hero����һ�������Ĺ��췽��");
    	this.name = name;
    }
    
    public void useItem(Item item){
    	System.out.println("hero use item");
    	item.effect();
    }
    
    public static void main(String[] args) {
		new Hero();
	}
    
}
