package entities;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
	
	private String name;
	
	private List<Course> list = new ArrayList<>();
	
	public Instructor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getList() {
		return list;
	}

	public void setList(List<Course> list) {
		this.list = list;
	}
	
	public void registerCourse (String name) {
		list.add(new Course(name));
	}
}
