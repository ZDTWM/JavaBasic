package work.flow;
/**
 * if
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		/**
		 * 1��if
		 */
		boolean b = true;
		if(b){
			System.out.println("yes");
		}
		/**
		 * 2������ʽ��һ�����ʽ
		 */
		boolean b2 = false;
		//����ж�����ʽ�������ô�������������
		if(b2){
			System.out.println("yes1");
			System.out.println("yes2");
			System.out.println("yes3");
		}
		//������ʽ2 3 ����b�Ƿ�Ϊtrue����ִ��
		if(b2)
			System.out.println("yes4");
			System.out.println("yes5");
			System.out.println("yes6");
		//���ֻ��һ�����ʽ���Բ���д����������ȥ���ԼһЩ	
		if(b2){
			System.out.println("yes7");
		}
		if(b){
			System.out.println("yes8");
		}
		/**
		 * 3��ifʹ�ù����п��������Ŀ�
		 */
		//�ڵ�47�У�if������һ���ֺ�; ���ֺ�Ҳ��һ�������ı��ʽ
		//���b3Ϊtrue����ִ������ֺţ�Ȼ���ӡyes9
		//���b3Ϊfalse������ִ������ֺţ�Ȼ���ӡyes9
		//����������ȥ������ζ����ӡyes9
		boolean b3 = false;
		if(b3);
			System.out.println("yes9");
			
		/**
		 * 4��if...else...:else �������������
		 */
		boolean b4 = false;
		if(b4)
			System.out.println("yes");
		else
			System.out.println("no");
		/**
		 * 5��else...if...��else if�Ƕ������ж�
		 */
		//���ֻʹ�� if,��ִ��4���ж�
		int i = 2;
		if(i==1)
			System.out.println(1);
		if(i==2)
			System.out.println(2);
		if(i==3)
			System.out.println(3);
		if(i==4)
			System.out.println(4);
		 //���ʹ��else if, һ����75�У��жϳ����� 20�к�22�е��жϾͲ���ִ���ˣ���Լ��������Դ
		if(i==1)
			System.out.println(1);
		else if(i==2)
			System.out.println(2);
		else if(i==3)
			System.out.println(3);
		else if(i==4)
			System.out.println(4);
	}

}
