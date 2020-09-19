/*
 * Copyright © 2020:
 * Fortune David
 * TDGE
 */

package smallStore;

import java.util.ArrayList;
import java.util.List;

public class EStore {
    private String eStoreName;
    private List<User> registeredUsers = new ArrayList<>();

    public String getStoreName() {
        return eStoreName;
    }

    public void setStoreName(String eStoreName) {
        this.eStoreName = eStoreName;
    }

    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }

    public void setRegisteredUsers(List<User> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }

    public void registerUser(User newUserForRegistration) {
        registeredUsers.add(newUserForRegistration);
    }
}
