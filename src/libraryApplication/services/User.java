package libraryApplication.services;

import java.time.LocalDate;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    LocalDate registrationDate;
    UserType userType;

    public User(String id, String firstName, String lastName, String username, String password, String registrationDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.registrationDate = LocalDate.parse(registrationDate);
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
    public String getfullName(){
        return firstName + " "+ lastName;
    }

}
