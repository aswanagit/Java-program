import java.util.Scanner;
class Usernameexcp extends Exception
{
     Usernameexcp(String s)
       {
         super(s);


       }
}
class Passwordexcp extends Exception
{
    Passwordexcp(String s)
     {
         super(s);
       }
}
class Authentication{
       public static void main(String args[]){
           String username,password;
           try{
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the username:");
                username=sc.nextLine();
                System.out.println("enter the password:");
                password=sc.nextLine();
                if(!username.equals("Aswana"))
                    throw new Usernameexcp("incorrect username");
                else if(!password.equals("asw@057"))               
                     throw new  Passwordexcp("incorrect password");
                else
                     System.out.println("login successfull");
                }
                 catch(Usernameexcp e){
                        System.out.println(e);
                  }
                  catch( Passwordexcp e){
                         System.out.println(e);
                  }
                 finally{
                       System.out.println("program ends....");
}
}
}
