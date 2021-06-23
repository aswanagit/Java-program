import java.util.*;
class StringManipulation{
void Manipulations()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.nextLine();
System.out.println("String Length is: "+ str.length());
System.out.println("Character at position 5: "+ str.charAt(5));
System.out.println("Index of character 'd': "+ str.indexOf('d'));
System.out.println("String concatination: "+ str.concat(" hello"));
System.out.println("EndsWith character 'r': "+ str.endsWith("r"));
System.out.println("Replace 'good' with 'hai': "+str.replace("good","hai"));
System.out.println("Convert to LowerCase: " +str.toLowerCase());
System.out.println("Convert to UpperCase: " +str.toUpperCase());
}
public static void main(String args[]){
StringManipulation s=new StringManipulation();
s.Manipulations();
}
} 
