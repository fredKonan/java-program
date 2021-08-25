package com.techelevator;



public class Employee {
private int employeeId;
private String firstName;
private String lastName;
private String department;
private double annualSalary;

 public Employee(int employeeId,String firstName,String lastName, double annualSalary){
     this.annualSalary = annualSalary;
     this.employeeId = employeeId;
     this.firstName=firstName;
     this.lastName= lastName;
 }

 public String getFullName(){
     return (this.lastName + ", "+ this.firstName);
 }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void raiseSalary(double percent){
        if(percent>0)
            if(percent>0.00)
                annualSalary = annualSalary*(1.0+(percent/100));
    }
}
