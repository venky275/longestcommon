import java.util.Scanner;
class LeapYear
{
    public static void main(String args[])
    {
      int a,b;
      Scanner Sc=new Scanner(System.in);
      System.out.println("enter starting year");
      a=Sc.nextInt();
      System.out.println("enter ending year");
      b=Sc.nextInt();
      for(int i=a;i<=b;i++)
      {
        if(i%4==0)
        {
          System.out.println(i+ "leap year");
        }
        else
           System.out.println("not leap year");
     }
   }
}
