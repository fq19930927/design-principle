package com.fuqiang.pattern.creational.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化内容。。。");
        for (int i = 0; i < 10; i++) {
            Mail mailTmp = (Mail) mail.clone();
            mailTmp.setName("姓名：" + i);
            mailTmp.setAddress("姓名" + i + "@.qq.com" );
            mailTmp.setContent("邮件内容");
            MailUtil.sendMail(mailTmp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
