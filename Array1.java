import java.util.*;
class Array1
  {
    public static void main(String args[])
    {
      int arr[]=new int[4];
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array elemebts");
      for( int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("the element of array");
      for(int i=0;i<arr.length;i++)
        {
      System.out.println(arr[i]);
        }
      
    }
  }