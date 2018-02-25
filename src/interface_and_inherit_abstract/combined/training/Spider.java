package interface_and_inherit_abstract.combined.training;

public class Spider extends Animal {

	public Spider(){
		super(8);
	}
	
	@Override
	public void eat() {
		System.out.println("spider eating");

	}

}
