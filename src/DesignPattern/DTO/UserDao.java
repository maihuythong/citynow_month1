package DesignPattern.DTO;

import java.util.ArrayList;
import java.util.List;

public class UserDao implements Dao<UserModel> {

    private List<UserModel> users = new ArrayList<>();

    public UserDao() {
        UserModel u1 = new UserModel("1", "Thong", 21);
        UserModel u2 = new UserModel("2", "Th", 20);
        users.add(u1);
        users.add(u2);
    }

    @Override
    public List<UserModel> getAll() {
        return users;
    }

    @Override
    public UserModel get(String ID) {
        for (UserModel u: users) {
            if (u.getID().equals(ID))
                return u;
        }

        return null;
    }

    @Override
    public void save(UserModel ob) {
        users.add(ob);
    }
}
