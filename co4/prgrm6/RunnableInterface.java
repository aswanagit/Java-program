import java.util.Scanner;
class Fibonacci_EvenNumber{
   int count=0;
   synchronized void fibonacci(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the limit for Fibonnacci series:");
     int n=sc.nextInt();
     System.out.println("The Fibonacci Series are:");
     System.out.println(0);
     System.out.println(1);
     int a=0;
     int b=1;
     int c;
     while(count<(n-2)){
        c=a+b;
        System.out.println(c);
        count=count+1;
        a=b;
        b=c;
        try{
           Thread.sleep(300);     
        }catch(Exception e)
          {
          System.out.println(e);
          }
    }
   } 
   synchronized void evennumber(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the limit for even numbers:");
       int n=sc.nextInt();
       int count=0;
       System.out.println("The first "+n+" Even numbers are:");
         for(int i=1;count<n;i++){
           if(i%2==0){
             count++;
             System.out.println(i);
           }
      }
    }
 }
class FibonacciNumber implements Runnable{
    Fibonacci_EvenNumber fe;
     FibonacciNumber(Fibonacci_EvenNumber fe){
         this.fe=fe;
    }
    public void run(){
        fe.fibonacci();
     }
}
class EvenNumber implements Runnable{
     Fibonacci_EvenNumber fe;
      EvenNumber(Fibonacci_EvenNumber fe){
          this.fe=fe;
       }
       public void run(){
           fe.evennumber();
      }
}
public class RunnableInterface{
     public static void main(String args[]){
          Fibonacci_EvenNumber obj=new Fibonacci_EvenNumber();
          FibonacciNumber fe=new FibonacciNumber(obj);
          EvenNumber ev=new EvenNumber(obj);
          Thread t1=new Thread(fe);
          Thread t2=new Thread(ev);
           t1.start();
           t2.start();
  }

}