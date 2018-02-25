package interface_and_inherit_abstract.combined.training;

public class Fish extends Animal implements Pet {
	
	private String name;
	
	public Fish(){
		super(0);
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
		System.out.println("鱼在玩");

	}

	@Override
	public void eat() {
		System.out.println("鱼在吃");

	}
	
	public void walk(){
		System.out.println("鱼没有腿");
	}

}
