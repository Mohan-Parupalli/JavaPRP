package inheritance;

public class Employee extends Person{
	double annualsalary;
	String year;
	String insNum;
	public double getAnnualsalary() {
		return annualsalary;
	}
	public void setAnnualsalary(double annualsalary) {
		this.annualsalary = annualsalary;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getInsNum() {
		return insNum;
	}
	public void setInsNum(String insNum) {
		this.insNum = insNum;
	}
    
}
