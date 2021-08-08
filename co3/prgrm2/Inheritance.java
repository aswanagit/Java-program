import java.util.Scanner;
class Employee
{
int Empid,Salary;
String Name,Address;

Employee()
{
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter the Empid:");
Empid=sc.nextInt();
System.out.println("\nEnter the Name:");
Name=sc.next();
System.out.println("\nEnter the Salary:");
Salary=sc.nextInt();
System.out.println("\nEnter the Address:");
Address=sc.next();
}
}

class Teachers extends Employee
{
String department,Subject;

Teachers()
{
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter the department:");
department=sc.next();
System.out.println("\nEnter Subjects taught:");
Subject=sc.next();
}

void display()
{
System.out.println("\nEmpid:"+super.Empid);
System.out.println("\nName:"+super.Name);
System.out.println("\nSalary:"+super.Salary);
System.out.println("\nAddress:"+super.Address);
System.out.println("\ndepartment:"+department);
System.out.println("\nSubjects taught:"+Subject);
System.out.println();
}
}

public class Inheritance
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of objects:");
n=sc.nextInt();
Teachers obj[]=new Teachers[n];
for(int i=0;i<n;i++)
{
obj[i]=new Teachers();
}
System.out.println("\nTeachers details");
for(int i=0;i<n;i++)
{
obj[i].display();
}
}
}
