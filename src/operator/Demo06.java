package operator;
/**
 * Scanner���÷�
 */
import java.util.Scanner;

public class Demo06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/**
		 * 1��ʹ��Scanner��ȡ����
		 */
		System.out.println("������һ��������");
		int a = scan.nextInt();
		System.out.println("��ȡ�������ǣ�" + a);
		/**
		 * 2��ʹ��Scanner��ȡ������
		 */
		System.out.println("������һ����������");
		float b = scan.nextFloat();
		System.out.println("��ȡ�ĸ������ǣ�" + b);
		/**
		 * 3��ʹ��Scanner��ȡ�ַ���
		 */
		System.out.println("������һ���ַ�����");
		String rn = scan.nextLine();//��ȡ�������󣬽��Ŷ�ȡ�ַ���
		String str = scan.nextLine();
		System.out.println("������ַ����ǣ�" + str);
		/**
		 * 4����ȡ�������󣬽��Ŷ�ȡ�ַ���
		 * 
		 */
/*		��Ҫע����ǣ������ͨ��nextInt()��ȡ���������ٽ��Ŷ�ȡ�ַ�����
		���������ǻس�����:"\r\n",��ΪnextInt������ȡ������Ϣ����������߻س�����"\r\n".

		���ԣ������ҵ������Ҫ��ȡ�������󣬽��Ŷ�ȡ�ַ�����
		��ô��Ӧ������ִ������nextLine()����һ����ȡ���������ڶ��β��Ƕ�ȡ�������ַ���*/
	}

}
