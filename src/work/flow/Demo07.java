package work.flow;
/**
 * 结束外部循环
 * @author Administrator
 *
 */
public class Demo07 {

	public static void main(String[] args) {
		/**
		 * 1、break;：结束当前循环
		 */
		//打印单数
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i+":"+j);
				if(0==j%2)
					break;//如果是双数，结束当前循环
			}
		}
		System.out.println("------------------------");
		/**
		 * 2、使用boolean变量结束外部循环
		 * 	1)借助boolean变量结束外部循环
		 * 	2)需要在内部循环中修改这个变量值
		 * 	3)每次内部循环结束后，都要在外部循环中判断，这个变量的值
		 */
		boolean breakout = false;//是否终止外部循环的标记
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
		 * 3、使用标签结束外部循环
		 * 	1)在外部循环的前一行，加上标签 
		 * 	2)在break的时候使用该标签 
		 * 	3)即能达到结束外部循环的效果
		 */
        //打印单数    
        outloop: //outloop这个标示是可以自定义的比如outloop1,ol2,out5
        for (int i = 0; i < 10; i++) {
             
            for (int j = 0; j < 10; j++) {
                System.out.println(i+":"+j);
                if(0==j%2) 
                    break outloop; //如果是双数，结束外部循环
            }
             
        }
	}
	

}
