import java.util.*;
class TwoDmax
  {
    public static void main(String args[])
    {
      int max=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the row of an array");
      int m=sc.nextInt();
      System.out.println("enter the coloumn size of an array");
      int n=sc.nextInt();
      System.out.println("enter the array elements");
      int arr[][]=new int[m][n];
      for(int i=0;i<m;i++)
        {
          for(int j=0;j<n;j++)
            {
              arr[i][j]=sc.nextInt();
            }
        }
      for(int i=0;i<m;i++)
        {
          for(int j=0;j<n;j++)
            {
              if(max<arr[i][j])
              {
                max=arr[i][j];
              }
            }
              System.out.println("max size of an array is"+max);
            
       }
  }
  }