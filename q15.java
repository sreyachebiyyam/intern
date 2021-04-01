class Number
{
  public static void main(String args[])
  {
    Number n=new Number();
    int n=123;
    SUmOfDigits(n);
   }
   void SumOfDigits(int n)
   {
      int n=123,i,psum=0;
      for(i=0;i<3;i++)
      {
        p=n%10;
        sum=sum+p;
        n=n/10;
      }
      System.out.println(sum);
    }
}
