package Inheritance;

public class Director extends Employee {
	private int managersCount;
	
	public Director(String name, Integer cpf, Integer phone, Double wage, int managersCount) {
		this.name = name;
		this.cpf = cpf;
		this.phone = phone;
		this.wage = wage;
		this.managersCount = managersCount;
	}

	public int getManagersCount() {
		return managersCount;
	}

	public void setManagersCount(int managersCount) {
		this.managersCount = managersCount;
	}

	@Override
	public String toString() {
		return "Director [managersCount=" + managersCount + ", name=" + name + ", cpf=" + cpf + ", phone=" + phone
				+ ", wage=" + wage + "]";
	}
	
	
	
	
	
}
