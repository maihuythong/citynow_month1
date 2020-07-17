package DesignPattern.DTO;

import java.util.List;

public interface Dao<T> {

    List<T> getAll();
    T get(String ID);

    void save(T ob);
}
