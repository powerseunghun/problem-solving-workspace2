package Acmicpc.Step21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class MinHeap1927 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), x = 0;
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> list = new PriorityQueue<>();
		
		for (int i = 0; i < N; i++) {
			x = Integer.parseInt(br.readLine());
			if (x == 0) {
				if(list.size() == 0) {
					sb.append(0 + "\n");
				}
				else {
					sb.append(list.poll() + "\n");
				}
			}
			else {
				list.offer(x);
			}
		}
		System.out.println(sb);
	}
}
