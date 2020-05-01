public class Address {
    private String city;
    private String streetName;
    private String buildingNumber;

    public Address(String city, String streetName, String buildingNumber) {
        this.city = city;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
    }

    public String getCity() {
        return city;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

}

