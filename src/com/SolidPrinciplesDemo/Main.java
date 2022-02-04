package com.SolidPrinciplesDemo;

import java.util.Scanner;

public class Main {

    public static void Sending(MobileNotificationService MNS){
        MNS.sendOTP();

    }
    public static void main(String[] args) {
        System.out.print("Enter Amount:");
        Scanner sc = new Scanner(System.in);
        long amount=sc.nextInt();

        BankCard bankCard = new CreditCard();
        Dmart dmart = new Dmart(bankCard);
        Sending(new WhatsAppNotificationService());
        Sending(new MobileNotificationService());

        WhatsAppNotificationService w1= new WhatsAppNotificationService();
        w1.sendMessage(amount);

        MobileNotificationService m1= new MobileNotificationService();
        m1.sendMessage(amount);

        EmailNotificationService e1= new EmailNotificationService();
        e1.sendMessage(amount);

        dmart.doPurchaseSomething(amount);
    }
}
