package libraryApplication.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static libraryApplication.services.UserType.ADMIN;
import static libraryApplication.services.UserType.READER;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    @BeforeEach
    void testthisFirst(){
        LocalDate registrationDate = LocalDate.parse("2024-05-15");
       String date = String.valueOf(registrationDate);

        user =  new User("id","firstName","lastName","username","phoneNumber","password",date);
    }
    @Test
    void testAdminUserType() {
        user.setUserType(ADMIN);
        assertEquals(ADMIN,user.getUserType());
    }
    @Test
    void testReaderUserType() {
        user.setUserType(READER);
        assertEquals(READER,user.getUserType());
    }

    @Test
    void getId() {
        assertEquals("id",user.getId());
    }

    @Test
    void testThatIf_I_set_firstName_i_can_getFirstName() {
        assertEquals("firstName",user.getFirstName());
    }

    @Test
    void testThatIf_I_set_lastName_i_can_getLastName() {
        assertEquals("lastName",user.getLastName());
    }

    @Test
    void testThatIf_I_set_username_i_can_getUsername() {
        assertEquals("username",user.getUsername());

    }

    @Test
    void testThatIf_I_set_password_i_can_getPassword() {
        assertEquals("password",user.getPassword());

    }

    @Test
    void testThatIf_I_set_registrationDate_i_can_getRegistrationDate() {
        user.setRegistrationDate(LocalDate.parse("2024-01-14"));
        String date = String.valueOf(user.getRegistrationDate());

        assertEquals("2024-01-14",date);
    }
    @Test
    void tsetThatGetFullNameReturnsFirstAndLastName(){
        assertEquals("firstName lastName", user.getfullName());
    }
    @Test
    void testMethodGetPhoneNumber(){
        assertEquals("phoneNumber",user.getPhoneNumber());
    }

}