package problem5;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read the string and output in reverse case.
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String r="";
		int n=str.length();
		int x=0;
		while(x<n) {
			char c=str.charAt(x);
			if (c>='A'&&c<='Z') {
				c=(char)(c+32);
			}
			else if(c>='a'&&c<='z') {
				c=(char)(c-32);
			}
			r=r+c;
			x=x+1;
		}
		System.out.println(r);
	}

}
