package com.bistu.javaweb.mail;

public class Mail_Abb {
	public static String getAbb(String mail) { 
        if ((mail != null) && (mail.length() > 0)) { 
            int at = mail.lastIndexOf('@'); 
            if ((at >-1) && (at < (mail.length() - 1))) { 
                return mail.substring(at + 1); 
            } 
        } 
        return mail; 
    }
}
