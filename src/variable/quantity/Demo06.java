package variable.quantity;

public class Demo06 {
	/**
	 * 1���ֶΡ����ԡ���Ա������Field:
	 * 	��һ�������������������棬�����������ֶΡ����ԡ���Ա������Field
	 */
	int i = 1;
	int j = i;
	//����һ��
	public void method1(){
		System.out.println(i);
	}
	//��������
	public void method2(){
		System.out.println(j);
	}
	/**
	 * 2�����������һ����������������һ�������ϵģ��ͽ�������
	 * 	��1��������������Ϊ�÷����ڵ����д���
	 * 	��2�������������ܷ��ʸò���
	 * 	��3��������Ҳ���ܷ��ʸò���
	 * @param i
	 */
	//��������
	public void method3(int i){//����i�������򼴷���method3
		System.out.println(i);
	}
	/**
	 * 3���ֲ�������
	 * 	�����ڷ����ڵı����������ֲ�����
	 * 	����������������ʼ��λ�ã����������ڵĿ����λ��
	 * @param args
	 */
	public void method4(){
		int i = 5;
		System.out.println(i);
		{//�ӿ�
			System.out.println(i);//���Է���i
			int j1 = 6;
			System.out.println(j1);//���Է���j
		}
		//System.out.println(j1);���ܷ���j1,��Ϊ�������򵽵�42�оͽ�����
	}
	public static void main(String[] args) {
		Demo06 demo = new Demo06();
		demo.method1();
		demo.method2();
		demo.method3(2);
		System.out.println("------------");
		demo.method4();
	}

}
