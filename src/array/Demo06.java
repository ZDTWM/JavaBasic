package array;
/**
 * ����ĳ����ǲ��ɱ�ģ�һ������ÿռ䣬�Ƕ೤���Ͷ೤����������Ҳ���ܼ���
 * @author Administrator
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 1����������
		 */
		//��һ�������ֵ�����Ƶ���һ�������У�
		//System.arraycopy(src, srcPos, dest, destPos, length)
		//src: Դ����
		//srcPos: ��Դ���鸴�����ݵ���ʼλ��
		//dest: Ŀ������
		//destPos: ���Ƶ�Ŀ���������ʼλ��
		//length: ���Ƶĳ���
        int a [] = new int[]{18,62,68,82,65,9};
        int b[] = new int[3];//�����˳�����3�Ŀռ䣬����û�и�ֵ
        //ͨ�����鸳ֵ�ѣ�a�����ǰ3λ��ֵ��b����
		//����һ��forѭ��
        for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
        //�����ݴ�ӡ����
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.println("-----------------------------");
        //��������
        int c[] = new int[4];
        System.arraycopy(a, 1, c, 1, 3);//������a�ĵ�һ��λ�ã������������ȵ�������c�ڶ���λ����
        //�����ݴ�ӡ����
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
	}
}
