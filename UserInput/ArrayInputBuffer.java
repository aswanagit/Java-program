import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

class ArrayInputBuffer
{
public static void main(String args[])
throws IOException
{
int n;
BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of elements to store:");
n=Integer.parseInt(reader.readLine());;

int[] array=new int[n];
System.out.println("Enter the elements of array:");
for(int i=0;i<n;i++)
{
array[i]=Integer.parseInt(reader.readLine());;
}
System.out.println("Array elements ara:");
for(int i=0;i<n;i++)
{
System.out.println(array[i]);
}
}
}