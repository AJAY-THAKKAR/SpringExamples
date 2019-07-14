
public class Human {
	
	String name;
	
	double weight;

	public Human() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Object Created...");
	}
	
	public void init() {
		System.out.println("init method called......");
	}
	
	public void destroy() {
		System.out.println("destroy method called......");
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", weight=" + weight + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	/*public Human(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}*/
	
}
