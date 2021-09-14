import java.util.Scanner;
class Negativeexcp extends Exception
{
   Negativeexcp(String s)
     {
       super(s);
      }
    
}
class NegativeInput{
    public static void main(String args[]){
       try{
            float sum=0;
            int num=0;
            float avg;
            int i=1;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the limit:");
            int l=sc.nextInt();
            System.out.println("enter the numbers:");
            while(i<=l)
            {
            num=sc.nextInt();
            if(num<0)
                 throw new  Negativeexcp("negative number not allow");
             else
                 sum=sum+num;
                 i=i+1;
                 
             }
                 avg=sum/l;
                 System.out.println("the average of these "+l+" numbers are:"+avg);
             }
             catch(Negativeexcp e){
                 System.out.println(e);
             }
             finally{
                  System.out.println("program ends....");
             }
}
}