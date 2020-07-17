import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    @org.junit.jupiter.api.Test
    void getName() {
        People people = new People("Thong");
        assertEquals("Thong", people.getName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        People people = new People("Thong", 21);
        assertEquals(21, people.getAge());
    }

    @org.junit.jupiter.api.Test
    void isHappy(){
        People people = new People("Thong", 21, true);
        assertTrue(people.isHappy());
    }
}