package oop_2_super;

import oop_2_company.Employee;

public class Manager extends Employee {
	private String position; // 직책

	public Manager() {
		super();
	}

	public Manager(String name, String part, String position) {
		super(name, part);
		this.position = position;
	}

	public String addStr() {
		String result = super.resultStr();
		result += "직책 : " + position + "\n";
		return result;
	}
}
