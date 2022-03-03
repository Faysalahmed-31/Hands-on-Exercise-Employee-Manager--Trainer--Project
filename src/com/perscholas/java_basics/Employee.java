package com.perscholas.java_basics;

public class Employee {
    /*Create instance variables. */

    protected long employeeId;
    protected String employeeName;
    protected String employeeAddress;
    protected long employeePhone;
    protected double basicSalary;
    protected double specialAllowance = 250.80d;
    protected double hra = 1000.50;


    // create an overload constructor
    public Employee(long id, String name, String address, long phone, double basicSalary){
            this.employeeId = id;
            this.employeeName = name;
            this.employeeAddress = address;
            this.employeePhone = phone;
            this.basicSalary = basicSalary;
            this.hra = hra;

    }
         public double getCalculateSalary() {
          return basicSalary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);

         }

         public double calculateTransportAllowance(){
             return 10d/100d * basicSalary;
         }

     }

