package data;

public class NaturalPerson extends Client {

    private String firstName;
    private String lastName;

    public NaturalPerson(boolean isPremium, String firstName, String lastName) {
        super(isPremium);
        this.firstName = firstName;
        this.lastName = lastName;
    }

}


