package test.entities;

import org.junit.Test;
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

}
