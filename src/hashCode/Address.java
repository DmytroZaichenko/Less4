package hashCode;

public class Address {

    private String city;
    private String street;
    private int house;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    @Override
    public int hashCode() {

        int result = 25;
        result = 37 * result + city.hashCode();
        result = 37 * result + street.hashCode();
        result = 37 * result + new Integer(house).hashCode();

        return result;
    }
}
