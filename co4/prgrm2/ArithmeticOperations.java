package Arithematic;
import java.util.Scanner;
interface arithmetic_operations{
  void addition();
  void substraction();
  void multiplication();
  void division();
  }
class operations implements arithmetic_operations{
 public void addition(){
  int a,b,sum;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter two numbers:");
  a=sc.nextInt();
  b=sc.nextInt();
  sum=a+b;
  System.out.println("Sum of two numbers are: "+sum);
  }
public void substraction(){
  int a,b,sub;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter two numbers:");
  a=sc.nextInt();
  b=sc.nextInt();
  sub=a-b;
  System.out.println("Difference of two numbers are: "+sub);
 }
public void multiplication(){
 int a,b,mul;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter two numbers:");
 a=sc.nextInt();
 b=sc.nextInt();
 mul=a*b;
 System.out.println("Product of two numbers are: "+mul);
 }
public void division(){
 int a,b;
 double div;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter two numbers:");
 a=sc.nextInt();
 b=sc.nextInt();
 div=(double)a/b;
 System.out.println("Division of two numbers are: "+div);
  }
}
class ArithmeticOperations{
 public static void main(String args[]){
  operations op=new operations();
  System.out.println("\t"+"Addition");
  op.addition();
  System.out.println("\t"+"Substraction");
  op.substraction();
  System.out.println("\t"+"Multiplication");
  op.multiplication();
  System.out.println("\t"+"Division");
  op.division();
}
}
