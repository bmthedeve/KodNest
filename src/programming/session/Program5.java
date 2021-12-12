//counting the consonants
package programming.session;
import java.util.*;
public class Program5 {
	public static void main(String[] args) {
		System.err.println("counting the consonants");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.next();
		
		str = str.toLowerCase();
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u')
				count++;
		}
		
		System.out.println(count);
	}
}
