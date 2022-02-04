package com.SolidPrinciplesDemo;

public class WhatsAppNotificationService extends MobileNotificationService {
    public void sendOTP() {
        System.out.println("sent otp to whatsapp");
    }
    public void sendMessage(long amount) {
        System.out.println("WhatsAppNotification: Transaction of "+amount+" has been done from your account");
    }
}
