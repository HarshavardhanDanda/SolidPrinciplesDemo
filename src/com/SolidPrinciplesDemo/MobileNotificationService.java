package com.SolidPrinciplesDemo;

public class MobileNotificationService implements OTPNotification, MessageNotification {
    public void sendOTP() {
        System.out.println("sent otp to Mobile");
    }
    public void sendMessage(long amount) {
        System.out.println("MobileNotification: Transaction of "+amount+" has been done from your account");
    }
}
