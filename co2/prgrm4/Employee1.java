import java.util.Scanner;
class Employee1{
 int eNo,eSalary;
 String eName;
  void GetData()
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the employee no:");
   eNo=Integer.parseInt(sc.nextLine());
   System.out.println("Enter the employee name:");
   eName=sc.nextLine();
   System.out.println("Enter the employee salary:");
   eSalary=Integer.parseInt(sc.nextLine());
  }
 void PutData()
 {
  System.out.println("\n\t"+eNo+"\t"+eName+"\t"+eSalary);
 }
public static void main(String args[])
{
 int no;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number of employee:");
 int n=sc.nextInt();
 Employee1[] emp=new Employee1[n];
 for(int i=0;i<n;i++)
 emp[i]=new Employee1();
 for(int i=0;i<n;i++)
 {
   System.out.println("enter the details of "+(i+1)+" Employee:");
   emp[i].GetData();
 }
 System.out.println("The Employee Datils are:");
 for(int i=0;i<n;i++)
 emp[i].PutData();
 System.out.println("Enter the employee_no to search:");
 no=sc.nextInt();
 for(int i=0;i<emp.length;i++)
 {
   if(emp[i].eNo==no)
    {
      emp[i].PutData();
      break;
      }
    if(i==n-1)
    { 
      System.out.println("Employee not found");
     }
   }
 }
}