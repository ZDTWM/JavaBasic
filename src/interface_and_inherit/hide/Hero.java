package interface_and_inherit.hide;
/**
 * ���أ�
 * 	����д���ƣ���������д�����า�Ǹ���Ķ��󷽷� 
 * 	���أ��������า�Ǹ�����෽��
 * @author Administrator
 *
 */
public class Hero {
	
    public String name;
    protected float hp;
    
    //�෽������̬����
    //ͨ����Ϳ���ֱ�ӵ���
    public static void battleWin(){
    	System.out.println("hero battle win");
    }
    /**
     * ��ϰ��
     * 
     */
    //h.battleWin(); //battleWin��һ���෽��
    //h�Ǹ������͵�����
    //����ָ��һ���������
    //h.battleWin(); ����ø���ķ�������������ķ�����
    public static void main(String[] args) {
		Hero h = new ADHero();
		h.battleWin();//hero battle win
		h=null;
		h.battleWin();//hero battle win
	}
    
}
