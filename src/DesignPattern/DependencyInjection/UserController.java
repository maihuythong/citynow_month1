package DesignPattern.DependencyInjection;

public class UserController {

    private MessageService messageService;

    public UserController(MessageService messageService){
        this.messageService =  messageService;
    }

    public void sendMessage(){
        messageService.sendMessage("This is a message", "Citynow");
    }
}
