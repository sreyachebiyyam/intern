class Main
{
  public static void main(String args[])
  {
    int num=1234,sum=0,i,p,temp;
    temp=num;
    for(i=3;i>=0;i--)
    {
      p=(temp/(10^i))-(sum*10);
      p=p+2;
      sum=(sum*10)+p;
    }
    System.out.println(sum);
  }
}
