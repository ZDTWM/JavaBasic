package number_and_string;
/**
 * 操纵字符串
 * @author Administrator
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		/**
		 * 1、获取字符
		 */
		//charAt(int index)获取指定位置的字符
		String sentence1 = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";
		char c = sentence1.charAt(0);
		System.out.println(c);
		/**
		 * 2、获取对应的字符数组
		 */
		//toCharArray()
		//获取对应的字符数组
		String sentence2 = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
		char[] cs = sentence2.toCharArray();//获取对应的字符数组
		System.out.println(sentence2.length() == cs.length);
		/**
		 * 3、截取子字符串
		 */
		//subString 
		//截取子字符串
		String sentence3 = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";
        //截取从第3个开始的字符串 （基0）
        String subString1 = sentence3.substring(3);
         
        System.out.println(subString1);
         
        //截取从第3个开始的字符串 （基0）
        //到5-1的位置的字符串
        //左闭右开
        String subString2 = sentence3.substring(3,5);
         
        System.out.println(subString2);
		/**
		 * 4、split
		 */
        //split 
        //根据分隔符进行分隔
        String sentence4 = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";
		String subSentences[] = sentence4.split(",");
		for(String sub : subSentences){
			System.out.println(sub);
		}
		
		/**
		 * 5、去掉首尾空格
		 */
		//trim 
		//去掉首尾空格
        String sentence5 = "        盖伦,在进行了连续8次击杀后,获得了 超神 的称号      ";
        
        System.out.println(sentence5);
        //去掉首尾空格
        System.out.println(sentence5.trim());
		/**
		 * 6、大小写
		 */
        //toLowerCase 全部变成小写 
        //toUpperCase 全部变成大写
        String sentence6 = "Garen";
        
        //全部变成小写
        System.out.println(sentence6.toLowerCase());
        //全部变成大写
        System.out.println(sentence6.toUpperCase());
        
        /**
         * 7、定位
         */
        //indexOf 判断字符或者子字符串出现的位置
        //contains 是否包含子字符串
        String sentence7 = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
        
        System.out.println(sentence7.indexOf('8')); //字符第一次出现的位置
          
        System.out.println(sentence7.indexOf("超神")); //字符串第一次出现的位置
          
        System.out.println(sentence7.lastIndexOf("了")); //字符串最后出现的位置
          
        System.out.println(sentence7.indexOf(',',5)); //从位置5开始，出现的第一次,的位置
          
        System.out.println(sentence7.contains("击杀")); //是否包含字符
        
        /**
         * 8、替换
         */
        //replaceAll 替换所有的 
        //replaceFirst 只替换第一个
        String sentence = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
        
        String temp = sentence.replaceAll("击杀", "被击杀"); //替换所有的
         
        temp = temp.replaceAll("超神", "超鬼");
         
        System.out.println(temp);
         
        temp = sentence.replaceFirst(",","");//只替换第一个
         
        System.out.println(temp);
	}
}
