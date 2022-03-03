package com.perscholas.java_basics;

public class InheritanceActivity {

    public static void main(String[] args) {
        //@testCaseOne
       Manager m1 = new Manager(126534, "Peter", "Chennai india ",
               237844, 65000);
        System.out.println(m1.calculateTransportAllowance());;

       //@testCaseTwo
       Trainer n1 = new Trainer(29846,"Jack", "Mumbai India",  "442084", 45000 );
        System.out.println(n1.calculateTransportAllowance());
    }
}
