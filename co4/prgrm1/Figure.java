package Graphics;
import java.util.Scanner;
interface shapes{
    void area();
}
class Rectangle implements shapes{
  public void area(){
  int l,b;
  float area;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the length & breadth of  Rectangle:");
  l=sc.nextInt();
  b=sc.nextInt();
  area=l*b;
  System.out.println("The area of Rectangle is: "+area);
    }
  }
class Triangle implements shapes{
 public void area(){
 int b,h;
 float area;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the base and height of Triangle:");
 b=sc.nextInt();
 h=sc.nextInt();
 area=b*h/2;
 System.out.println("The area of Triangle is: "+area);
   }
 }
class Square implements shapes{
 public void area(){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the side of Square:");
 int a=sc.nextInt();
 float area=a*a;
 System.out.println("The area of Square is: "+area);
   }
 }
class Circle implements shapes{
 public void area(){
 float pi=3.14f;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the radius of the Circle:");
 int r=sc.nextInt();
 float area=pi*r*r;
 System.out.println("The area of Circle is: "+area);
  }
}
class Figure{
   public static void main(String args[]){
          Rectangle r=new Rectangle();
          Triangle t=new Triangle();
          Square s=new Square();
          Circle c=new Circle();
          System.out.println();
          System.out.println("\t"+"Rectangle:");
          r.area();
          System.out.println();
          System.out.println("\t"+"Triangle:");
          t.area();
          System.out.println();
          System.out.println("\t"+"Square:");
          s.area();
          System.out.println();
          System.out.println("\t"+"Circle:");
          c.area();
 }
}