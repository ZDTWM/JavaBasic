package number_and_string;
/**
 * 比较字符串
 * @author Administrator
 *
 */
public class Demo08 {
	public static void main(String[] args) {
		/**
		 * 1、是否是同一个对象
		 */
		String str1 = "the light";
		String str2 = new String(str1);
		//==用于判断是否是同一个字符串对象
		//str1和str2的内容一定是一样的！ 
		//但是，并不是同一个字符串对象
		System.out.println(str1 == str2);//false
		
		/**
		 * 2、是否是同一个对象-特例
		 */
		String str3 = "the";
		String str4 = "the";
		System.out.println(str3 == str4);//true
		System.out.println("------------------------------");
		/**
		 * 3、内容是否相同
		 */
		String str5 = "the dog";
		String str6 = new String(str5);
		String str7 = str5.toUpperCase();
		//==用于判断是否是同一个字符串对象
		System.out.println(str5 == str6);
		System.out.println(str5.equals(str6));//完全一样返回true
		System.out.println(str5.equals(str7));//大小写不一样，返回false
		System.out.println(str5.equalsIgnoreCase(str7));//忽略大小写的比较，返回true
		System.out.println("----------------------------");
		/**
		 * 4、是否以子字符串开始或者结束
		 */
		String str8 = "the cat";
		String start = "the";
		String end = "Cat";
		System.out.println(str8.startsWith(start));//true
		System.out.println(str8.endsWith(end));//false
	}
}
