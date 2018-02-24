package class_and_object;

public class Worker {
	
    String name; //姓名
    
    float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed; //移动速度
    
    public Worker(){
    	
    }
    
    public Worker(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
    
    public void revive(Worker w){
    	w = new Worker("提莫",383);
    }
    
    public static void main(String[] args) {
		Worker teemo = new Worker("提莫",383);
		//受到400伤害，挂了
		teemo.hp = teemo.hp - 400;
		teemo.revive(teemo);
		System.out.println(teemo.hp);//-17.0
	}
}
