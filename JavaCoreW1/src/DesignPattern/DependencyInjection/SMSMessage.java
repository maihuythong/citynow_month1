package DesignPattern.DependencyInjection;

public class SMSMessage implements MessageService{
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Send SMS: " + message + " to " + receiver);
    }
}
