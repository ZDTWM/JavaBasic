package interface_and_inherit.polymorphic;
/**
 * ��Ķ�̬��
 * 	ʹ�ö�̬
 * @author Administrator
 *
 */
	/*�����Ʒ�������ر�࣬��ô����Ҫ��ƺܶ�ķ���
	����useArmor,useWeapon�ȵ�
	
	���ʱ����ö�̬������������
	���һ����������useItem�������������Item
	�����ʹ��Ѫƿ�����ø÷���
	�����ʹ��ħƿ�����ǵ��ø÷���
	����Ӣ��Ҫʹ��ʲô������Ʒ��ֻ��Ҫһ����������*/
public class APHero {
	
    public String name;
    protected float hp;
    
    //ʹ�ö�ֻ̬Ҫһ�������Ϳ�����
    public void useItem(Item item){
    	item.effect();
    }
    
    public static void main(String[] args) {
		APHero aphero = new APHero();
		aphero.name = "ħ��������Ӣ��";
		
		LifePotion lp = new LifePotion();
		MagicPotion mp = new MagicPotion();
		
		aphero.useItem(lp);
		aphero.useItem(mp);
	}
}
