package DesignPattern.MVC;

public class PeopleView {

    public void showInfomation(PeopleModel people){
        System.out.println("ID: " + people.getID());
        System.out.println("Name: " + people.getName());
        System.out.println("Age: " + people.getAge());
    }
}
