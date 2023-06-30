package cloning;

public class Address implements Cloneable {
    private String city;
    private long pincode;
    private String street;

    public Address(String city, long pincode, String street) {
        this.city = city;
        this.pincode = pincode;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address :" + "City: " + city + " Street: " + street + " pincode: " + pincode;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


