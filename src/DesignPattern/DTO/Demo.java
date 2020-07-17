package DesignPattern.DTO;

public class Demo {
    public static void main(String[] args) {
        UserService service = new UserService();

        System.out.println(service.getUser("1").getName());
        System.out.println(service.getUser("2").getName());


    }
}
