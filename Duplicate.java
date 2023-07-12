import java.util.*;
class Duplicate
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size ");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter the elements");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println(" the duplicate values in the array");
      for(int i=0;i<size;i++)//i=4:2,2,3,4,5


        
        {
          for(int j=i+1;j<size;j++)
            {
              if(arr[i]==arr[j])
              {
                System.out.println(arr[i]);
              }
            }
        }
    }
  }