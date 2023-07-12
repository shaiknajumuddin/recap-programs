import java.util.*;
class EvenOddarray 
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the arra elements ");
    int arr[]=new int[5];
    for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
    for(int i=0;i<arr.length;i++)
      {
        if(arr[i]%2==0)
        {
          System.out.println("elements are even");
        }
        else{
          System.out.println("the elements are odd");
        }
      }
  }
}