package Pertemuan4_Polymorphism_NotificationsOverloadingOverriding;

public class MobileApp {
    InterfaceNotification notif = new InterfaceNotification() {};

        notif.name = "Interface Notification";
        

        EmailNotification email = new EmailNotification();

        email.name = "Bird";
        

        Duck duck = new Duck();

        duck.name = "Duck";
        
    }
