package interface_and_inherit_abstract.test;

public class LifePotion extends Item {
	
    public void effect(){
        System.out.println("血瓶使用后，可以回血");
    }
	
	@Override
	public boolean disposable() {
		
		return true;
	}

}
