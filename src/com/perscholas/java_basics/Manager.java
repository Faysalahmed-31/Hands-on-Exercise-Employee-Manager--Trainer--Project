package com.perscholas.java_basics;

public class Manager extends Employee{


    public Manager(long id, String name, String address, long phone, double basicSalary) {
        super(id, name, address, phone, basicSalary);


    }

           @Override
            public double calculateTransportAllowance() {
                    return 0.15 * basicSalary;
            }
}
