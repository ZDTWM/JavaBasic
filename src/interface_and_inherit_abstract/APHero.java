package interface_and_inherit_abstract;

public class APHero extends Hero implements AP{
	
	@Override
	public void magicAttack() {
		System.out.println("����ħ������");
	}
	
	
	@Override
	public void attack() {
		magicAttack();
		
	}


}
