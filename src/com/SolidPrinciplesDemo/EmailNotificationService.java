package com.SolidPrinciplesDemo;

public class EmailNotificationService implements MessageNotification {
    public void sendMessage(long amount) {
        System.out.println("EmailNotification: Transaction of "+amount+" has been done from your account");
    }
}
