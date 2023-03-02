import org.example.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void shouldReturnCreateUserWithParameters() {
        User user = new User("Den", "some@email.ru");
        assertNotNull(user.getLogin());
        assertNotNull(user.getEmail());
    }

    @Test
    public void shouldReturnCreateUserWithoutParameters() {
        User user = new User();
        assertNull(user.getLogin());
        assertNull(user.getEmail());
    }

    @Test
    public void shouldReturnCorrectEmailTrue() {
        User user = new User("Den", "some@email.ru");
        assertTrue(user.getEmail().contains("@") && user.getEmail().contains("."));
    }

    @Test
    public void shouldReturnLoginNotEqualsEmailTrue() {
        User user = new User("Den", "some@email.ru");
        assertNotEquals(user.getLogin(), user.getEmail());
    }

}


