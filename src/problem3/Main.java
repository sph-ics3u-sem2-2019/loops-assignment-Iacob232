package problem3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in a word and print out one character per String
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int n=str.length();
		for(int o=0;o<n;o++){
		 System.out.println(str.charAt(o));
		}
	}
}
