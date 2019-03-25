package problem2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in two numbers. Add up all the values between them
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		//if(b!=0)
		int ans=0;
		if(a<b) {
		while(a<=b) {
			ans=a+ans;
			a=a+1;
		}
		}
		else if(a>b) {
			int c=b;
			while(a>=c) {
				ans=c+ans;
				c=c+1;
			}
			ans=-1*(ans-b-a);
		}
		System.out.println(ans);
	}
}