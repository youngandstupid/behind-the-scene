package test.entities;

import org.junit.Test;
import src.main.entities.User;
import src.main.entities.UserRole;
import src.main.to.UserTO;

import static org.junit.Assert.*;

/**
 * Created by Salman on 10/20/2015.
 */
public class UserTest {

    @Test
    public void baseTestTest() {
        String expected = "this is the first test";
        String absurdData = expected;

        assertEquals(expected , absurdData);
    }

    @Test
    public void testCreateSimpleUserTO() {
        User user = new User();
        user.setEmail("adaisan@ada.com");
        user.setRole(UserRole.Admin);
        user.setLastName("baghermashang");

        UserTO to = user.buildTO();

        assertEquals(user.getEmail() , to.getEmail());
        assertEquals(user.getRole() , to.getRole());
        assertEquals(user.getLastName() , to.getLastName());
    }

}
