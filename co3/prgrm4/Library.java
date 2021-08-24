import java.util.Scanner;

class Publisher{
    String PublisherName;

    Publisher(String Pname){
        PublisherName=Pname;
    }
    void Display(){
        System.out.println("Publisher name : "+PublisherName);
    }
}

class Book extends Publisher{
    String BookName;
    Book(String Pname,String Bname){
        super(Pname);
        BookName=Bname;
    }
    void Display(){
        super.Display();
        System.out.println("Book name : "+BookName);
    }
}

class Literature extends Book{
    String LiteratureName;
    Literature(String Pname,String Bname,String Lname){
        super(Pname,Bname);
        LiteratureName=Lname;
    }
    void Display(){
        super.Display();
        System.out.println("Literature name : "+LiteratureName);
    }
}

class Fiction extends Book{
    String FictionName;
    Fiction(String Pname,String Bname,String Fname){
        super(Pname,Bname);
        FictionName=Fname;
    }
    void Display(){
        super.Display();
        System.out.println("Fiction name : "+FictionName);
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String lpubname,lbokname,litname;
        String fpubname,fbokbname,fictname;

        System.out.println("-----Literature-----");
        System.out.println("Enter publisher name : ");
        lpubname=sc.nextLine();
        System.out.println("Enter Book name : ");
        lbokname=sc.nextLine();
        System.out.println("Enter Literature name : ");
        litname=sc.nextLine();
        System.out.println();

        System.out.println("-----Fiction-----");
        System.out.println("Enter publisher name : ");
        fpubname=sc.nextLine();
        System.out.println("Enter Book name : ");
        fbokbname=sc.nextLine();
        System.out.println("Enter Fiction name : ");
        fictname=sc.nextLine();
        System.out.println();

        Literature objL=new Literature(lpubname, lbokname, litname);
        objL.Display();
        System.out.println();
        Fiction objF=new Fiction(fpubname, fbokbname, fictname);
        objF.Display();
    }
}