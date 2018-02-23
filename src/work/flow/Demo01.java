package work.flow;
/**
 * if
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		/**
		 * 1、if
		 */
		boolean b = true;
		if(b){
			System.out.println("yes");
		}
		/**
		 * 2、多表达式与一个表达式
		 */
		boolean b2 = false;
		//如果有多个表达式，必须用大括弧包括起来
		if(b2){
			System.out.println("yes1");
			System.out.println("yes2");
			System.out.println("yes3");
		}
		//否则表达式2 3 无论b是否为true都会执行
		if(b2)
			System.out.println("yes4");
			System.out.println("yes5");
			System.out.println("yes6");
		//如果只有一个表达式可以不用写括弧，看上去会简约一些	
		if(b2){
			System.out.println("yes7");
		}
		if(b){
			System.out.println("yes8");
		}
		/**
		 * 3、if使用过程中可能遇到的坑
		 */
		//在第47行，if后面有一个分号; 而分号也是一个完整的表达式
		//如果b3为true，会执行这个分号，然后打印yes9
		//如果b3为false，不会执行这个分号，然后打印yes9
		//这样，看上去无论如何都会打印yes9
		boolean b3 = false;
		if(b3);
			System.out.println("yes9");
			
		/**
		 * 4、if...else...:else 代表不成立的情况
		 */
		boolean b4 = false;
		if(b4)
			System.out.println("yes");
		else
			System.out.println("no");
		/**
		 * 5、else...if...：else if是多条件判断
		 */
		//如果只使用 if,会执行4次判断
		int i = 2;
		if(i==1)
			System.out.println(1);
		if(i==2)
			System.out.println(2);
		if(i==3)
			System.out.println(3);
		if(i==4)
			System.out.println(4);
		 //如果使用else if, 一旦在75行，判断成立， 20行和22行的判断就不会执行了，节约了运算资源
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
