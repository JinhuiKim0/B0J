package B0J11286;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer num1, Integer num2) {
				int abs1=Math.abs(num1);
				int abs2=Math.abs(num2);
				
				if(abs1!=abs2) { // 절댓값이 다른경우
					return Integer.compare(abs1, abs2);
				}
				// 절댓값이 같은 경우
				return Integer.compare(num1,num2);
			}
		});
		// 입력을 받아 0인지 확인 후 pq에 입력
		Scanner scan=new Scanner(System.in);
		
		int N=scan.nextInt();
		// 결과 list
		List<Integer> list=new LinkedList<>(); 
		for(int i=0;i<N;i++) {
			int num=scan.nextInt();
			if(num==0) {
				if(pq.isEmpty()){
					list.add(0);
				}else { // 비어있지 않을때
					list.add(pq.poll());
				}
			}else { // 0이 아닐때
				pq.add(num);
			}
		}
		for(int i:list) {
			System.out.print(i+"\n");
		}
		scan.close();
	}
}
