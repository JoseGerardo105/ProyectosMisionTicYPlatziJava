package logic;

public class Client extends Person{
    private String address;
    private String phoneNumber;

    public Client(String name, String surnames, String identityDocument, String email, String address, String phoneNumber) {
        super(name, surnames, identityDocument, email);
        this.address = address;
        this.phoneNumber = phoneNumber;        
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurnames() {
        return surnames;
    }

    public String getIdentityDocument() {
        return identityDocument;
    }

    public String getEmail() {
        return email;
    }

}
