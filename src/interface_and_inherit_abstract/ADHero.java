package interface_and_inherit_abstract;

public class ADHero extends Hero implements AD{

	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
		
	}
	
	@Override
	public void attack() {
		physicAttack();
		
	}



}
