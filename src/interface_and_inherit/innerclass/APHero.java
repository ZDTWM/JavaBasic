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
public abstract class APHero {
	
    String name; //����
    
    float hp; //Ѫ��
          
    float armor; //����
          
    int moveSpeed; //�ƶ��ٶ�
    
    public abstract void attack();
    /**
     * 3�������ڲ���
     */
    //������ָ����������һ�����ͬʱʵ��������ʹ������Ӽ�ྫ��
    //ͨ������£�Ҫʹ��һ���ӿڻ��߳����࣬�����봴��һ������

    //�е�ʱ��Ϊ�˿���ʹ�ã�ֱ��ʵ����һ�������࣬����������ʵ������󷽷���
    //��Ȼʵ���˳��󷽷�����ô����һ���µ��ֻ࣬������࣬û��������
    //�������࣬����������
    public static void main(String[] args) {
        APHero ap = new APHero(){
        	//����ʵ��attack����
    		@Override
    		public void attack() {
    			System.out.println("�µĹ����ֶ�");
    			
    		}
        	
        };
        ap.attack();
        System.out.println(ap);//APHero$1@1db9742
	}
    
    
}
