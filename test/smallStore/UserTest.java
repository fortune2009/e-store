/*
 * Copyright © 2020:
 * Fortune David
 * TDGE
 */

package smallStore;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @BeforeEach
    void alwaysStartWithThis() {
    }

    @AfterEach
    void shutDownAfterDoingStuff() {
    }



    @Test
    void userCanRegisterTest(){
        User newUser = new User();
        newUser.setName("bisi");
        newUser.setPhone("ZeroEightZero");
        newUser.setHomeAddress("234, Yaba Lagos");
        newUser.setEmailAddress("fortune@semicolon.africa");

        EStore store = new EStore();
        store.setStoreName("Amadi's store");

        store.registerUser(newUser);
        assertFalse(store.getRegisteredUsers().isEmpty());

        assertTrue(store
                .getRegisteredUsers()
                .contains(newUser));

        store.getRegisteredUsers().forEach(user -> {System.out.println(user.toString());});

        assertEquals(newUser.getName(), "bisi");
    }

    User david = new User() {
        @Override
        void jump() {
            System.out.println("Jumps like moonkey");
        }
    };
}