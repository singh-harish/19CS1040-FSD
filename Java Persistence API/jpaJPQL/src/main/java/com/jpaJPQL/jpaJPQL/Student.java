package com.jpaJPQL.jpaJPQL;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="data")
@NamedQueries({
	@NamedQuery(name="Student.READ", query="Select s from Student s"),
})
public class Student {
	@Id
	private int id;  
    private String name;  
    private String dept;
    
    public Student(int id, String name, String dept) {  
        super();  
        this.id = id;  
        this.setName(name);  
        this.setDept(dept);  
    }  
  
    public Student() {  
        super();  
    }
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	} 
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
