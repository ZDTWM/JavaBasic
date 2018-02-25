package interface_and_inherit.polymorphic.test;

public class Hero {
	
	public String name;
	protected float hp;
	
	public void kill(Mortal m){
		m.die();
	}
	
	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name = "����";
		ADHero adhero = new ADHero();
		adhero.name = "EZ";
		APHero aphero = new APHero();
		aphero.name = "����";
		ADAPHero adaphero = new ADAPHero();
		adaphero.name = "�ͽ�";
		
		hero.kill(adhero);
		hero.kill(aphero);
		hero.kill(adaphero);
	}
	
}
