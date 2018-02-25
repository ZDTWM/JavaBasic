package number_and_string;

import java.util.Locale;
import java.util.Scanner;

/**
 * ��ʽ�����
 * @author Administrator
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		/**
		 * 1����ʽ�����
		 */
		//�����ʹ�ø�ʽ�����������Ҫ�����ַ������ӣ���������Ƚ϶࣬ƴ�Ӿͻ��Ե÷���
		//ʹ�ø�ʽ��������Ϳ��Լ������

		//%s ��ʾ�ַ���
		//%d ��ʾ����
		//%n ��ʾ����
		
		String name = "����";
		int kill = 8;
		String  title ="����";
		
		//ֱ��ʹ��+�����ַ������ӣ�����о���ȽϷ���������ά���Բ�,�׶��Բ�
		String sentence = name + " �ڽ��������� " + kill + " �λ�ɱ�󣬻���� " + title + " �ĳƺ�";	
		System.out.println(sentence);
		
        //ʹ�ø�ʽ�����
        //%s��ʾ�ַ�����%d��ʾ����,%n��ʾ����
		String sentenceFormat = "%s �ڽ���������  %d �λ�ɱ�󣬻���� %s �ĳƺ�%n";
		System.out.printf(sentenceFormat,name,kill,title);
		
		/**
		 * 2��printf��format
		 * 	printf��format�ܹ��ﵽһģһ����Ч��
		 */
		//ʹ��printf��ʽ�����
		System.out.printf(sentenceFormat,name,kill,title);
		//ʹ��format��ʽ�����
		System.out.format(sentenceFormat, name,kill,title);
		
		/**
		 * 3�����з�
		 */
		//���з���������һ�� --- '\n' ���У�newline��
		//�س������ǻص�һ�еĿ�ͷ --- '\r' �س���return��
		//��eclipse����һ���س���ʵ�����ǻس����з�
		//Java�ǿ�ƽ̨�ı�����ԣ�ͬ���Ĵ��룬�����ڲ�ͬ��ƽ̨ʹ�ã�����Windows,Linux,Mac
		//Ȼ���ڲ�ͬ�Ĳ���ϵͳ�����з��ǲ�һ����
		//��1����DOS��Windows�У�ÿ�н�β�� ��\r\n����
		//��2��Linuxϵͳ�ÿ�н�βֻ�� ��\n����
		//��3��Macϵͳ�ÿ�н�β��ֻ�� "\r"��
		//Ϊ��ʹ��ͬһ��java����Ļ��з������еĲ���ϵͳ�ж���һ���ı��֣�ʹ��%n���Ϳ�������ƽ̨�޹صĻ���
		System.out.printf("���ǻ��з�%n");
		System.out.printf("%n");
		System.out.printf("���ǻ��з�%n");
		
		System.out.println("--------------------------------");
		/**
		 * 4���ܳ��ȣ�����룬��0��ǧλ�ָ�����С����λ�������ػ����
		 */
        int year = 2020;
        //�ܳ��ȣ�����룬��0��ǧλ�ָ�����С����λ�������ػ����
          
        //ֱ�Ӵ�ӡ����
        System.out.format("%d%n",year);
        //�ܳ�����8,Ĭ���Ҷ���
        System.out.format("%8d%n",year);
        //�ܳ�����8,�����
        System.out.format("%-8d%n",year);
        //�ܳ�����8,������0
        System.out.format("%08d%n",year);
        //ǧλ�ָ���
        System.out.format("%,8d%n",year*10000);
  
        //С����λ��
        System.out.format("%.2f%n",Math.PI);
          
        //��ͬ���ҵ�ǧλ�ָ���
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);
		/**
		 * 5����ϰ
		 * ����Scanner ��ȡ�ַ������ݣ�Ȼ���ø�ʽ���������
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("�����������");
        String location = scan.nextLine();
        System.out.println("�����빫˾���ͣ�");
        String companyType = scan.nextLine();
        System.out.println("�����빫˾���ƣ�");
        String companyName = scan.nextLine();
        System.out.println("�������ϰ����ƣ�");
        String bossName = scan.nextLine();
        System.out.println("�������");
        String money = scan.nextLine();
        System.out.println("�������Ʒ��");
        String productName = scan.nextLine();
        System.out.println("������۸������λ��");
        String measureClass = scan.nextLine();
        
        String senetnceSong = "%s ��� %s %s ������,���˵��ϰ� %s �Ժ��ζģ�Ƿ���� %s ��������С��������!����û�а취������ %s �ֹ���!ԭ�۶���һ %s�ࡢ�� %s�ࡢ�� %s���Ǯ��������ȫ��ֻ����ʮ�飬ͳͳֻҪ��ʮ��! %s ���˵����㲻����!����������������˴���꣬�㲻�����ʣ��㻹��Ѫ��Ǯ������Ѫ��Ǯ!";
        System.out.printf(senetnceSong,location,companyType,companyName,bossName,money,productName,measureClass,measureClass,measureClass,bossName);
        
	}
}
