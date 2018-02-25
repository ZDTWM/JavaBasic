package interface_and_inherit_object;
/**
 * 4��equals():
 * 	equals() �����ж���������������Ƿ���ͬ
 * 	���裬������Ӣ�۵�hp��ͬ��ʱ�����Ǿ���Ϊ������Ӣ����ͬ
 * @author Administrator
 *
 */
public class ADHero {
	
    public String name;
    protected float hp;
    
    public boolean equals(Object o){
    	if( o instanceof ADHero){
    		ADHero adhero = (ADHero)o;
    		return this.hp == adhero.hp;
    	}
    	return false;
    }
    
    public static void main(String[] args) {
		ADHero adhero1 = new ADHero();
		adhero1.hp = 300;
		ADHero adhero2 = new ADHero();
		adhero2.hp = 400;
		ADHero adhero3 = new ADHero();
		adhero3.hp = 300;
		
		System.out.println(adhero1.equals(adhero2));//false
		System.out.println(adhero1.equals(adhero3));//true
		
		/**
		 * 5��==
		 */
		//�ⲻ��Object�ķ��������������ж����������Ƿ���ͬ
		//��׼ȷ�Ľ��������ж��������ã��Ƿ�ָ����ͬһ������
		System.out.println(adhero1 == adhero2);//false
		System.out.println(adhero1 == adhero3);//false
	}
}
