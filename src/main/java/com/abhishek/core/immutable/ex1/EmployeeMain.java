package com.abhishek.core.immutable.ex1;

public class EmployeeMain {

    public static void main(String[] args) {

        //creating 'Company' object
        Company company = new Company("HCL", 50);

        //creating 'Employee' object
        Employee employee = new Employee("Ram", 1000, company);

        System.out.println("Employee Object is : " + employee);

        employee.getCompany().setCompanyName("PwC");
        System.out.println("Employee Object after updating company is : " + employee);
    }
}

  