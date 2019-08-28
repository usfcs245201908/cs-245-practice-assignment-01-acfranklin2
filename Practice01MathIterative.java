import java.lang.Exception;

public class Practice01MathIterative implements Practice01Math
{
	public int fact(int n) throws Exception
	{
		int factorial = 1;
		if(n < 0)
			throw new Exception();
		for(int i = 1; i <= n; i++)
			factorial *= i;
		return factorial;
	}

	public int fib(int n) throws Exception
	{
		int fibN = 0;
		if((n == 0) || (n == 1))
			fibN = n;
		else if(n < 0)
			throw new Exception();
		else
		{
			int prev1 = 1; int prev2 = 0;
			for(int i = 2; i <= n; i++)
			{      
				fibN = prev1 + prev2;                     
				prev2 = prev1;       
				prev1 = fibN;          
				
			}
		}
		return(fibN);
	}
}
/**
F P1 P2
------------
 0 0 0
 1 0 0
 1 1 0
 2 1 1
 3 2 1
 5 3 2
 8 5 3
 13 8 5





0 0
1 1
2 1
3 2
4 3
5 5
6 8
7 13
8 21
9 34
*/