package DesignPattern.MVC;

public class PeopleController {
    private PeopleModel peopleModel;
    private PeopleView peopleView;

    public PeopleController(PeopleModel peopleModel) {
        this.peopleModel = peopleModel;
        peopleView = new PeopleView();
    }

    public void changeName(String newName){
        peopleModel.setName(newName);
    }

    public void increaseAge(){
        peopleModel.setAge(peopleModel.getAge() + 1);
    }

    public void showPeople(){
        peopleView.showInfomation(peopleModel);
    }
}
