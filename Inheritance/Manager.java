package Inheritance;

public class Manager {
	private String name;
	private Integer cpf;
	private Integer phone;
	private Double wage;
	private Integer managedCount;
	
	public Manager(String name, Integer cpf, Integer phone, Double wage, Integer managedCount) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.phone = phone;
		this.wage = wage;
		this.managedCount = managedCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Double getWage() {
		return wage;
	}

	public void setWage(Double wage) {
		this.wage = wage;
	}

	public Integer getManagedCount() {
		return managedCount;
	}

	public void setManagedCount(Integer managedCount) {
		this.managedCount = managedCount;
	}
	
	public Double getBonus() {
		return wage * 0.25;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", cpf=" + cpf + ", phone=" + phone + ", wage=" + wage + ", managedCount="
				+ managedCount + ", wageBonus=" + getBonus() + "]";
	}
	
	
}
