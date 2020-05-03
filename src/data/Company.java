package data;

public class Company extends Client {

    private Address address;
    private String companyName;

    public Company(boolean isPremium, Address address, String companyName) {
        super(isPremium);
        this.address = address;
        this.companyName = companyName;
    }

    public Address getAddress() {
        return address;
    }

    public String getCompanyName() {
        return companyName;
    }

}


