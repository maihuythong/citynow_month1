package DesignPattern.MVC;

public class Demo {

    public static void main(String[] args) {

        PeopleModel people = new PeopleModel("123", "Mai Huy Thong", 21);
        PeopleController controller = new PeopleController(people);

        controller.showPeople();

        controller.changeName("Huy Thong");
        controller.increaseAge();

        controller.showPeople();

    }
}
