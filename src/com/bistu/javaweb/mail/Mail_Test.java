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
        mb.setSubject("[BISTU] 在此重置您的密码");

        mb.setContent("[BISTU] 有人要求为您以下的Javaweb实践账号重置密码。 用户名：  "+n+"，若是您本人操作，请点击以下链接设置新密码：http://bistu.aliapp.com/lost_change.jsp?name="+n+"&password="+p+"（本地测试请入：http://bistu.aliapp.com/lost_change.jsp?name="+n+"&password="+p+"）。提示：若非本人操作，请忽略该消息！     ——Mr.ZLF "+y+"."+ym+"."+new Date().getDate()+" "+new Date().getHours()+":"+new Date().getMinutes()+":"+new Date().getSeconds()+"");        // 设置邮件的正文

        
        mb.attachFile("http://zhlf7777-blog.stor.sinaapp.com/data.txt");
        
        Mail_Send sm = new Mail_Send();	 
        System.out.println("(正在发送邮件...)");
        
        if(sm.sendMail(mb))
            v = true;
        return v;
    }
}