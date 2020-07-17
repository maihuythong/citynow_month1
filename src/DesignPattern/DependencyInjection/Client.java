package DesignPattern.DependencyInjection;

public class Client {
    public static void main(String[] args) {
        MessageService email = new EmailMessage();
        UserController emailSend = new UserController(email);
        emailSend.sendMessage();

        MessageService sms = new SMSMessage();
        UserController smsSend = new UserController(sms);
        smsSend.sendMessage();
    }
}
