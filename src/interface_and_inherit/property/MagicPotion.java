package interface_and_inherit.property;

public class MagicPotion extends Item{
	/**
	 * ��ϰ����д
	 */
	public void effect(){
		System.out.println("���Իظ�ħ��ֵ");
	}
	
	public static void main(String[] args) {
		MagicPotion magicPotion = new MagicPotion();
		magicPotion.effect();
	}
	
}
