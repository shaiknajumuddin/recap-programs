import java.util.*;
class Prime
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array elements");
      int arr[]=new int[5];
      Boolean flag=true;
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      for(int i=2;i<arr.length;i++)
        {
          if(arr.length%i==0)
          {
            flag=false;
          }
        }
      if(flag==true)
      {
        System.out.println("is a prime number");
      }
      else
      {
        System.out.println("is not a  prime ");
      }
    }
  }