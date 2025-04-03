package B0J9935;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String boom=scanner.nextLine();
		
		while(Pattern.compile(boom).matcher(str).find()) {
			str=str.replaceAll(boom, "");
		}
		if(str.isEmpty()) {
			str="FRULA";
		}
		System.out.print(str);
	}
}
