//removing a character from the string
package programming.session;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("removing a character from the string");
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		System.out.println("Enter the Character you want to remove");
//		char c = sc.next().charAt(0);
		String s = sc.next();
		
		str = str.replace(s,"");
		System.out.println(str);
	}
}
