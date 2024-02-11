package libraryApplication.services;

import java.time.LocalDate;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String phoneNumber;
    LocalDate registrationDate;
    UserType userType;

    public User(String id, String firstName, String lastName, String username,String phoneNumber, String password, String registrationDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.registrationDate = LocalDate.parse(registrationDate);
    }

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public UserType getUserType() {
        return userType;
    }

    public String getfullName() {
        return firstName + " " + lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return String.format("""
                Full Name: %s
                UserName: %s
                Password: %s
                Phone Number: %s
                Identity Number: %s
                User Status: %s
                Registration Date: %s
                
                """,getfullName(),username,password,phoneNumber,id,userType,registrationDate);
    }
}
