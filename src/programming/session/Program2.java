//count the number of alphabets from the word in the string
package programming.session;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		System.err.println("count the number of alphabets from the word in the string");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		String strArr[] = str.split(" ");
		
		System.out.println("Enter the word index");
		int index = sc.nextInt();
		
		System.out.println(strArr[index].toCharArray().length);
	}
}
