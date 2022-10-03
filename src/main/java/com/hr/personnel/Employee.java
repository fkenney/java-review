package com.hr.personnel;

import java.time.LocalDate;

public class Employee {

  private String name;
  private LocalDate hireDate;

  public Employee() {

  }

  public Employee(String name, LocalDate date) {
    this.setName(name);
    this.setHireDate(date);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }

  public String getEmployeeInfo(){
    return String.format("Name: %s, Hire Date: %s", getName(), getHireDate());
  }
}
