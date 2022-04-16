package Codeforce.Ctps.First;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test {
	static boolean check(String str, String pattern) {
		int strIdx = 0, patternIdx = 0;
		StringBuilder sb1 = new StringBuilder(str);
		StringBuilder sb2 = new StringBuilder(pattern);
		
		while (strIdx < sb1.toString().length() && patternIdx < pattern.length()) {
			if (sb1.charAt(strIdx) != sb2.charAt(patternIdx)) {
				sb1.replace(strIdx, strIdx+1, "");
			}
			else {
				patternIdx++;
				strIdx++;
			}
		}
		if (sb1.toString().length() < sb2.toString().length()) return false;
		for (int i = pattern.length(); i < sb1.toString().length(); i++) {
			if (pattern.contains(sb1.toString().charAt(i)+"")) return false;
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			if (check(tmp.split(" ")[0], tmp.split(" ")[1])) sb.append("YES\n");
			else sb.append("NO\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}