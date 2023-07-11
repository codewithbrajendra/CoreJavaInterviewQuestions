package Test;

public class Employee {

	int empId;
	String empName;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Employee)) {
			return false;
		}
		Employee emp = (Employee)obj;
		if(!(this.empId == emp.empId)) {
			return false;
		}
		if(!this.empName.equals(emp.empName)) {
			
			return false;
		}
		
		
		return true;
	}
	
}
