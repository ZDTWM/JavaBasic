package number_and_string;

import java.util.Locale;
import java.util.Scanner;

/**
 * 格式化输出
 * @author Administrator
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		/**
		 * 1、格式化输出
		 */
		//如果不使用格式化输出，就需要进行字符串连接，如果变量比较多，拼接就会显得繁琐
		//使用格式化输出，就可以简洁明了

		//%s 表示字符串
		//%d 表示数字
		//%n 表示换行
		
		String name = "盖伦";
		int kill = 8;
		String  title ="超神";
		
		//直接使用+进行字符串连接，编码感觉会比较繁琐，并且维护性差,易读性差
		String sentence = name + " 在进行了连续 " + kill + " 次击杀后，获得了 " + title + " 的称号";	
		System.out.println(sentence);
		
        //使用格式化输出
        //%s表示字符串，%d表示数字,%n表示换行
		String sentenceFormat = "%s 在进行了连续  %d 次击杀后，获得了 %s 的称号%n";
		System.out.printf(sentenceFormat,name,kill,title);
		
		/**
		 * 2、printf和format
		 * 	printf和format能够达到一模一样的效果
		 */
		//使用printf格式化输出
		System.out.printf(sentenceFormat,name,kill,title);
		//使用format格式化输出
		System.out.format(sentenceFormat, name,kill,title);
		
		/**
		 * 3、换行符
		 */
		//换行符就是另起一行 --- '\n' 换行（newline）
		//回车符就是回到一行的开头 --- '\r' 回车（return）
		//在eclipse里敲一个回车，实际上是回车换行符
		//Java是跨平台的编程语言，同样的代码，可以在不同的平台使用，比如Windows,Linux,Mac
		//然而在不同的操作系统，换行符是不一样的
		//（1）在DOS和Windows中，每行结尾是 “\r\n”；
		//（2）Linux系统里，每行结尾只有 “\n”；
		//（3）Mac系统里，每行结尾是只有 "\r"。
		//为了使得同一个java程序的换行符在所有的操作系统中都有一样的表现，使用%n，就可以做到平台无关的换行
		System.out.printf("这是换行符%n");
		System.out.printf("%n");
		System.out.printf("这是换行符%n");
		
		System.out.println("--------------------------------");
		/**
		 * 4、总长度，左对齐，补0，千位分隔符，小数点位数，本地化表达
		 */
        int year = 2020;
        //总长度，左对齐，补0，千位分隔符，小数点位数，本地化表达
          
        //直接打印数字
        System.out.format("%d%n",year);
        //总长度是8,默认右对齐
        System.out.format("%8d%n",year);
        //总长度是8,左对齐
        System.out.format("%-8d%n",year);
        //总长度是8,不够补0
        System.out.format("%08d%n",year);
        //千位分隔符
        System.out.format("%,8d%n",year*10000);
  
        //小数点位数
        System.out.format("%.2f%n",Math.PI);
          
        //不同国家的千位分隔符
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);
		/**
		 * 5、练习
		 * 借助Scanner 读取字符串数据，然后用格式化输出下面
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入地名：");
        String location = scan.nextLine();
        System.out.println("请输入公司类型：");
        String companyType = scan.nextLine();
        System.out.println("请输入公司名称：");
        String companyName = scan.nextLine();
        System.out.println("请输入老板名称：");
        String bossName = scan.nextLine();
        System.out.println("请输入金额：");
        String money = scan.nextLine();
        System.out.println("请输入产品：");
        String productName = scan.nextLine();
        System.out.println("请输入价格计量单位：");
        String measureClass = scan.nextLine();
        
        String senetnceSong = "%s 最大 %s %s 倒闭了,王八蛋老板 %s 吃喝嫖赌，欠下了 %s 带着他的小姨子跑了!我们没有办法，拿着 %s 抵工资!原价都是一 %s多、两 %s多、三 %s多的钱包，现在全部只卖二十块，统统只要二十块! %s 王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!";
        System.out.printf(senetnceSong,location,companyType,companyName,bossName,money,productName,measureClass,measureClass,measureClass,bossName);
        
	}
}
