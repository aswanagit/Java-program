import java.util.Scanner;
class Numbers{
	synchronized void multiple(){
	    int num=5;
	    System.out.println("Multiplication table of 5:");		
              for(int i=1;i<=10;i++){
		num=5*i;
		System.out.println(5+"*"+i+"="+num);
		try{
		    Thread.sleep(200);
		   }catch(Exception e){
		System.out.println(e);
		}
		}
	}
	synchronized void prime(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=sc.nextInt();
		System.out.println("The prime numbers upto " +n+ " is:");
		System.out.println(2);
		int num=3;
		int flag=1;
		for(int i=2;i<=n;i++)
      {
         for(int j=2;j<=Math.sqrt(num);j++)
         {
            if(num%j==0)
            {
               flag=0;
               break;
            }
         }
         if(flag!=0)
         {
            System.out.println(num);
            i++;
         }
         flag=1;
         num++;
      }         
	}

}
class MultiplicationTable extends Thread{
	Numbers num;
	MultiplicationTable(Numbers num){
		this.num=num;
	}
	public void run(){
		num.multiple();
	}
}
class PrimeNumbers extends Thread{
	Numbers num;
	PrimeNumbers(Numbers num){
		this.num=num;
	}
	public void run(){
		
		num.prime();
	}
}
public class MultiThreadClass{
	public static void main(String args[]){
		Numbers obj=new Numbers();
		MultiplicationTable  ml=new MultiplicationTable(obj);
		PrimeNumbers pr=new PrimeNumbers(obj);
		ml.start();
		pr.start();
	}
}
 