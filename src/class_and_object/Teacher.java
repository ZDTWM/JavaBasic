package class_and_object;
/**
 * ������
 * @author Administrator
 *
 */
public class Teacher {
	/**
	 * 1��������
	 */
	//�����ԣ� �ֽ�����̬���� 
	//�������ԣ� �ֽ�ʵ�����ԣ��Ǿ�̬���� 
	//���һ�����������������ԣ���ô���еĶ��󣬶�������ôһ��ֵ 
	//��Ӣ������һ�������Խ�������Ȩ" (copyright), �����ж��ٸ������Ӣ�ۣ����е�Ӣ�۵İ�Ȩ������ Riot Games��˾��
	public String name;//ʵ�����ԣ��������ԣ��Ǿ�̬����
	protected float hp;
	static String copyright;//�����ԣ���̬����
	
	public static void main(String[] args) {
		Teacher teacher1 = new Teacher();
		teacher1.name = "��ʦ1";
		Teacher.copyright = "�������е���ʦ";
		System.out.println(teacher1.name);
		System.out.println(teacher1.copyright);
		/**
		 * 2����ϰ��ͨ��teacher1���޸�copyright
		 * 		teacher2��copyrightҲ��ı�
		 * 	��Ϊ������ֻ��һ������ͬ�Ķ��󶼹�����ôһ��������
		 */
		teacher1.copyright = "������ʦ";
		
		Teacher teacher2 = new Teacher();
		teacher2.name = "��ʦ2";
		System.out.println(teacher2.name);
		System.out.println(teacher2.copyright);
		
	}
}
