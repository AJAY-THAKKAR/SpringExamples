package com.jspiders.byType;

public class Student {

	private String name;
	
	private String rollNo;
	
	private String stream;
	
	private Address add;
	
	private Address add1;
	
	private Address add2;
	
	private Department dept;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Address getAdd1() {
		return add1;
	}

	public void setAdd1(Address add1) {
		this.add1 = add1;
	}

	public Address getAdd2() {
		return add2;
	}

	public void setAdd2(Address add2) {
		this.add2 = add2;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", stream=" + stream + ", add=" + add + ", add1=" + add1
				+ ", add2=" + add2 + ", dept=" + dept + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String rollNo, String stream, Address add, Address add1, Address add2,
			Department dept) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.stream = stream;
		this.add = add;
		this.add1 = add1;
		this.add2 = add2;
		this.dept = dept;
	}

		
}
