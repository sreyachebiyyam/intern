public class Reverse
{
  public static void main(String args[])
  {
    Reverse r=new Reverse();
    int m=123;
    r.reverseofNumber(m);
  }
  void reverseofNumber(int n)
  {
    int i,sum=0,p;
    for(i=0;i<3;i++)
    {
      p=n%10;
      sum=(sum*10)+p;
      n=n/10;
    }
    System.out.println(sum);
  }
}
