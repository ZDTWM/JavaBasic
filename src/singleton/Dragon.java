package singleton;
/**
 * 3������ģʽ������ʽ����ģʽ
 * 	����ʽ����ģʽ�����ʽ����ģʽ��ͬ��ֻ���ڵ���getInstance��ʱ�򣬲Żᴴ��ʵ��
 * @author Administrator
 *
 */
public class Dragon {
	//˽�л����췽��ʹ�ø����޷����ⲿͨ��new ����ʵ����
	private Dragon(){
		
	}
	
	//׼��һ�������ԣ�����ָ��һ��ʵ�������󣬵�����ʱָ��null
	private static Dragon instance;
	
	//public static ����������ʵ������
	public static Dragon getInstance(){
		//��һ�η��ʵ�ʱ�򣬷���instanceû��ָ���κζ�����ʱʵ����һ������
		if(null == instance){
			instance = new Dragon();
		}
		//���� instanceָ��Ķ���
		return instance;
	}
	
	
}
