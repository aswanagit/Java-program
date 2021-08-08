import java.util.Scanner;
class Person
{
String Name,Gender,Address;
int Age;

Person()
{
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter the name:");
Name=sc.next();
System.out.println("\nEnter the gender:");
Gender=sc.next();
System.out.println("\nEnter the address:");
Address=sc.next();
System.out.println("\nEnter the age:");
Age=sc.nextInt();
}
}

class Employee extends Person
{
int Empid,Salary;
String Company_name,Qualification;

Employee()
{
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter the empid:");
Empid=sc.nextInt();
System.out.println("\nEnter the company name:");
Company_name=sc.next();
System.out.println("\nEnter qualification:");
Qualification=sc.next();
System.out.println("\nEnter the salary:");
Salary=sc.nextInt();
}
}

class Teacher extends Employee
{
int Teacher_id;
String Department,Subject;

Teacher()
{
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter teacher id:");
Teacher_id=sc.nextInt();
System.out.println("\nEnter the department:");
Department=sc.next();
System.out.println("\nEnter subject:");
Subject=sc.next();
}

void display()
{
System.out.println("Name:"+super.Name);
System.out.println("Gender:"+super.Gender);
System.out.println("Address:"+super.Address);
System.out.println("Age:"+super.Age);
System.out.println("Empid:"+super.Empid);
System.out.println("Company_name:"+super.Company_name);
System.out.println("Qualification:"+super.Qualification);
System.out.println("Salary:"+super.Salary);
System.out.println("Teacher_id:"+Teacher_id);
System.out.println("Department:"+Department);
System.out.println("Subject:"+Subject);
System.out.println("\n");
}
}

class MultiLevelInheritence
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of objects:");
n=sc.nextInt();
Teacher obj[]=new Teacher[n];
for(int i=0;i<n;i++)
{
obj[i]=new Teacher();
}
System.out.println("\nTeachers Details\n");
for(int i=0;i<n;i++)
{
obj[i].display();
}
}
}

