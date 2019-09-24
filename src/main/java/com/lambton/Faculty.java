package com.lambton;

import java.time.LocalDate;


    public  abstract class Faculty extends Person
    {
        private String designation;
        private float salary;
        private String specilization;
        private float baseSalary;
        private float netSalary;

        public Faculty(int id, String firstName, String lastName, String designation, float salary, String specilization,float baseSalary, float netSalary)
        {
            super(id);
            this.designation = designation;
            this.salary = salary;
            this.specilization = specilization;
            this.baseSalary=baseSalary;
            this.netSalary=netSalary;
        }
        public Faculty(int id, String firstName, String lastName, LocalDate birthDate, String gender, String designation, float salary, String specilization) {
            super(id, firstName, lastName, birthDate, gender);
            this.designation = designation;
            this.salary = salary;
            this.specilization = specilization;
        }

        public String getDesignation()
        {
            return designation;
        }

        public float getSalary()
        {
            return salary;
        }

        public String getSpecilization()
        {
            return specilization;
        }

        public void setDesignation(String designation)
        {
            this.designation = designation;
        }

        public void setSalary(float salary)
        {
            this.salary = salary;
        }

        public void setSpecilization(String specilization)
        {
            this.specilization = specilization;
        }

        public float getBaseSalary()
        {
            return baseSalary;
        }

        public void setBaseSalary(float baseSalary)
        {
            this.baseSalary = baseSalary;
        }

        public float getNetSalary()
        {
            return netSalary;
        }

        public void setNetSalary(float netSalary)
        {
            this.netSalary = netSalary;
        }

        @Override
        public void display()
        {
            System.out.println("Faculty's information");
            System.out.println("Faculty Id:" + getId());
            System.out.println(" Faculty's First Name:" + getFirstName());
            System.out.println(" Faculty's First Name:" + getFirstName());
            System.out.println(" Faculty's Last Name:" + getLastName());

            System.out.println(" Faculty's Gender:" + getGender());
            System.out.println(" Faculty's Salary:" + getSalary());
            System.out.println(" Faculty' Designation:" + getDesignation());
            System.out.println(" Faculty's Specilization:" + getSpecilization());
            System.out.println(" Faculty's baseSalary:" + getBaseSalary());
            System.out.println(" Faculty's netSalary:" + getNetSalary());
        }
        public abstract void calculateTotalSalary();
    }




