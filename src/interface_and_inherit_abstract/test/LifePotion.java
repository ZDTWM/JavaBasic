package interface_and_inherit_abstract.test;

public class LifePotion extends Item {
	
    public void effect(){
        System.out.println("Ѫƿʹ�ú󣬿��Ի�Ѫ");
    }
	
	@Override
	public boolean disposable() {
		
		return true;
	}

}
