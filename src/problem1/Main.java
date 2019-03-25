package problem1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read a value. Print out from 1 to the input
		Scanner in=new Scanner(System.in);
		int n;
		int o=in.nextInt();
		if(o>0) {
		n=1;
		while (n<=o) {
			System.out.println(n);
			n=n+1;
			}
		}
		else if(o<0) {
			n=-1;
			while (n>=o) {
				System.out.println(n);
				n=n-1;
			}
		}
		else {System.out.println(0);}
	}
}
