/*
Aim:- Practical No.1
Author:- Ishant Morghade
Version: 1.5
Date:- 30 Jan,2024
*/
class Practical_1 
{
    public static void main(String[] argv) 
    {
        CompanyData HELLO = new CompanyData();
        HELLO.display();
        System.out.println("");
        CompanyData SBJIT = new CompanyData("Ishant Morghade", 19, "Male", 40);
        SBJIT.display();
    }
}
class CompanyData 
{
    String name;
    int age;
    String gender;
    int empid;

    CompanyData() 
    {
        System.out.println("");
        System.out.println("Details of Class With Default Constructor");
        
    }
    CompanyData(String name, int age, String gender, int empid) 
    {
        System.out.println("Details of Class With  Parameterized Constructor");
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.empid = empid;
    }
    public void display() 
    {
        System.out.println("Name:- " + this.name);
        System.out.println("Age:- " + this.age);
        System.out.println("Gender:- " + this.gender);
        System.out.println("Emp ID:- " + this.empid);
    }
}
