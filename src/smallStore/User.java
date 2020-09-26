/*
 * Copyright © 2020:
 * Fortune David
 * TDGE
 */

package smallStore;

import java.util.Arrays;

public abstract class User {
    private String name;
    private String phone;
    private Address homeAddress;
    private String emailAddress;
    private String password;

    abstract void jump();

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String userName) {
        name = userName;
    }

    public void setPhone(String zeroEightZero) {
        phone = zeroEightZero;
    }

    public void setHomeAddress(String hAddress) {
        homeAddress = new Address();
        String[] splitAddress = hAddress.split("\\s");
        homeAddress.setHouseNumber(splitAddress[0]);
        homeAddress.setCityName(splitAddress[1]);
        homeAddress.setStateName(splitAddress[splitAddress.length-2]);
        homeAddress.setCountryName(splitAddress[splitAddress.length-1]);
    }

    public void setEmailAddress(String eAddress) {
        emailAddress = eAddress;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", homeAddress='").append(homeAddress).append('\'');
        sb.append(", emailAddress='").append(emailAddress).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
