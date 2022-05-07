package springAppSetup;

public class Student {
	private String name; 
	private Integer regNo ;
	private String department;
	
	public String getName() {  
	    return name;  
	}   
	public void setName(String name) {  
	    this.name = name;  
	}  
	
	public Integer getRegNo() {
		return regNo;
	}
	public void setRegNo(Integer regNo) {
		this.regNo = regNo;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void displayInfo(){  
	    System.out.println("Reg No : "+ regNo);
	    System.out.println("Name : "+ name);
	    System.out.println("Department : "+ department);
	}
}
