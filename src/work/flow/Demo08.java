package work.flow;
/**
 * 综合练习
 * @author Administrator
 *
 */
public class Demo08 {

	public static void main(String[] args) {
		/**
		 * 1、黄金分割点
		 * 	寻找某两个数相除，其结果 离黄金分割点 0.618最近
		 * 	分母和分子不能同时为偶数
		 * 	分母和分子 取值范围在[1-20]
		 */
        int range = 20; // 取值范围
        float breakPoint = 0.618f; // 黄金分割点
 
        float minDiff = 100; // 离黄金分割点的差值
        int answerFenzi = 0; // 找到的分子
        int answerFenmu = 0; // 找到的分母
        for (int fenzi = 1; fenzi <= range; fenzi++) {
            for (int fenmu = 1; fenmu <= range; fenmu++) {
                // 分母和分子不能同时为偶数
                if (0 == fenzi % 2 & 0 == fenmu % 2)
                    continue;
 
                // 取值
                float value = (float) fenzi / fenmu;
                // 取离黄金分割点的差值
                float diff = value - breakPoint;
                // 绝对值
                diff = diff < 0 ? 0 - diff : diff;
 
                // 找出最小的差值
                if (diff < minDiff) {
                    minDiff = diff;
                    answerFenzi = fenzi;
                    answerFenmu = fenmu;
                }
            }
        }
 
        System.out.println("离黄金分割点(" + breakPoint + ")最近的两个数相处是:" + answerFenzi + "/" + answerFenmu + "="
                + ((float) answerFenzi / answerFenmu));
		System.out.println("---------------------------------");
		/**
		 * 2、水仙花数
		 * 	1) 一定是3位数
		 * 	2) 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3
		 */
        for (int i = 100; i < 1000; i++) {
        	 
            int baiwei = i / 100;
            int shiwei = i / 10 % 10;
            int gewei = i % 10;
            int cube = baiwei * baiwei * baiwei + shiwei * shiwei * shiwei + gewei * gewei * gewei;
            if (cube == i) {
                System.out.println("找到水仙花数:" + i);
            }
            
        }
        System.out.println("------------------------");
        /**
         * 3、
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
