package com.techelevator;

import java.time.LocalDate;
import java.util.*;



public class Project {

    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate dueDate;
    private List<Employee> teamMembers = new ArrayList<>();

    public Project(String name, String description, LocalDate startDate, LocalDate dueDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate date) {
        this.startDate = date;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(int numberOfDays) {
        this.dueDate = getStartDate().plusDays(numberOfDays);
    }

    public List<Employee> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(Employee employee) {
        teamMembers.add(employee);
    }
}
