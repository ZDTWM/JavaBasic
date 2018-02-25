package number_and_string;
/**
 * 字符串
 * @author Administrator
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		/**
		 * 1、创建字符串
		 */
		//字符串即字符的组合，在Java中，字符串是一个类，所以我们见到的字符串都是对象 
		//常见创建字符串手段： 
		//1. 每当有一个字面值出现的时候，虚拟机就会创建一个字符串 
		//2. 调用String的构造方法创建一个字符串对象 
		//3. 通过+加号进行字符串拼接也会创建新的字符串对象 
		String str1 = "盖伦";//字面值,虚拟机碰到字面值就会创建一个字符串对象
		String str2 = new String("提莫");//创建了两个字符串对象
		char[] ch1 = new char[]{'崔','斯','特'};
		String str3 = new String(ch1);//  通过字符数组创建一个字符串对象
		String str4 = str1 + str2;//  通过+加号进行字符串拼接
		
		/**
		 * 2、final
		 */
		//String 被修饰为final,所以是不能被继承的
		
		/**
		 * 3、immutable
		 */
		//immutable 是指不可改变的
		//比如创建了一个字符串对象
		//String garen ="盖伦";
		//不可改变的具体含义是指：
		//不能增加长度
		//不能减少长度
		//不能插入字符
		//不能删除字符
		//不能修改字符
		//一旦创建好这个字符串，里面的内容 永远 不能改变

		//String 的表现就像是一个常量
		
		/**
		 * 4、字符串格式化
		 */
        String name ="盖伦";
        int kill = 8;
        String title="超神";
          
        //直接使用+进行字符串连接，编码感觉会比较繁琐，并且维护性差,易读性差
        String sentence = name+ " 在进行了连续 " + kill + " 次击杀后，获得了 " + title +" 的称号";
          
        System.out.println(sentence);
         
        //格式化字符串
        //%s表示字符串，%d表示数字,%n表示换行
        String sentenceFormat ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";
         
        String sentence2 = String.format(sentenceFormat, name,kill,title);
         
        System.out.println(sentence2);
        
		/**
		 * 5、字符串长度
		 */
        String str5 = "str5";
        String str6 = "";//可以有长度为0的字符串,既空字符串
        System.out.println(str5.length());
        System.out.println(str6.length());
	}

}
