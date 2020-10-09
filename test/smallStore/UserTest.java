/*
 * Copyright © 2020:
 * Fortune David
 * TDGE
 */

package smallStore;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//import java.util.Arrays;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    @BeforeEach
    void alwaysStartWithThis() {
    }

    @AfterEach
    void shutDownAfterDoingStuff() {
    }



    @Test
    void userCanRegisterTest(){
        User newUser = new Customer();
        newUser.setName("bisi");
        newUser.setPhone("ZeroEightZero");
        newUser.setHomeAddress("234 oloju Yaba-sabo Lagos Nigeria");
        newUser.setEmailAddress("fortune@semicolon.africa");

        assertEquals("oloju", newUser.getHomeAddress().getCityName());
        logger.info("Ensuring the Address accessor method splits to other fields: " + newUser.getHomeAddress());

        EStore store = new EStore();
        store.setStoreName("Amadi's store");

        store.registerUser(newUser);
        assertFalse(store.getRegisteredUsers().isEmpty());

        assertTrue(store
                .getRegisteredUsers()
                .contains(newUser));

        store.getRegisteredUsers().forEach(user -> System.out.println(user.toString()));

        assertEquals(newUser.getName(), "bisi");

    }

    @Test
    void testAbstractClass() {
        User david = new User() {
            @Override
            void jump() {
                System.out.println("Jumps like monkey");
            }
        };
        assertNotNull(david);
    }


    @Test
    @DisplayName("User Null object")
    void testTheUserObjectIsNull() {
//        fail("This abstract class should fail Oh!");
        User obi = null;
        assertNull(obi);
    }

    @Test
    @DisplayName("User object")
    void testTheUserObjectIsNotNull() {
//        fail("This abstract class should fail Oh!");
        User obi = new Customer();
        assertNotNull(obi);
    }

    @Test
    @DisplayName("Receipt test")
    void receiptsInWordsTest(){
        System.out.println();
    }
}