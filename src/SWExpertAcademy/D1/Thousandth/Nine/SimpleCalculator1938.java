package SWExpertAcademy.D1.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCalculator1938 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}
}
