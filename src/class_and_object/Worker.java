package class_and_object;

public class Worker {
	
    String name; //����
    
    float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed; //�ƶ��ٶ�
    
    public Worker(){
    	
    }
    
    public Worker(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
    
    public void revive(Worker w){
    	w = new Worker("��Ī",383);
    }
    
    public static void main(String[] args) {
		Worker teemo = new Worker("��Ī",383);
		//�ܵ�400�˺�������
		teemo.hp = teemo.hp - 400;
		teemo.revive(teemo);
		System.out.println(teemo.hp);//-17.0
	}
}
