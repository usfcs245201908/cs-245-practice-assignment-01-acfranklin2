import java.lang.Exception;

public class Practice01MathRecursive implements Practice01Math
{
	public int fact(int n) throws Exception
	{
		if(n > 1)
			return(n * fact(n - 1));
		else if(n < 0)
			throw new Exception();
		return(n);
	}

	public int fib(int n) throws Exception
	{
		if((n == 0) || (n == 1))
			return n;
		else if(n < 0)
			throw new Exception();
		else
			return(fib(n - 1) + fib(n - 2));
	}
}