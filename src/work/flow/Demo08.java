package work.flow;
/**
 * �ۺ���ϰ
 * @author Administrator
 *
 */
public class Demo08 {

	public static void main(String[] args) {
		/**
		 * 1���ƽ�ָ��
		 * 	Ѱ��ĳ��������������� ��ƽ�ָ�� 0.618���
		 * 	��ĸ�ͷ��Ӳ���ͬʱΪż��
		 * 	��ĸ�ͷ��� ȡֵ��Χ��[1-20]
		 */
        int range = 20; // ȡֵ��Χ
        float breakPoint = 0.618f; // �ƽ�ָ��
 
        float minDiff = 100; // ��ƽ�ָ��Ĳ�ֵ
        int answerFenzi = 0; // �ҵ��ķ���
        int answerFenmu = 0; // �ҵ��ķ�ĸ
        for (int fenzi = 1; fenzi <= range; fenzi++) {
            for (int fenmu = 1; fenmu <= range; fenmu++) {
                // ��ĸ�ͷ��Ӳ���ͬʱΪż��
                if (0 == fenzi % 2 & 0 == fenmu % 2)
                    continue;
 
                // ȡֵ
                float value = (float) fenzi / fenmu;
                // ȡ��ƽ�ָ��Ĳ�ֵ
                float diff = value - breakPoint;
                // ����ֵ
                diff = diff < 0 ? 0 - diff : diff;
 
                // �ҳ���С�Ĳ�ֵ
                if (diff < minDiff) {
                    minDiff = diff;
                    answerFenzi = fenzi;
                    answerFenmu = fenmu;
                }
            }
        }
 
        System.out.println("��ƽ�ָ��(" + breakPoint + ")������������ദ��:" + answerFenzi + "/" + answerFenmu + "="
                + ((float) answerFenzi / answerFenmu));
		System.out.println("---------------------------------");
		/**
		 * 2��ˮ�ɻ���
		 * 	1) һ����3λ��
		 * 	2) ÿһλ��������������ǡ�����������������153=1*1*1+5*5*5+3*3*3
		 */
        for (int i = 100; i < 1000; i++) {
        	 
            int baiwei = i / 100;
            int shiwei = i / 10 % 10;
            int gewei = i % 10;
            int cube = baiwei * baiwei * baiwei + shiwei * shiwei * shiwei + gewei * gewei * gewei;
            if (cube == i) {
                System.out.println("�ҵ�ˮ�ɻ���:" + i);
            }
            
        }
        System.out.println("------------------------");
        /**
         * 3��
         */
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
 
        for (a = -100; a <= 100; a++) {
            for (b = -100; b <= 100; b++) {
                for (c = -100; c <= 100; c++) {
                    for (d = -100; d <= 100; d++) {
                            if(a+b==8&&c-d==6&&a+c==14&&b+d==10){
                                 
                                System.out.println("a:"+a);
                                System.out.println("b:"+b);
                                System.out.println("c:"+c);
                                System.out.println("d:"+d);
                                 
                            }
                    }
                }
            }
        }
        
	}

}
