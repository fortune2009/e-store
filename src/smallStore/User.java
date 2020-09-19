/*
 * Copyright © 2020:
 * Fortune David
 * TDGE
 */

package smallStore;

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

    public void setHomeAddress(Address hAddress) {
        homeAddress = hAddress;
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
