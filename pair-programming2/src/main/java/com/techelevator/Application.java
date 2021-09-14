package com.techelevator;

import javax.swing.*;
import java.text.Format;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;


public class Application {

    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }


    List<Department> departments = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();
    Map<String, Project> projects = new HashMap<>();
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    LocalDate today = LocalDate.now();
    private void run() {

        createDepartments();


        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
        departments.add(new Department(1,"Marketing"));
        departments.add(new Department(2,"Sales"));
        departments.add(new Department(3,"Engineering"));

    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for(Department department:departments){
            System.out.println(department.getName());
        }

    }
    /**
     * Create a method that find a department by name
     */
    private Department getDepartmentByName(String name){

        for (int i = 0; i <departments.size() ; i++) {
           if(departments.get(i).getName().equals(name))
               return departments.get(i);
        }
      return null;
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
       Employee employee1 = new Employee();
       employee1.setEmployeeId(1);
       employee1.setEmail("djohnson@teams.com" );
       employee1.setDepartment(getDepartmentByName("Engineering"));
       employee1.setFirstName("Dean");
       employee1.setLastName("Johnson");
       employee1.setHireDate(today);
       employee1.setSalary(Employee.BASE_SALARY);
       employees.add(employee1);
       Employee employee2 = new Employee(2,"Angie","Smith","djohnson@teams.com",getDepartmentByName("Engineering"),today);
       employee2.setSalary(Employee.BASE_SALARY);
       employees.add(employee2);
        Employee employee3 = new Employee(3,"Margaret","Thompson","mthompson@teams.com",getDepartmentByName("Marketing"),today);
        employee3.setSalary(Employee.BASE_SALARY);
        employees.add(employee3);

    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for(Employee employee: employees){
            if(employee.getFirstName().equals("Angie")){
                employee.raiseSalary(0.1);
            }
            System.out.println(employee.geyFullName()+ " "+ "(" +currency.format(employee.getSalary())+")"+ " "+employee.getDepartment().getName());
        }
    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {
    Project project1 = new Project("TEams","Project Management Software", LocalDate.now(),LocalDate.now().plusDays(31));
    for(Employee employee: employees){
        if(employee.getDepartment().getName().equals("Engineering")){
            project1.setTeamMembers(employee);

        }
        projects.put(project1.getName(),project1);
    }

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        Project project2 = new Project("Marketing Landing Page","Lead Capture Landing Page for Marketing",LocalDate.now().plusDays(31),LocalDate.now().plusDays(38));
        for(Employee employee:employees){
            if(employee.getDepartment().getName().equals("Marketing")){
                project2.setTeamMembers(employee);
            }
            projects.put(project2.getName(),project2);
        }
    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        for(Map.Entry<String, Project> entry: projects.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue().getTeamMembers().size());
        }
    }
}
