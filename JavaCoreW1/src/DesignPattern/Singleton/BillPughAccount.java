package DesignPattern.Singleton;

public class BillPughAccount {
    private String username;

    private BillPughAccount() {
    }

    public static BillPughAccount getInstance() {
        return BillPughAccountHelper.INSTANCE;
    }

    private static class BillPughAccountHelper {
        private static final BillPughAccount INSTANCE = new BillPughAccount();
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }
}
