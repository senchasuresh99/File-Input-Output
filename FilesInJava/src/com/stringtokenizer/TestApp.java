package com.stringtokenizer;

import java.util.StringTokenizer;

public class TestApp {
	public static void main(String[] args) {
		StringTokenizer stk = new StringTokenizer("sachin$ramesh$tendulkar", "$");
		System.out.println(stk);
		int tokenCount = stk.countTokens();
		System.out.println(tokenCount);
		while (stk.hasMoreTokens()) {
			String data = stk.nextToken();
			System.out.println(data);
		}
	}
}
