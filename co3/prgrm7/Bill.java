import java.util.Scanner;
interface bill_order{
void calculate();
}
class Bill implements bill_order{
      int Productid;
      String Name;
      int Quantity;
      int Price;
      int Total;
      public void calculate(){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter product id:");
          Productid=sc.nextInt();
          System.out.println("Enter product name:");
          Name=sc.next();
          System.out.println("Enter product quantity:");
          Quantity=sc.nextInt();
          System.out.println("Enter product price:");
          Price=sc.nextInt();
          Total=Quantity*Price;
        }
      public void display(){
        System.out.println(Productid+"\t"+"\t"+Name+"\t"+Quantity+"\t"+"\t"+Price+"\t"+"\t"+Total);
      }

   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("order no:");
     int no=sc.nextInt();
     System.out.println("enter the date:");
     String date=sc.next();
     System.out.println("enterthe no of products:");
     int n=sc.nextInt();
     Bill[] b=new Bill[n];
     for(int i=0;i<n;i++)
     {
       b[i]=new Bill();
     }
     for(int i=0;i<n;i++)
      {
       b[i].calculate();
      }
      System.out.println();
      System.out.println("order No:"+no);
      System.out.println();
      System.out.println("Date:");
      System.out.println();
      System.out.println("Product id"+"\t"+"Name"+"\t"+"Quantity"+"\t"+"Unit Price"+"\t"+"Total");
      for(int i=0;i<n;i++){
        b[i].display();
      }
      int Net_Amount=0;
      for(int i=0;i<n;i++)
       {
        Net_Amount=Net_Amount+b[i].Total;
  }
  System.out.println("\t"+"\t"+"\t"+"\t"+"Net Amount:"+Net_Amount);
 }
}
