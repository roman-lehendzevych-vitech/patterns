package org.example.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	private List<String> empList;
	
	public Employees() {
		empList = new ArrayList<>();
	}
	
	public Employees(List<String> list) {
		this.empList = list;
	}

	public void loadData() {
		empList.add("Black");
		empList.add("Ivan");
		empList.add("Roman");
		empList.add("Max");
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<>(this.getEmpList());
		return new Employees(temp);
	}
}
