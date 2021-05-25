package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GameOverdos2741 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Character, Character> map = new HashMap<>();
		String tmp = br.readLine();
		
		for (int i = 0; i < tmp.length(); i++) {
			if (!map.containsKey(tmp.charAt(i))) {
				map.put(tmp.charAt(i), (char)(97+i));
			}
		}
		
		tmp = br.readLine();
		for (int i = 0; i < tmp.length(); i++) {
			if (map.containsKey(tmp.charAt(i))) {
				System.out.print(map.get(tmp.charAt(i)));
			}
		}
	}
}
