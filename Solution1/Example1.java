import java.util.*;
class Example1
{
	public static void main(String[] args)
	{
	
	int n,i,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter an Integer:");
	n=sc.nextInt();
	
	i=1;
	while(i<n)
	{
		if(n%i==0)
		{
		System.out.println(i);
		sum+=i;
		}
		i++;
	}
	System.out.println("Sum="+sum);

	}
}