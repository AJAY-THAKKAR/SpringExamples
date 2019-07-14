package dto;

public class StudentDto {

	private String name;
	
	private String username;
	
	private String password;
	
	private int age;
	
	private int rollNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", username=" + username + ", password=" + password + ", age=" + age
				+ ", rollNo=" + rollNo + "]";
	}

/*public StudentDto(String name, String username, String password, int age, int rollNo) {
	super();
	this.name = name;
	this.username = username;
	this.password = password;
	this.age = age;
	this.rollNo = rollNo;
}*/
	
	

	/*public StudentDto() {
		super();
		System.out.println("Object gets Created......");
	}*/
	
}
