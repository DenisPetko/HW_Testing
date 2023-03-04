import org.example.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    public static final String CORRECT_LOGIN = "Den";
    public static final String CORRECT_EMAIL = "some@email.ru";
//    public static final String INCORRECT_LOGIN = "_Den_";
    public static final String INCORRECT_EMAIL = "someemail.ru";

    @Test
    public void shouldReturnCreateUserWithParameters() {
        User user = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        assertEquals(CORRECT_LOGIN, user.getLogin());
        assertEquals(CORRECT_EMAIL, user.getEmail());
    }

    @Test
    public void shouldReturnCreateUserWithoutParameters() {
        User user = new User();
        assertNull(user.getLogin());
        assertNull(user.getEmail());
    }

    @Test
    public void shouldReturnExceptionWhenEmailNotCorrect() {
        assertThrows(IllegalArgumentException.class, () -> new User(CORRECT_LOGIN, INCORRECT_EMAIL));
        assertDoesNotThrow(() -> new User(CORRECT_LOGIN, CORRECT_EMAIL));
    }

    @Test
    public void shouldReturnExceptionWhenLoginEqualsEmail() {
        assertThrows(IllegalArgumentException.class, () -> new User(CORRECT_LOGIN, CORRECT_LOGIN));
        assertDoesNotThrow(() -> new User(CORRECT_LOGIN, CORRECT_EMAIL));
    }

}


