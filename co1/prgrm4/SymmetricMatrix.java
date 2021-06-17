import java.util.Scanner;
class SymmetricMatrix
     {
      public static void main(String args[])
      {
       int rows,cols;
       int flag=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number of rows:");
       rows=sc.nextInt();
       System.out.println("enter the number of columns:");
       cols=sc.nextInt();
       int[][] matrix=new int[rows][cols];
       System.out.println("enter the elements:");
       for(int i=0;i<rows;i++)
         {
          for(int j=0;j<cols;j++)
           {
            matrix[i][j]=sc.nextInt();
           }
         }
        System.out.println("the matrix is:");
        for(int i=0;i<rows;i++)
         {
          for(int j=0;j<cols;j++)
           {
            System.out.print(matrix[i][j]+" ");
             if(matrix[i][j] != matrix[j][i])
             flag =1;
            }
            System.out.println();
           }
        if(flag==0)
            System.out.println("The matrix is symmetric.");
        else
            System.out.println("The matrix is not symmetric.");
     }
  
}