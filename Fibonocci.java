package Week1.Day1;

public class Fibonocci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int sum=0;
		System.out.println(a);
		System.out.println(b);
		while(sum<56) {
			sum=a+b;
			if(sum<56) {
			System.out.println(sum);}
			a=b;
			b=sum;
		}
		
	}
}
