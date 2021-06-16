import java.util.Scanner;
class LargeElement 
{
public static void main(String[] args) 
{
int n;
Scanner sc= new Scanner(System.in);
System.out.println("Enter number of elements in the array:");
n=sc.nextInt();
int array[] = new int[n];
System.out.println("Enter elements of array:");
for(int i = 0;i<n;i++)
{
array[i]=sc.nextInt();
}
int large=array[0];
for(int i = 0;i<n;i++)
{
if(large<array[i])
{
large=array[i];
}
}
System.out.println("the largest element is:"+large);
}
}