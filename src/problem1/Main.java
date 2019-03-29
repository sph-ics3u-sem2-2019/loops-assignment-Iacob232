package problem1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read a value. Print out from 1 to the input
		Scanner in=new Scanner(System.in);
		int o=in.nextInt();
		if(o>0) {
		for (int n=1;n<=o;n++) {
			System.out.println(n);
			}
		}
		else if(o<0) {
			for (int n=-1;n>=o;n--) {
				System.out.println(n);	
			}
		}
		else {System.out.println(0);}
	}
}
