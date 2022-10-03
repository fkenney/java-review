package com.hr.personnel.client;

import com.hr.personnel.Employee;
import java.time.LocalDate;

public class HRClient {

    public static void main(String[] args) {

      Employee employee = new Employee();
      employee.setHireDate(LocalDate.of(2020 , 3, 10));
      employee.setName("Bob");

      Employee employee2 = new Employee("Mary", LocalDate.of(1900, 12, 2));

      System.out.println(employee.getEmployeeInfo());
      System.out.println(employee2.getEmployeeInfo());
    }

}
