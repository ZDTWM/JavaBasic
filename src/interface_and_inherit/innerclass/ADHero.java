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
public class ADHero {
	
    public String name;
    protected float hp;
    
    private static void battleWin(){
    	System.out.println("battle win");
    }
    
	//��һ������������һ����̬�ڲ���
	//����з�ˮ�������з�ˮ��û��Ѫ��ʱ�򣬼�������Ӣ�۶�ȡ��ʤ��������ֻ��ĳһ�������Ӣ��ȡ��ʤ����
	//��Ǿ�̬�ڲ��಻ͬ����̬�ڲ���ˮ�����ʵ���� ����Ҫһ���ⲿ���ʵ��Ϊ����������ֱ��ʵ����
	//�﷨��new �ⲿ��.��̬�ڲ���();
	//��Ϊû��һ���ⲿ���ʵ���������ھ�̬�ڲ������治���Է����ⲿ���ʵ�����Ժͷ���
	//���˿��Է����ⲿ���˽�о�̬��Ա�⣬��̬�ڲ������ͨ��ûʲô�������
	/**
	 * 2����̬�ڲ���
	 */
    static class EnemyCrystal{
    	int hp = 5000;
    	public void checkIfVictory(){
    		if(hp == 0){
    			ADHero.battleWin();
    		//��̬�ڲ��಻��ֱ�ӷ����ⲿ��Ķ�������
    		//System.out.println(name + " win this game");
    		}else{
    			System.out.println("��δʤ��");
    		}
    	}
    }
    
    public static void main(String[] args) {
    	//ʵ������̬�ڲ���
    	//�﷨��new �ⲿ��.��̬�ڲ���();
		ADHero.EnemyCrystal crystal = new ADHero.EnemyCrystal();
		crystal.checkIfVictory();
	}
    
}
