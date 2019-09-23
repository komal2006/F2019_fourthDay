package com.lambton;

import java.time.LocalDate;


public class mainExample
{
    public static void main(String[] args)
    {
     Person p1;
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



    }
}
