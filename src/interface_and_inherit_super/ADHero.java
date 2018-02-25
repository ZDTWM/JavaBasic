package interface_and_inherit_super;

import interface_and_inherit.charactor.AD;

public class ADHero extends Hero implements AD{
	
	int moveSpeed = 400;//�ƶ��ٶ�
	
	@Override
	public void physicAttack() {
		System.out.println("����������");
		
	}
	
	public int getMoveSpeed(){
		return this.moveSpeed;
	}
	/**
	 * 5��ʹ��super���ø�������
	 * @return
	 */
	public int getMoveSpeed2(){
		return super.moveSpeed;
	}
	
	/**
	 * 6�����ø��෽��
	 */
	//ADHero��д��useItem������������useItem��ͨ��super���ø����useItem����
	public void useItem(Item item){
		System.out.println("adhero use item");
		super.useItem(item);
	}
	
	public ADHero(){
		System.out.println("ADHero���޲ι��췽��");
	}
	
	public ADHero(String name){
		//ʹ�ùؼ���super ��ʽ���ø�����εĹ��췽��
		super(name);
		System.out.println("ADHero����һ�������Ĺ��췽��");
	}
	
	
	
	public static void main(String[] args) {
		/**
		 * 2��ʵ�������࣬����Ĺ��췽��һ���ᱻ����
		 * 
		 */
/*		ʵ����һ��ADHero(), �乹�췽���ᱻ���� 
		�丸��Ĺ��췽��Ҳ�ᱻ���� 
		�����Ǹ��๹�췽���ȵ��� 
		���๹�췽����Ĭ�ϵ��ø���� �޲εĹ��췽��*/
		new ADHero();
		/**
		 * 4��������ʽ���ø�����ι��췽��
		 */
		new ADHero("������");
		/**
		 * 5��ʹ��super���ø�������
		 */
		ADHero adh = new ADHero();
		System.out.println(adh.getMoveSpeed());//400
		System.out.println(adh.getMoveSpeed2());//0
		/**
		 * 6�����ø��෽��
		 */
		Item item = new Item();
		adh.useItem(item);
	}
}
