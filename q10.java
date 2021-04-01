import java.lang.Math;
public class Swap
{
	public static void main(String[] args) 
  	{
		int m,n;
		Swap s=new Swap();
		s.swapwithThirdvariable(m,n);
		s.swapwithoutThirdVariable(m,n);
	}
	void swapwithThirdvariable(int a,int b)
	{
		int t;
		System.out.println("Before Swapping a and b :"+a+" "+b);
		t=a;
		a=b;
		b=t;
		System.out.println("After Swapping a and b :"+a+" "+b);
	}
	void swapwithoutThirdVariable()
	{
		System.out.println("Before Swapping a and b :"+a+" "+b);
		a = a + b; 
        	b = a - b;
        	a = a - b;
		System.out.println("After Swapping a and b :"+a+" "+b);
	}
}
