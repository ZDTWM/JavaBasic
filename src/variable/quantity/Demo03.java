package variable.quantity;
/**
 * 给基本类型的变量赋值的方式叫做 字面值
 * @author Administrator
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 1、整数字面值
		 */
		long val = 26L;
		//整数字面值可以用以下四种进制来表示
		int decVal = 26;//默认为int 型 、十进制
		int hexVal = 0x1a;//16进制
		int oxVal = 032;//8进制
		//java7开始可以创建二进制字面值了
		int binVal = 0b11010;//二进制
		/**
		 * 2、浮点数字面值
		 */
		float f1 = 123.4F;//以F结尾的字面值表示float类型
		double d1 = 123.4;//默认就是double类型
		double d2 = 1.234e2;// 科学计数法表示double
		/**
		 * 3、字符和字符串字面值
		 */
		String name = "盖伦";
		char c = '中';
		
		//以下是转义字符：\：表示转义
		char tab = '\t';//制表符
		char carriageReturn ='\r';//回车
		char newLine = '\n';//换行
		char doubleQuote = '\"';//双引号
		char singleQuote = '\'';//单引号
		char backSlah ='\\';//反斜杠
		
		
		
	}
}
