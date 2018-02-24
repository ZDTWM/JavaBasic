package charactor;//在最开始的地方声明该类所处于的包名

/**
 * 2、使用其他包下的类，必须import
 * 	使用同一个包下的其他类，直接使用即可 
 * 	但是要使用其他包下的类，必须import
 */
import property.Weapon;//Weapon类在其他包里，使用必须进行import

/**
 * 1、把比较接近的类，规划在同一个包下
 * @author Administrator
 *
 */
public class Hero {
	
	//Hero,ADHero 规划在一个包，叫做charactor（角色）
	//Item,Weapon规划在另一个包下，叫做 property(道具)
	//在最开始的地方声明该类所处于的包名
	
    String name; //姓名
    
    float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed; //移动速度
    //准备一把武器
    public void equip(Weapon w){
    	
    }
}
