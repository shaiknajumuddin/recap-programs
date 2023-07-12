import java.util.*;
class Max1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      int max=arr[0];
      for(int i=0;i<size;i++)
        {
          if(max<arr[i])
          {
            max=arr[i];
          }
        }
      System.out.println("the maximum array is"+max);
    }
  }
