package number_and_string;
/**
 * �Ƚ��ַ���
 * @author Administrator
 *
 */
public class Demo08 {
	public static void main(String[] args) {
		/**
		 * 1���Ƿ���ͬһ������
		 */
		String str1 = "the light";
		String str2 = new String(str1);
		//==�����ж��Ƿ���ͬһ���ַ�������
		//str1��str2������һ����һ���ģ� 
		//���ǣ�������ͬһ���ַ�������
		System.out.println(str1 == str2);//false
		
		/**
		 * 2���Ƿ���ͬһ������-����
		 */
		String str3 = "the";
		String str4 = "the";
		System.out.println(str3 == str4);//true
		System.out.println("------------------------------");
		/**
		 * 3�������Ƿ���ͬ
		 */
		String str5 = "the dog";
		String str6 = new String(str5);
		String str7 = str5.toUpperCase();
		//==�����ж��Ƿ���ͬһ���ַ�������
		System.out.println(str5 == str6);
		System.out.println(str5.equals(str6));//��ȫһ������true
		System.out.println(str5.equals(str7));//��Сд��һ��������false
		System.out.println(str5.equalsIgnoreCase(str7));//���Դ�Сд�ıȽϣ�����true
		System.out.println("----------------------------");
		/**
		 * 4���Ƿ������ַ�����ʼ���߽���
		 */
		String str8 = "the cat";
		String start = "the";
		String end = "Cat";
		System.out.println(str8.startsWith(start));//true
		System.out.println(str8.endsWith(end));//false
	}
}
