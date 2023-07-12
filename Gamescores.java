import java.util.Scanner;
class Gamescores
  {
    public static void main(String args[])
    {
    int teamA,teamB;
     Scanner sc=new Scanner(System.in);
    System.out.println("enter the teamA number of games played ");
    int a=sc.nextInt();
    System.out.println("enter the teamB no of games played");
    int b=sc.nextInt();
      int arr[]=new int[4];
      System.out.println("enter scores of teamA");
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      int arr1[]=new int[4];
      System.out.println("enter scores of teamB");
      for(int j=0;j<arr.length;j++)
        {
          arr1[j]=sc.nextInt();
        }
    }
  
}
      
      
      
    
  