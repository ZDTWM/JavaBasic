package array;
/**
 * ��ά����
 * @author Administrator
 *
 */
public class Demo08 {

	public static void main(String[] args) {
		/**
		 * 1����ʼ����ά����
		 */
		//��ʼ����ά����
		int[][] a = new int[2][3];//������һά���飬ÿ��һά����ĳ�����3
		a[1][2] = 5;//����ֱ�ӷ���һά���飬��Ϊ�Ѿ������˿ռ�
		//ֻ�����˶�ά����
		int[][] b = new int[2][];//������һά���飬ÿ��һά����ĳ�����δ����
		b[0] = new int[3];
		b[0][2] = 5;
		//ָ�����ݵ�ͬʱ������ռ�
		int[][] c = new int[][]{
			{1,2,4},
			{4,5},
			{6,7,8}
		};
		
		/**
		 * 2����ϰ������һ��5X5�Ķ�ά���顣 Ȼ��ʹ����������ö�ά���顣
		 * 		�ҳ������ά����������Ǹ�ֵ������ӡ�����ά����
		 */
		int[][] arr = new int[5][5];
		 // ��ʼ���������
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 100);
			}
		}
		 // ��ӡ�����������ݣ�
		for (int[] row : arr) {
			for(int each : row){
				System.out.print(each + " ");
			}
		}
		System.out.println();
		int max = -1;
		int target_i = -1;
		int target_j = -1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > max){
					max = arr[i][j];
					target_i = i;
					target_j = j;
				}
			}
		}
		System.out.println("���ֵΪ��" + max);
		System.out.println("��������[" + target_i + ","+target_j+"]");
	}

}
