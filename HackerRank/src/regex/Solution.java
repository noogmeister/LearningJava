package regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	public static void main(String[] args) {
		
		/**
		 * this is the regex challenge for the HackerRank 30 days of java. 
		 */

		ArrayList<String> alphabetList = new ArrayList<>(); 
		

		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		reader.nextLine();
		String[] array = new String[n];

		for (int i = 0; i < n; i++) {
			array[i] = reader.nextLine();
		}
		reader.close();
		String REGEX = "[a-z]+@gmail\\.com$";
		Pattern p = Pattern.compile(REGEX);
		Matcher m;

		for (String s : array) {

			m = p.matcher(s);
			if (m.find()) {
				String[] name = s.split(" ");
				// System.out.println(name[0]);
				alphabetList.add(name[0]);
			}
		}

		Collections.sort(alphabetList);

		for (String s : alphabetList)
			System.out.println(s);

	}

}
