package enum_class;



public class HelloWorld {
	public static void main(String[] args) {
		
		Season season = Season.SPRING;
		switch(season){
		case SPRING:
			System.out.println("春天");
			break;
		case SUMMER:
			System.out.println("夏天");
			break;
		case AUTUM:
			System.out.println("秋天");
			break;	
		case WINTER:
			System.out.println("冬天");
			break;
		}
		/**
		 * 2、使用枚举的好处
		 */
		//假设在使用switch的时候，不是使用枚举，而是使用int，
		//而int的取值范围就不只是1-4，有可能取一个超出1-4之间的值，这样判断结果就是是而非了。
		//（因为只有4个季节）
		//但是使用枚举，就能把范围死死的限定在这四个当中
		//而不会出现奇怪的 第5季
		/**
		 * 3、遍历枚举
		 * 	借助增强型for循环，可以很方便的遍历一个枚举都有哪些常量
		 */
		for (Season s : Season.values()) {
			System.out.println(s);
		}
	}
	
}
