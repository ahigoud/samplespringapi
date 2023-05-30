package com.ps.app1;

public class Student {
	private int id;
	private String name;
	private String usn;
	private String branch;
	public Student(int id, String name, String usn, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.usn = usn;
		this.branch = branch;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

}
