package interface_and_inherit.hide;

import interface_and_inherit.charactor.AD;

public class ADHero extends Hero implements AD{

	@Override
	public void physicAttack() {
		System.out.println("����������");
		
	}
	//���ظ����battleWin����
	public static void battleWin(){
		System.out.println("ad hero battle win");
	}
	
	public static void main(String[] args) {
		Hero.battleWin();
		ADHero.battleWin();
	}
	
	
}
