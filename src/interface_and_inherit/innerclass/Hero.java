package interface_and_inherit.innerclass;


/**
 * �ڲ��ࣺ
 * 	��1���Ǿ�̬�ڲ���
 *  ��2����̬�ڲ���
 *  ��3��������
 *  ��4��������
 * @author Administrator
 *
 */
public class Hero {
	
    private String name; // ����
    
    float hp; // Ѫ��
 
    float armor; // ����
 
    int moveSpeed; // �ƶ��ٶ�
    
    public Hero(){
    	
    }
    
    public Hero(String name){
    	this.name = name;
    }
    /**
     * 1���Ǿ�̬�ڲ���
     * 
     */
    //�Ǿ�̬�ڲ��� BattleScore ��ս���ɼ���
    //�Ǿ�̬�ڲ������ֱ����һ�������涨��

    //���磺
    //ս���ɼ�ֻ����һ��Ӣ�۶�����ڵ�ʱ���������
    //����ʵ����BattleScore ��ʱ�򣬱��뽨����һ�����ڵ�Ӣ�۵Ļ�����
    //�﷨: new �ⲿ��().new �ڲ���()
    //��ΪHero�ķǾ�̬�ڲ��࣬�ǿ���ֱ�ӷ����ⲿ���privateʵ������name��
    
    class BattleScore{
    	int kill;
    	int die;
    	int assit;
    	
    	public void legendary(){
    		if(kill >= 8)
    			System.out.println(name + "����");
    		else
    			System.out.println(name + "��δ����");
    	}
    	
    }
    
    public static void main(String[] args) {
        // ʵ�����ڲ���
        // BattleScore����ֻ����һ��Ӣ�۶�����ڵ�ʱ���������
        // ������ʵ�������뽨����һ���ⲿ�����Ļ���֮��
    	//�﷨: new �ⲿ��().new �ڲ���()
		BattleScore score = new Hero("����").new BattleScore();
		score.kill = 9;
		score.legendary();
	}
    
}
