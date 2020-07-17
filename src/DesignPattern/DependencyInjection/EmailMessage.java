package DesignPattern.DependencyInjection;

public class EmailMessage implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Send Email with content: " + message + " to " + receiver);
    }
}
