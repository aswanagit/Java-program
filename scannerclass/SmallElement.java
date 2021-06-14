import java.util.Scanner;
class SmallElement{
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of elements:");
n=sc.nextInt();
int[] array=new int[n];
System.out.println("enter the array elements:");
for(int i=0;i<n;i++)
{
array[i]=sc.nextInt();
}
int small=array[0];
for(int i=0;i<n;i++)
{
if(array[i]<small)
{
small=array[i];
}
}
System.out.println("the smallest element in the array is:"+small);
}
}
