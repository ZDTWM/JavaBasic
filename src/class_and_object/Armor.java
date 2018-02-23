package class_and_object;
/**
 * Armor继承Item 有name和prices属性
 * @author Administrator
 *
 */
public class Armor extends Item{
	int armor;
	public static void main(String[] args) {
		Armor ar = new Armor();
		ar.armor = 45;
		ar.name = "锁子甲";
		ar.price = 750;
	}
}
