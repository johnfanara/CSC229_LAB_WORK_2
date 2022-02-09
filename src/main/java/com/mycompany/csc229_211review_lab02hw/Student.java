package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person{
    private double GPA = 0.0;

    public Student(String name, short age) {
        super(name, age);
    }
    @Override
    public String getAddress() {
        return address;
    }
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    //returns to string
    @Override
    public String toString() {
        return "Student Info:" + "\n" + 
                "Name: " + this.name + "\n" + "Age: "
                + this.age + "\n" + "GPA: " + this.GPA
                + "\n" + "Address: " + this.address;
        
                
    }
	// ToDo 1: Make this class a child of Person
	
	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
	
	// ToDo 4: Add comments to your code

}