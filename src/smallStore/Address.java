/*
 * Copyright © 2020:
 * Fortune David
 * TDGE
 */

package smallStore;

public class Address {
    private static String houseNumber;
    private static String cityName;
    private static String stateName;
    private static String countryName;


    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        Address.houseNumber = houseNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        Address.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        Address.stateName = stateName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        Address.countryName = countryName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("houseNumber='").append(houseNumber).append('\'');
        sb.append(", cityName='").append(cityName).append('\'');
        sb.append(", stateName='").append(stateName).append('\'');
        sb.append(", countryName='").append(countryName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
