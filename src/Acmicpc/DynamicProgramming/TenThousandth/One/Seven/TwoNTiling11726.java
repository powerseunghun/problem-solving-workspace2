package Acmicpc.DynamicProgramming.TenThousandth.One.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TwoNTiling11726 {
	static int[] dp = new int[1001];
	static int f(int n) {
		if (dp[n] != 0) {
			return dp[n];
		}
		else {
			return dp[n] = (f(n-2) + f(n-1)) % 10007;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Arrays.fill(dp, 0);
		dp[1] = 1;
		dp[2] = 2;
		
		System.out.println(f(n));
	}
}
