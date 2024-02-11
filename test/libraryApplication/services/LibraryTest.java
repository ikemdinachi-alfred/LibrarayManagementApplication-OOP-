package libraryApplication.services;
import libraryApplication.exceptions.UserExistExceptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library library = new Library();

@Test
    void testThatWhen_an_AdminRegister_once_total_numberOfAdmin_Equals_one(){
      String id ="id";
      String firstName = "firstName";
      String lastName = "lastName";
      String username = "username";
      String phoneNumber = "phoneNumber";
      String password = "password";
      String registrationDate= "2024-01-15";
      library.registerAdmin(firstName,lastName,username,phoneNumber,password,registrationDate,id);
      assertEquals(1,library.getTotalNumberOfAdmins());

}
    @Test
    void testThatWhenAdminRegister_twice_total_numberOfAdmin_Equals_two(){
        String id ="id";
        String firstName = "firstName";
        String lastName = "lastName";
        String username = "username";
        String phoneNumber = "phoneNumber";
        String password = "password";
        String registrationDate= "2024-01-15";
        library.registerAdmin(firstName,lastName,username,phoneNumber,password,registrationDate,id);
        assertEquals(1,library.getTotalNumberOfAdmins());
        library.registerAdmin("frank","gosling","g-frank","090456887","0000","2024-01-15","001");
        assertEquals(2,library.getTotalNumberOfAdmins());

    }
    @Test
    void testThat_same_admin_can_not_register_twice(){
        String id ="id";
        String firstName = "firstName";
        String lastName = "lastName";
        String username = "username";
        String phoneNumber = "phoneNumber";
        String password = "password";
        String registrationDate= "2024-01-15";
        library.registerAdmin(firstName,lastName,username,phoneNumber,password,registrationDate,id);
        assertEquals(1,library.getTotalNumberOfAdmins());
        assertThrows(UserExistExceptions.class,()->library.registerAdmin(firstName,lastName,username,phoneNumber,password,registrationDate,id));

    }
    @Test
    void testThatWhen_an_ReaderRegister_once_total_numberOfReader_Equals_one(){
        String id ="id";
        String firstName = "firstName";
        String lastName = "lastName";
        String username = "username";
        String phoneNumber = "phoneNumber";
        String password = "password";
        String registrationDate= "2024-01-15";
        library.registerReader(firstName,lastName,username,phoneNumber,password,registrationDate,id);
        assertEquals(1,library.getTotalNumbersOfReaders());

    }
    @Test
    void testThatWhen_ReaderRegister_twice_total_numberOfReader_Equals_two(){
        String id ="id";
        String firstName = "firstName";
        String lastName = "lastName";
        String username = "username";
        String phoneNumber = "phoneNumber";
        String password = "password";
        String registrationDate= "2024-01-15";
        library.registerReader(firstName,lastName,username,phoneNumber,password,registrationDate,id);
        assertEquals(1,library.getTotalNumbersOfReaders());
        library.registerReader("frank","gosling","g-frank","090456887","0000","2024-01-15","001");
        assertEquals(2,library.getTotalNumbersOfReaders());

    }
    @Test
    void testThat_same_Reader_can_not_register_twice(){
        String id ="id";
        String firstName = "firstName";
        String lastName = "lastName";
        String username = "username";
        String phoneNumber = "phoneNumber";
        String password = "password";
        String registrationDate= "2024-01-15";
        library.registerReader(firstName,lastName,username,phoneNumber,password,registrationDate,id);
        assertEquals(1,library.getTotalNumbersOfReaders());
        assertThrows(UserExistExceptions.class,()->library.registerReader(firstName,lastName,username,phoneNumber,password,registrationDate,id));

    }
}