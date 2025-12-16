package se.lexicon;

public class Customer {
    private int customerId;
    private String name;
    private String email;

    public Customer(int customerId, String name, String email) {
        setCustomerId(customerId);
        setName(name);
        setEmail(email);
    }

    public int getCustomerId() {
        return customerId;
    }

    private void setCustomerId(int customerId) {
        if (customerId == 0) {
            IO.println("Name have not be empty.");
        }
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equalsIgnoreCase("null")) {
            IO.println("Name have not be empty.");
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.equalsIgnoreCase("null")) {
            IO.println("Email have not be empty.");
        } else if (email.contains("@")) {
            this.email = email;
        }else {
            IO.println("Invalid email!");
        }

    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
