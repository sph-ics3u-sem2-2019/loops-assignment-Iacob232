package problem4;
import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// Ask the user 10 multiplication questions. Check their answers and
		//give them their score
		Random rnd=new Random();
		Scanner in=new Scanner(System.in);
		int q=10;
		int r=0;
		while(q>0) {
			int a=rnd.nextInt(13);
			int b=rnd.nextInt(13);
			int ans=a*b;
			System.out.println(a+"×"+b+"=");
			int response=in.nextInt();
			if(ans==response) {
				System.out.println("Correct!");
				r=r+1;
			}
			else {System.out.println("Wrong! It is "+ans+".");
			}
			q=q-1;
		}
		System.out.println(r+"/10 right.");
	}
}
