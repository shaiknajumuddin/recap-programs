public class Frequency1
{
    public static void main(String[] args) {
        int a[]={21,45,21,65};                    
      //  int count=1;   
      boolean b[]=new boolean[a.length];        
      for(int m=0;m<b.length;m++)
      {
          b[m]=false;              
      }
        for(int i=0;i<a.length;i++)  
        {
           int count=1;//1
           if(b[i]==true)
           continue;
            for(int j=i+1;j<a.length;j++) 
            {
                if(a[i]==a[j])  
                {
                    count++; 
                    b[j]=true;
                }
            }
            System.out.println("frequency of "+a[i]+"  ----->"+count); 
        }

            }
}


