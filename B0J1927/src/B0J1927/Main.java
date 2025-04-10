package B0J1927;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		Scanner scan=new Scanner(System.in);
		List<Integer> list=new LinkedList<>();
		int N=scan.nextInt();
		for(int i=0;i<N;i++) {
			int num=scan.nextInt();
			if(num==0) {
				if(pq.isEmpty()) {
					list.add(0);
				}else {
					list.add(pq.poll());
				}
			}else {
				pq.add(num);
			}
		}
		for(int i:list) {
			System.out.print(i+"\n");
		}
		scan.close();
	}
}
