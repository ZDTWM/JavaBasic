package enum_class;



public class HelloWorld {
	public static void main(String[] args) {
		
		Season season = Season.SPRING;
		switch(season){
		case SPRING:
			System.out.println("����");
			break;
		case SUMMER:
			System.out.println("����");
			break;
		case AUTUM:
			System.out.println("����");
			break;	
		case WINTER:
			System.out.println("����");
			break;
		}
		/**
		 * 2��ʹ��ö�ٵĺô�
		 */
		//������ʹ��switch��ʱ�򣬲���ʹ��ö�٣�����ʹ��int��
		//��int��ȡֵ��Χ�Ͳ�ֻ��1-4���п���ȡһ������1-4֮���ֵ�������жϽ�������Ƕ����ˡ�
		//����Ϊֻ��4�����ڣ�
		//����ʹ��ö�٣����ܰѷ�Χ�������޶������ĸ�����
		//�����������ֵ� ��5��
		/**
		 * 3������ö��
		 * 	������ǿ��forѭ�������Ժܷ���ı���һ��ö�ٶ�����Щ����
		 */
		for (Season s : Season.values()) {
			System.out.println(s);
		}
	}
	
}
