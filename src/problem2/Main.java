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
			for (int c=a; c<=b;c++) {
			ans=c+ans;
			}
		}
		else if(a>b) {
			for(int c=b;a>=c;c++) {
				ans=c+ans;
			}
		}
		else {ans=a;}
		System.out.println(ans);
	}
}