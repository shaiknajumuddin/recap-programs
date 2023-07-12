import java.util.*;
class Notes
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the amount");
      int amount=sc.nextInt();
      int totalnotes=0;
      if(amount%100==0)
      {
        if(amount>=1000)
        {
          int thousandnotes=amount/1000;
          amount=amount%1000;
          totalnotes=totalnotes+thousandnotes;
        }
        else if(amount<1000 && amount>=500)
        {
          int fivehundrednotes=amount/500;
          amount=amount%500;
          totalnotes=totalnotes+fivehundrednotes;
        }
        else if(amount<500 && amount>=100)
        {
          int hundrednotes=amount/100;
          amount=amount%100;
          totalnotes=totalnotes+hundrednotes;
        }
        System.out.println(totalnotes);
      }
      else
      {
        System.out.println("enter the amount should be multiple of 100");
      }
    }
  }