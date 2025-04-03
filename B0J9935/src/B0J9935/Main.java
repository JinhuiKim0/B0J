package B0J9935;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args)throws Exception{
		var reader=new BufferedReader(new InputStreamReader(System.in));
		String str=reader.readLine();
		String boom=reader.readLine();
		
		while(Pattern.compile(boom).matcher(str).find()) {
			str=str.replaceAll(boom, "");
		}
		if(str=="") {
			str="FRULA";
		}
		System.out.print(str);
	}
}
