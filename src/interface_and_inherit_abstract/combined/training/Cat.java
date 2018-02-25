package interface_and_inherit_abstract.combined.training;

public class Cat extends Animal implements Pet {
	
	private String name;

/*	protected Cat(int legs) {
		super(4);
	}*/
	
	public Cat(String name){
		super(4);
		this.name = name;
	}
	public Cat(){
		this("");
	}
	
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println("Cat is playing");

	}

	@Override
	public void eat() {
		System.out.println("eating");

	}

}
