import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class TestUser {
    private List<User> users;

    @BeforeEach
    void setUp() {
        users = new ArrayList<>();
        users.add(new User("Stefan", "Tomson", 20));
        users.add(new User("Alice", "Curt", 30));
        users.add(new User("Bob", "Brown", 23));
        users.add(new User("Sara", "Adams", 35));
        users.add(new User("John", "Parker", 28));
        users.add(new User("Emily", "Davis", 16));
        users.add(new User("Sam", "Scot", 40));
        users.add(new User("Mila", "Anderson", 19));
        users.add(new User("David", "Taylor", 18));
        users.add(new User("Olivia", "Tomson", 17));
    }

    @AfterEach
    void tearDown() {
        users = null;
    }

    @Test
    void sortAge() {
        List<User> sortedByAge = Main.sortAge(new ArrayList<>(users));
        assertEquals("Emily", sortedByAge.get(0).getFirstName());
        assertEquals("Sam", sortedByAge.get(sortedByAge.size() - 1).getFirstName());
    }

    @Test
    void averageAge() {
        double average = Main.averageAge(new ArrayList<>(users));
        assertEquals(24.6, average);
    }

    @Test
    void sortNameAge() {
        List<User> sortedByNameAge = Main.sortNameAge(new ArrayList<>(users));
        assertEquals("Alice", sortedByNameAge.get(0).getFirstName());
        assertEquals("Stefan", sortedByNameAge.get(sortedByNameAge.size() - 1).getFirstName());
    }

    @Test
    void usersWithSA() {
        List<User> usersWithSA = Main.usersWithSA(new ArrayList<>(users));
        assertEquals(4, usersWithSA.size());
    }

    @Test
    @DisplayName("Negative test for usersYoungerThan18")
    void usersYoungerThan18_negative() {
        assertThrows(NullPointerException.class, () -> Main.usersYoungerThan18(null));
    }


}
