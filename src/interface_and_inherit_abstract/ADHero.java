package interface_and_inherit_abstract;

public class ADHero extends Hero implements AD{

	@Override
	public void physicAttack() {
		System.out.println("����������");
		
	}
	
	@Override
	public void attack() {
		physicAttack();
		
	}



}
