import java.util.Scanner;
public class Reverse
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
int array[]=new int[10];
System.out.println("Enter the number of elements to store:");
n=sc.nextInt();
System.out.println("Enter the elements of the array:");
for(int i=0;i<n;i++)
{
array[i]=sc.nextInt();
}
System.out.println("The array elements are:");
for(int i=0;i<n;i++)
{
System.out.println(array[i]);
}
System.out.println("Reverse of array is:");
for(int i=n-1;i>=0;i--)
{
System.out.println(array[i]);
}
}
}