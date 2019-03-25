package problem3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in a word and print out one character per String
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int n=str.length();
		int o=0;
		while(o<n){
		 System.out.println(str.charAt(o));
		 o=o+1;
		}
	}

}
