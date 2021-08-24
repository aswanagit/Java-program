import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ArrayReversebuffer{  
public static void main(String[] args)
throws IOException {  

BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the no of elements:");
int n=Integer.parseInt(reader.readLine());;
int [] a=new int[n];
System.out.println("enter the array elements:");
for(int i=0;i<n;i++)
{
a[i]=Integer.parseInt(reader.readLine());;
}
System.out.println("the array elements are:");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("Array in reverse order:");
for(int i=n-1;i>=0;i--)
{
System.out.println(a[i]);
}
}
}