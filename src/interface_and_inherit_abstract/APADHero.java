package interface_and_inherit_abstract;

public class APADHero extends Hero implements AD,AP{

	@Override
	public void attack() {
		System.out.println("�ȿ��Խ�����������Ҳ���Խ���ħ������");

	}

	@Override
	public void magicAttack() {
		System.out.println("����������");
		
	}

	@Override
	public void physicAttack() {
		System.out.println("����ħ������");
		
	}

}
