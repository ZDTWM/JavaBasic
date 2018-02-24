package class_and_object;

/**
 * this：
 * 通过this访问属性
 * @author Administrator
 *
 */
public class Fish {
	String name;
	int price;
	float weight;
	String color;
	
    //参数名和属性名一样
    //在方法体中，只能访问到参数name
	public void setName1(String name){
		name = name;
	}
	//为了避免setName1中的问题，参数名不得不使用其他变量名
	public void setName2(String fishname){
		name = fishname;
	}
	//通过this访问属性
	public void setName3(String name){
        //name代表的是参数name
        //this.name代表的是属性name
		this.name = name;
	}
	public static void main(String[] args) {
		Fish aFish = new Fish();
		aFish.setName1("A鱼");
		System.out.println(aFish.name);//null 在方法体中，只能访问到参数name
		
		aFish.setName2("B鱼");
		System.out.println(aFish.name);//B鱼
		
		aFish.setName3("C鱼");
		System.out.println(aFish.name);
	}
}
