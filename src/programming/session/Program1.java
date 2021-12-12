//count the number of words in a String
package programming.session;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		System.err.println("Counting the number of words in the String");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		/*String arr[] = str.split(" ");
		
		System.out.println(arr.length);*/
		
		System.out.println(str.split(" ").length);
	}

}
