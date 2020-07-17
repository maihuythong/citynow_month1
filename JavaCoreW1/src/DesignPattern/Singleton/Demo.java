package DesignPattern.Singleton;

public class Demo {
    public static void main(String[] args) {
        BillPughAccount billPughAccount = BillPughAccount.getInstance();
        billPughAccount.setUsername("maihuythong");
        System.out.println(billPughAccount.getUsername());
    }
}
