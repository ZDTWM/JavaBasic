package interface_and_inherit.charactor;

public class ADAPHero extends Hero implements AD,AP{

	@Override
	public void magicAttack() {
		System.out.println("Ä§·¨¹¥»÷");
		
	}

	@Override
	public void physicAttack() {
		System.out.println("ÎïÀí¹¥»÷");
		
	}
	
}
