package B0J9935;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String boom=scanner.nextLine();
		scanner.close();
		
		StringBuilder sb = new StringBuilder();
		
		// 문자열을 하나씩 처리하면서 StringBuilder에 추가
        for (char c : str.toCharArray()) {
            sb.append(c);

            // StringBuilder의 마지막 부분이 boom 문자열과 일치하는지 확인
            if (sb.length() >= boom.length() && sb.substring(sb.length() - boom.length()).equals(boom)) {
                // 일치하면 boom을 제거
                sb.setLength(sb.length() - boom.length());
            }
        }

        // 결과가 비어 있으면 "FRULA" 출력
        if (sb.length() == 0) {
            sb.append("FRULA");
        }

        System.out.print(sb);
    }
}
