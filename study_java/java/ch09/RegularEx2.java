package ch09;

import java.util.regex.*;

public class RegularEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = { "bat", "baby", "bonus", "c", "cA", "ca", "co", "c.", "c0", "c#", "car", "combat", "count",
				"date", "disc" };

		String[] pattern = { ".*", "c[a-z]*", "c[a-z]", "c[a-zA-Z]", "c[a-zA-Z0-9]", "c.", "c.*", "c\\.", "c\\2",
				"c\\d", "c.*t", "[b|c].*", ".*a.*", ".*a.+", "[b|c].{2}" };

		for (int x = 0; x < pattern.length; x++) {
			Pattern p = Pattern.compile(pattern[x]);
			System.out.print("Pattern : " + pattern[x] + " ��� : ");
			for (int i = 0; i < data.length; i++) {
				Matcher m = p.matcher(data[i]);
				if (m.matches()) {
					System.out.print(data[i] + ",");
				}
			}
			System.out.println();
		}
	}

}
