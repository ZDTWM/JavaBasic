package work.flow;
/**
 * continue 
 * ������һ��ѭ��
 * @author Administrator
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		/**
		 * 1��continue
		 * 	�����˫��������Ĵ��벻ִ�У�ֱ�ӽ�����һ��ѭ��
		 */
		//��ӡ����
		for (int i = 0; i < 10; i++) {
			if(0==i%2)
				continue;//�����˫��������Ĵ��벻ִ�У�ֱ�ӽ�����һ��ѭ��
			System.out.println(i);
		}		
		System.out.println("------------------");
		/**
		 * 2����ϰ�����Ա���
		 */
		for (int i = 1; i <= 100; i++) {
			if(0==i%3||0==i%5)
				continue;
			System.out.println(i);
		}
	}

}
