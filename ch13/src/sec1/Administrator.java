package sec1;

public class Administrator {
	private String grade;
	private String ano;
	private String name;
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Administrator [grade=" + grade + ", ano=" + ano + ", name="
				+ name + "]";
	}
	
}