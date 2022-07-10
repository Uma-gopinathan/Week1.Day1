package Week1.Day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; //number to be checked for prime
		int j; //number to be divided by i
		int k; //i%j is stored here
		int number; 
		for (i = 1; i < 51; i++) {
			number=0;
			if(i==1)
			{
				System.out.println("1 is a prime number");
			}
			else if(i==2)
			{
				System.out.println("2 is a prime number");
			}
			else
			{ 
				//checking if the number i is divisible from any numbers 2 to i-1
				for(j=1;j<=i;j++)
				{
					k=i%j;
					if(k==0)
					{
						number=number+1;
						
					}
				}
				//checking how many numbers can divide i
				if(number>2)
				{
					System.out.println(i +" is not a prime number");
				}
				else
				{
						System.out.println(i +" is a prime number");
				}
			}
			}
		}
	}


