package Inheritance;

public class Engineer extends Employee{
	private String crea;
	private String project;

	private Engineer() {}
	
	public Engineer(String name, Integer cpf, Integer phone, String crea, Double wage, String project) {
		this.name = name;
		this.cpf = cpf;
		this.phone = phone;
		this.crea = crea;
		this.wage = wage;
		this.project = project;
	}


	public String getCrea() {
		return crea;
	}

	public void setCrea(String crea) {
		this.crea = crea;
	}
	
	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Double getBonus() {
		return this.wage * 0.15;
	}

	@Override
	public String toString() {
		return "Engineer [name=" + name + ", cpf=" + cpf + ", phone=" + phone + ", crea=" + crea + ", wage=" + wage
				+ ", wageBonus=" + getBonus() + ", project=" + getProject() + "]";
	}
	
}
