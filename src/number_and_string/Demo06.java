package number_and_string;
/**
 * �ַ���
 * @author Administrator
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		/**
		 * 1�������ַ���
		 */
		//�ַ������ַ�����ϣ���Java�У��ַ�����һ���࣬�������Ǽ������ַ������Ƕ��� 
		//���������ַ����ֶΣ� 
		//1. ÿ����һ������ֵ���ֵ�ʱ��������ͻᴴ��һ���ַ��� 
		//2. ����String�Ĺ��췽������һ���ַ������� 
		//3. ͨ��+�ӺŽ����ַ���ƴ��Ҳ�ᴴ���µ��ַ������� 
		String str1 = "����";//����ֵ,�������������ֵ�ͻᴴ��һ���ַ�������
		String str2 = new String("��Ī");//�����������ַ�������
		char[] ch1 = new char[]{'��','˹','��'};
		String str3 = new String(ch1);//  ͨ���ַ����鴴��һ���ַ�������
		String str4 = str1 + str2;//  ͨ��+�ӺŽ����ַ���ƴ��
		
		/**
		 * 2��final
		 */
		//String ������Ϊfinal,�����ǲ��ܱ��̳е�
		
		/**
		 * 3��immutable
		 */
		//immutable ��ָ���ɸı��
		//���紴����һ���ַ�������
		//String garen ="����";
		//���ɸı�ľ��庬����ָ��
		//�������ӳ���
		//���ܼ��ٳ���
		//���ܲ����ַ�
		//����ɾ���ַ�
		//�����޸��ַ�
		//һ������������ַ�������������� ��Զ ���ܸı�

		//String �ı��־�����һ������
		
		/**
		 * 4���ַ�����ʽ��
		 */
        String name ="����";
        int kill = 8;
        String title="����";
          
        //ֱ��ʹ��+�����ַ������ӣ�����о���ȽϷ���������ά���Բ�,�׶��Բ�
        String sentence = name+ " �ڽ��������� " + kill + " �λ�ɱ�󣬻���� " + title +" �ĳƺ�";
          
        System.out.println(sentence);
         
        //��ʽ���ַ���
        //%s��ʾ�ַ�����%d��ʾ����,%n��ʾ����
        String sentenceFormat ="%s �ڽ��������� %d �λ�ɱ�󣬻���� %s �ĳƺ�%n";
         
        String sentence2 = String.format(sentenceFormat, name,kill,title);
         
        System.out.println(sentence2);
        
		/**
		 * 5���ַ�������
		 */
        String str5 = "str5";
        String str6 = "";//�����г���Ϊ0���ַ���,�ȿ��ַ���
        System.out.println(str5.length());
        System.out.println(str6.length());
	}

}
