package interface_and_inherit_final;
/**
 * 1����Hero�����γ�final��ʱ�򣬱�ʾHero���ܹ����̳�
 * 	    ���������ֱ������
 * @author Administrator
 *
 */
public final class Hero {
	/**
	 * 5������
	 * 	����ָ���ǿ��Թ�����ֱ�ӷ��ʣ�����仯��ֵ 
	 * 	���� itemTotalNumber ��Ʒ����������6��
	 */
	public static final int itemTotalNumber = 6;//��Ʒ��������
    String name; //����
    
    float mp ;//����
    
    float hp; //Ѫ��
    /**
     * 2��final���η���
     * Hero��useItem���������γ�final,��ô�÷�����ADHero�У����ܹ�����д
     * @param i
     */
    public final void uesItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }
    
    public static void main(String[] args) {
		/**
		 * 3��final���λ������ͱ�������ʾ�ñ���ֻ��һ�θ�ֵ���� 
		 */
    	
    	final int hp;
    	hp = 5;
    	//hp = 6;
    	
    	/**
    	 * 4��final ��������
    	 */
    	//final��������
    	//h���ñ����γ�final����ʾ������ֻ��1��ָ�����Ļ���
    	//����17�л���ֱ������
    	//���ǣ���Ȼͨ��h�����޸Ķ��������ֵhp����Ϊhp��û��final����
    	final Hero h;
    	h = new Hero();
    	//h = new Hero();
    	h.mp = 5;
	}
    
}
