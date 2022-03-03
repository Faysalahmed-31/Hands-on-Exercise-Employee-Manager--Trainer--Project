package com.perscholas.java_basics;

public class Trainer extends Employee{

    public Trainer(long id, String name, String address, String phone, double basicSalary) {
        super(id, name, address, Long.parseLong(phone), basicSalary);

    }

}
