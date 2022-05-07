package constructorInjection;

public class Employee {  
	private int id;  
	private String name;  
	private Address address;
	  
	public Employee() {System.out.println("def cons");}  
	  
	public Employee(int id, String name, Address address) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}  
	  
	void show(){  
	    System.out.println("Id : "+ id);
	    System.out.println("Name : "+ name);
	    System.out.println(address.toString());  
	}  
}  

