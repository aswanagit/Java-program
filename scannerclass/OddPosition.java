import java.util.Scanner;
class OddPosition
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements to store:");
n=sc.nextInt();
int[] array=new int[10];
System.out.println("Enter the elements of the array:");
for(int i=0;i<n;i++)
{
array[i]=sc.nextInt();
}
System.out.println("The numbers in the odd position are:");
for(int i=0;i<n;i=i+2)
{
System.out.println(array[i]);
}
}
}