package variable.quantity;
/**
 * final ����һ���������кܶ���˵�������粻�ܸı�ȵ� 
 * ׼ȷ�������� ��һ��������final���ε�ʱ�򣬸ñ���ֻ��һ�θ�ֵ�Ļ���
 * @author Administrator
 *
 */
public class Demo07 {
	
	/**
	 * 1����������ʱ��ֵ
	 */
	public void method1(){
		final int i = 5;
		//i = 10;//i�ڵ�14���Ѿ�����ֵ���ˣ������������ֱ������
		System.out.println(i);
	}
	/**
	 * 2����������ʱ��û�и�ֵ
	 */
	public void method2(){
		final int i;
		i = 10;//i�ڵ�21�У�ֻ�Ǳ�����������û�б���ֵ��������������Խ��е�һ�θ�ֵ
		//i = 11;//i�ڵ�22���Ѿ�����ֵ���ˣ������������ֱ������
		System.out.println(i);
	}
	/**
	 * 3��ע�����final���ε��ǲ������ܷ��ڷ���������������ֵ���𣺲����ԣ���Ϊ�ڵ��÷�����ʱ�򣬾�һ�����һ�θ�ֵ�ˣ����治���ٽ��ж�θ�ֵ
	 * @param i
	 */
	public void method3(final int i){
		//i = 5;//������������ԣ���Ϊ�ڵ��÷�����ʱ�򣬾�һ�����һ�θ�ֵ�ˣ����治���ٽ��ж�θ�ֵ
		System.out.println(i);
	}
	public static void main(String[] args) {
		Demo07 demo = new Demo07();
		demo.method1();
		demo.method2();
		demo.method3(3);
	}

}
