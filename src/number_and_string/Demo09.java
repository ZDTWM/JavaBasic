package number_and_string;
/**
 * StringBuffer
 * 	StringBuffer�ǿɱ䳤���ַ���
 * @author Administrator
 *
 */
public class Demo09 {
	public static void main(String[] args) {
		/**
		 * 1��׷�ӡ�ɾ�������롢��ת
		 */
		String str1 = "let there ";
		//����str1����һ��StringBuffer����
		StringBuffer sb = new StringBuffer(str1);
		
		sb.append("be light");//�����׷��
		System.out.println(sb);
		
		sb.delete(4, 10);//ɾ��4-10֮����ַ�
		System.out.println(sb);
		
		sb.insert(4, "there ");//��4���λ�ò��� there
		System.out.println(sb);
		
		sb.reverse();//��ת
		System.out.println(sb);
		
		/**
		 * 2�����ȡ�����
		 */
		String str2 = "the";
		StringBuffer sb2 = new StringBuffer(str2);
		System.out.println(sb2.length());//���ݳ���:3
		System.out.println(sb2.capacity());//�ܿռ�:19
		
		
		
	}
}	
