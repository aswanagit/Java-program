import java.util.Scanner;
class ArrayElements{
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of elements");
n=sc.nextInt();
int[] array=new int[n];
System.out.println("enter the elements:");
for(int i=0;i<n;i++)
{
array[i]=sc.nextInt();
}
System.out.println("The array elemts are:");
for(int i=0;i<n;i++)
{
System.out.println(array[i]);
}
System.out.println("the number of elements in the array is:"+array.length);
}
}