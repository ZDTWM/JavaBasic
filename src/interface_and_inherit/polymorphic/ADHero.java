package interface_and_inherit.polymorphic;
/**
 * ��Ķ�̬����ʹ�ö�̬
 * @author Administrator
 *
 */
	/*�����ʹ�ö�̬��
	����Ӣ��Ҫʹ��Ѫƿ��ħƿ������ҪΪHero�����������
	useLifePotion
	useMagicPotion
	
	����Ѫƿ��ħƿ���кܶ�����Ʒ����ô����Ҫ��ƺܶ�ܶ������������
	usePurityPotion ����ҩˮ
	useGuard ����
	useInvisiblePotion ʹ������ҩˮ
	�ȵȵȵ�*/
public class ADHero {
	
    public String name;
    protected float hp;
    
    public void useLifePotion(LifePotion lp){
    	lp.effect();
    }
    
    public void useMagicPotion(MagicPotion mp){
    	mp.effect();
    }
    
    public static void main(String[] args) {
    	
		ADHero adhero = new ADHero();
		adhero.name = "��������Ӣ��";
		LifePotion lp = new LifePotion();
		MagicPotion mp = new MagicPotion();
		adhero.useLifePotion(lp);
		adhero.useMagicPotion(mp);
		
	}
    
}
