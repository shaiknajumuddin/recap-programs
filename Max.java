import java.util.*;
class Max
  {
    public static void main(String args[])
    {
      int arr[]=new int[5];
      int max=arr[0];
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the elements");
      for(int i=1;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      for(int i=1;i<arr.length;i++)
        {
          if(max<arr[i])
          {
            max=arr[i];
          }
        }
      System.out.println("the maximum value of an array is"+max);
    }
  }