package com.lambton;

import java.time.LocalDate;


public class mainExample
{
    public static void main(String[] args)
    {

     Person p1;
     Person p2;
     Student s1= new Student(1,
             "komaldeep",
             "kaur",
             LocalDate.now(),
             "female",
             "MADT",
             2);

     p1=s1;
     p1.display();
     p1.print();
        Faculty f1= new Faculty(5,
                "Pritish",
                "patel",
                LocalDate.now(),
                "Male",
                "Proferssor",
                900.50F,
                "Android Developer") {
            @Override
            public void calculateTotalSalary() {

            }
        };
        f1.calculateTotalSalary();
        p2=f1;
        p2.display();



    }
}
