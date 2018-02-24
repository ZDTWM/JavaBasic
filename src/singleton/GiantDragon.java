package singleton;

public class GiantDragon {
	/**
	 * 1������ģʽ��
	 * 	����ģʽ�ֽ��� Singletonģʽ��ָ����һ���࣬��һ��JVM�ֻ��һ��ʵ�����ڡ�
	 */
	/**
	 * 2������ʽ����ģʽ
	 */
	//˽�л����췽��ʹ�ø����޷����ⲿͨ��new ����ʵ����
	private GiantDragon(){
		
	}
	
	//׼��һ�������ԣ�ָ��һ��ʵ�������� ��Ϊ�������ԣ�����ֻ��һ��
	private static GiantDragon instance = new GiantDragon();
	
	//public static �������ṩ�������߻�ȡ12�ж���Ķ���
	public static GiantDragon getInstance(){
		return instance;
	}
}
