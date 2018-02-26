package number_and_string;
/**
 * StringBuffer
 * 	StringBuffer是可变长的字符串
 * @author Administrator
 *
 */
public class Demo09 {
	public static void main(String[] args) {
		/**
		 * 1、追加、删除、插入、反转
		 */
		String str1 = "let there ";
		//根据str1创建一个StringBuffer对象
		StringBuffer sb = new StringBuffer(str1);
		
		sb.append("be light");//在最后追加
		System.out.println(sb);
		
		sb.delete(4, 10);//删除4-10之间的字符
		System.out.println(sb);
		
		sb.insert(4, "there ");//在4这个位置插入 there
		System.out.println(sb);
		
		sb.reverse();//反转
		System.out.println(sb);
		
		/**
		 * 2、长度、容量
		 */
		String str2 = "the";
		StringBuffer sb2 = new StringBuffer(str2);
		System.out.println(sb2.length());//内容长度:3
		System.out.println(sb2.capacity());//总空间:19
		
		
		
	}
}	
