package com.bistu.javaweb.mail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail_isMail {
	public boolean isMail(String mm) {
		Pattern p = Pattern.compile("^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\\.([a-zA-Z0-9_-])+)+$");
		Matcher m = p.matcher(mm);
		boolean b = m.matches();
		System.out.print(b);
		return b;
		}
}