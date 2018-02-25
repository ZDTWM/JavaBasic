package number_and_string;
/**
 * �����ַ���
 * @author Administrator
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		/**
		 * 1����ȡ�ַ�
		 */
		//charAt(int index)��ȡָ��λ�õ��ַ�
		String sentence1 = "����,�ڽ���������8�λ�ɱ��,����� ���� �ĳƺ�";
		char c = sentence1.charAt(0);
		System.out.println(c);
		/**
		 * 2����ȡ��Ӧ���ַ�����
		 */
		//toCharArray()
		//��ȡ��Ӧ���ַ�����
		String sentence2 = "����,�ڽ���������8�λ�ɱ��,����˳��� �ĳƺ�";
		char[] cs = sentence2.toCharArray();//��ȡ��Ӧ���ַ�����
		System.out.println(sentence2.length() == cs.length);
		/**
		 * 3����ȡ���ַ���
		 */
		//subString 
		//��ȡ���ַ���
		String sentence3 = "����,�ڽ���������8�λ�ɱ��,����� ���� �ĳƺ�";
        //��ȡ�ӵ�3����ʼ���ַ��� ����0��
        String subString1 = sentence3.substring(3);
         
        System.out.println(subString1);
         
        //��ȡ�ӵ�3����ʼ���ַ��� ����0��
        //��5-1��λ�õ��ַ���
        //����ҿ�
        String subString2 = sentence3.substring(3,5);
         
        System.out.println(subString2);
		/**
		 * 4��split
		 */
        //split 
        //���ݷָ������зָ�
        String sentence4 = "����,�ڽ���������8�λ�ɱ��,����� ���� �ĳƺ�";
		String subSentences[] = sentence4.split(",");
		for(String sub : subSentences){
			System.out.println(sub);
		}
		
		/**
		 * 5��ȥ����β�ո�
		 */
		//trim 
		//ȥ����β�ո�
        String sentence5 = "        ����,�ڽ���������8�λ�ɱ��,����� ���� �ĳƺ�      ";
        
        System.out.println(sentence5);
        //ȥ����β�ո�
        System.out.println(sentence5.trim());
		/**
		 * 6����Сд
		 */
        //toLowerCase ȫ�����Сд 
        //toUpperCase ȫ����ɴ�д
        String sentence6 = "Garen";
        
        //ȫ�����Сд
        System.out.println(sentence6.toLowerCase());
        //ȫ����ɴ�д
        System.out.println(sentence6.toUpperCase());
        
        /**
         * 7����λ
         */
        //indexOf �ж��ַ��������ַ������ֵ�λ��
        //contains �Ƿ�������ַ���
        String sentence7 = "����,�ڽ���������8�λ�ɱ��,����˳��� �ĳƺ�";
        
        System.out.println(sentence7.indexOf('8')); //�ַ���һ�γ��ֵ�λ��
          
        System.out.println(sentence7.indexOf("����")); //�ַ�����һ�γ��ֵ�λ��
          
        System.out.println(sentence7.lastIndexOf("��")); //�ַ��������ֵ�λ��
          
        System.out.println(sentence7.indexOf(',',5)); //��λ��5��ʼ�����ֵĵ�һ��,��λ��
          
        System.out.println(sentence7.contains("��ɱ")); //�Ƿ�����ַ�
        
        /**
         * 8���滻
         */
        //replaceAll �滻���е� 
        //replaceFirst ֻ�滻��һ��
        String sentence = "����,�ڽ���������8�λ�ɱ��,����˳��� �ĳƺ�";
        
        String temp = sentence.replaceAll("��ɱ", "����ɱ"); //�滻���е�
         
        temp = temp.replaceAll("����", "����");
         
        System.out.println(temp);
         
        temp = sentence.replaceFirst(",","");//ֻ�滻��һ��
         
        System.out.println(temp);
	}
}
