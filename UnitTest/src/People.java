public class People {
    private String name;
    private int age;
    private boolean isHappy;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People(String name) {
        this.name = name;
    }

    public People(String name, int age, boolean isHappy) {
        this.name = name;
        this.age = age;
        this.isHappy = isHappy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHappy(){
        return this.isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }
}
