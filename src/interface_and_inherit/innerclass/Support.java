package interface_and_inherit.innerclass;
/**
 * �ڲ��ࣺ
 * 	��1���Ǿ�̬�ڲ���
 *  ��2����̬�ڲ���
 *  ��3��������
 *  ��4��������
 * @author Administrator
 *
 */
public abstract class Support {
    String name; //����
    
    float hp; //Ѫ��
          
    float armor; //����
          
    int moveSpeed; //�ƶ��ٶ�
      
    public abstract void attack();
    
    /**
     * 4��������
     */
    //������������Ϊ�����ֵ������� 
    //���ڲ��಻һ�����ǣ��ڲ�����������ڳ�Ա��λ�ã��������Ժͷ���ƽ�ȵ�λ�á� 
    //�������������һ����ֱ�������ڴ�������棬��������������forѭ����ȵȵط�
    public static void main(String[] args) {
		class SomeHero extends Support{
			@Override
			public void attack() {
				System.out.println(name + "�µĽ����ֶ�");
				
			}			
		}
		SomeHero h = new SomeHero();
		h.name = "�ز�ʦ";
		h.attack();
	}
    
}
