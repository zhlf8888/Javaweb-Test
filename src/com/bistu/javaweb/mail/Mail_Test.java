package com.bistu.javaweb.mail;

import java.util.Date;

public class Mail_Test {

    @SuppressWarnings("deprecation")
	public boolean test(String m,String n,String p) {
        
    	int y = new Date().getYear() + 1900;
    	int ym = new Date().getMonth() + 1;
    	boolean v = false;
        Mail mb = new Mail();
        mb.setHost("smtp.qq.com");
        mb.setUsername("904154180");
        mb.setPassword("zhlf941229");
        mb.setFrom("904154180@qq.com");
        mb.setTo(m);
        mb.setSubject("[BISTU] �ڴ�������������");

        mb.setContent("[BISTU] ����Ҫ��Ϊ�����µ�Javawebʵ���˺��������롣 �û�����  "+n+"�����������˲��������������������������룺http://bistu.aliapp.com/lost_change.jsp?name="+n+"&password="+p+"�����ز������룺http://bistu.aliapp.com/lost_change.jsp?name="+n+"&password="+p+"������ʾ�����Ǳ��˲���������Ը���Ϣ��     ����Mr.ZLF "+y+"."+ym+"."+new Date().getDate()+" "+new Date().getHours()+":"+new Date().getMinutes()+":"+new Date().getSeconds()+"");        // �����ʼ�������

        
        mb.attachFile("http://zhlf7777-blog.stor.sinaapp.com/data.txt");
        
        Mail_Send sm = new Mail_Send();	 
        System.out.println("(���ڷ����ʼ�...)");
        
        if(sm.sendMail(mb))
            v = true;
        return v;
    }
}