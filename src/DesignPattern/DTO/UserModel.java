package DesignPattern.DTO;

public class UserModel {

    private String ID;
    private String name;
    private Integer age;

    public UserModel(String ID, String name, Integer age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public UserModel() {

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
