import java.util.*;
class Pair
{
  public static void main(String args[])
  {
    int count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int size=sc.nextInt();
    for(int i=0;i<size;i++)
      {
        arr[i]=sc.nextInt();
      }
    System.out.println("enter the divisor value");
    int k=sc.nextInt();
    for(int i=0;i<size;i++)
      {
        for(int j=i+1;j<size;j++)
          {
            if(((arr[i]+arr[j])%k==0)&&(i<j))
              {
              count++;
              }
          }
      }
    System.out.println("the number of pairs are"+count);
}
}