package work.flow;
/**
 * �����ⲿѭ��
 * @author Administrator
 *
 */
public class Demo07 {

	public static void main(String[] args) {
		/**
		 * 1��break;��������ǰѭ��
		 */
		//��ӡ����
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i+":"+j);
				if(0==j%2)
					break;//�����˫����������ǰѭ��
			}
		}
		System.out.println("------------------------");
		/**
		 * 2��ʹ��boolean���������ⲿѭ��
		 * 	1)����boolean���������ⲿѭ��
		 * 	2)��Ҫ���ڲ�ѭ�����޸��������ֵ
		 * 	3)ÿ���ڲ�ѭ�������󣬶�Ҫ���ⲿѭ�����жϣ����������ֵ
		 */
		boolean breakout = false;//�Ƿ���ֹ�ⲿѭ���ı��
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + ":" + j);
				if(0 == j%2){
					breakout = true;
					break;					
				}
			}
			if(breakout)
				break;
		}
		System.out.println("------------------------");
		/**
		 * 3��ʹ�ñ�ǩ�����ⲿѭ��
		 * 	1)���ⲿѭ����ǰһ�У����ϱ�ǩ 
		 * 	2)��break��ʱ��ʹ�øñ�ǩ 
		 * 	3)���ܴﵽ�����ⲿѭ����Ч��
		 */
        //��ӡ����    
        outloop: //outloop�����ʾ�ǿ����Զ���ı���outloop1,ol2,out5
        for (int i = 0; i < 10; i++) {
             
            for (int j = 0; j < 10; j++) {
                System.out.println(i+":"+j);
                if(0==j%2) 
                    break outloop; //�����˫���������ⲿѭ��
            }
             
        }
	}
	

}
