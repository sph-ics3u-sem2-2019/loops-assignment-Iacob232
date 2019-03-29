package problem6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in a name, and print out the box
		/*
		 * Example input: Zebarth
		 * Output:
		 * Zebarth
		 * ebarthZ
		 * barthZe
		 * arthZeb
		 * rthZeba
		 * thZebar
		 * hZebart
		 */
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int l=str.length();
		for(int m=l;m>0;m--) {
			System.out.println(str);
			str=str+str.substring(0);
			str=str.substring(1,l+1);
		}
	}
}
