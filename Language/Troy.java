package Language;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Troy {

	public static void main(String[] args) throws IOException {
		
		Matcher matcher;
		int count = 0;
		String str = " acabcacbacbcabacbacb bcbababcbabacabcacbac acabcacbacbcabacbacb abcacbabcacbabcacbab "
				+ "abccbababcbacbacbabc abcacbabcacbabcacbab abccbababcbacbacbabc";
		
		String[] words = str.split(" ");
		
		Pattern pattern = Pattern.compile("cbcb|bcbc|abab|baba|caca|acac|bb|aa|cc");
		
		for (String s : words) {
			matcher = pattern.matcher(s);
			if (matcher.find()) count++;
		}
		
		System.out.println(words.length - 1 - count);
	}
}
