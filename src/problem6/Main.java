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
		int m=l;
		while(m>0) {
			System.out.println(str);
			str=str+str.substring(0);
			str=str.substring(1,l+1);
			m=m-1;
		}
	}
}
