package operator;
/**
 * ����������
 */
import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		/**
		 * 1�������������������ӡ������ˡ���
		 */
		int a = 10;
		int b = 5;
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a / b;
		/**
		 * 2����ϰ-���
		 */
		Scanner scan  = new Scanner(System.in);
		System.out.println("�������һ��������");
		int g = scan.nextInt();
		System.out.println("������ڶ���������");
		int h = scan.nextInt();
		int i = g + h;
		System.out.println("�������ĺ�Ϊ��" + i);
		/**
		 * 3���������㵥Ԫ�ĳ��ȳ���int:
		 * 	������κ����㵥Ԫ�ĳ��ȳ���int,��ô�������Ͱ�����ĳ��ȼ��� 
		 */
		int j = 5;
		long k = 6;
		int l = (int) (j + k);//a+b����������long�ͣ�����Ҫ����ǿ��ת��
		long m = j + k;
		/**
		 * 4���������㵥Ԫ�ĳ���С��int
		 * 	����κ����㵥Ԫ�ĳ��ȶ�������int,��ô�������Ͱ���int������ 
		 */
		byte n = 1;
		byte o = 2;
		byte p = (byte) (n + o);//��Ȼa b����byte���ͣ�������������int���ͣ���Ҫ����ǿ��ת��
		int q = n + o;
		/**
		 * 5��% ȡ�������ֽ�ȡģ 
		 */
		int r = 5;
		int s = 2;
		System.out.println(r%s);//���Ϊ1
		/**
		 * 6���������Լ�
		 * 	++
		 * 	--
		 */
		int t = 5;
		t++;
		System.out.println(t);//6
		/**
		 * 7������ �Լ���������ǰ�Լ��ú������
		 * 	i++����ȡֵ��������
		 * 	++i�������㣬��ȡֵ
		 */
		int u = 5;
		System.out.println(u++);
		System.out.println(u);
		int v = 5;
		System.out.println(++v);
		System.out.println(v);
	}

}
