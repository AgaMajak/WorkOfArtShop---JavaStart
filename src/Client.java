public class Client {
    private String firstName;
    private String lastName;
    private String companyName;
    private Address address;
    private boolean isPremium;

    public Client(String firstName, String lastName, String companyName, Address address, boolean isPremium) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.address = address;
        this.isPremium = isPremium;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Address getAddress() {
        return address;
    }

    public boolean isPremium() {
        return isPremium;
    }
}

