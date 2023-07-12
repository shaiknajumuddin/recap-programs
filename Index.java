import java.util.*;
class Index
  {
    public static void main(String args[])
    {
      int count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter the array elenments");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("enter the number ");
      int n=sc.nextInt();
      for(int i=0;i<size;i++)
        {
          if(arr[i]==n)
          count++;
        }
      System.out.println(count);
    }
  }