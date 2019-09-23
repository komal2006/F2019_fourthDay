package com.lambton;

import java.time.LocalDate;
import java.util.Date;

public class Student extends Person
{
    private String courseName;
    private int currentSemester;


    public Student(int id)
    {
        super(id);
    }

    public Student(int id, String firstName, String lastName, LocalDate birthDate, String gender, String courseName, int currentSemesterSemester)
    {
        super(id,firstName,lastName,birthDate,gender);
                this.courseName=courseName;
        this.currentSemester=currentSemester;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public int getCourseSemester()
    {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester)
    {
        this.currentSemester = currentSemester;
    }

    public int getCurrentSemester()
    {
        return currentSemester;
    }

    @Override
    public void display()
    {
      System.out.println("StudentID    :" + getId());
        System.out.println("FirstName    :" + getFirstName());
        System.out.println("LastName    :" + getLastName());
        System.out.println("BirthDate    :" + getBirthDate());
        System.out.println("Gender    :" + getGender());
        System.out.println("CourseName    :" + getCourseName());
        System.out.println("CurrentSemester   :" + getCurrentSemester());
    }
}
