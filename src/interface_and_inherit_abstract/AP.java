package interface_and_inherit_abstract;

public interface AP {
	/**
	 * ������ͽӿڵ�����
	 */
/*	����1��
	����ֻ�ܼ̳�һ�������࣬���ܼ̳ж��
	�������ʵ�ֶ���ӿ�
	����2��
	��������Զ���
	public,protected,package,private
	��̬�ͷǾ�̬����
	final�ͷ�final����
	���ǽӿ������������ԣ�ֻ����
	public
	��̬
	final��
	����û����ʾ������

	ע: ������ͽӿڶ�������ʵ�巽���� �ӿ��е�ʵ�巽��������Ĭ�Ϸ���*/
	
	public static final int resisPhysic = 100;
    //resistMagic����û����ʽ������Ϊ public static final
    //����ȻĬ��Ϊpublic static final
	int resistMagic = 0;
	
	public void magicAttack();
	
}
