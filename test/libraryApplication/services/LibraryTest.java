package libraryApplication.services;
import libraryApplication.exceptions.InvalidDetailsExceptions;
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
 @Test
    void test_That_registered_admin_user_can_login(){
     String id ="id";
     String firstName = "firstName";
     String lastName = "lastName";
     String username = "username";
     String phoneNumber = "phoneNumber";
     String password = "password";
     String registrationDate= "2024-01-15";
     library.registerAdmin(firstName,lastName,username,phoneNumber,password,registrationDate,id);
     assertEquals(1,library.getTotalNumberOfAdmins());
     String login = library.loginAdmin(username,password);
     assertEquals("login successfully.. ",login);
 }

    @Test
    void test_That_registered_admin_user_cannot_login_with_incorrect_details(){
        String id ="id";
        String firstName = "firstName";
        String lastName = "lastName";
        String username = "username";
        String phoneNumber = "phoneNumber";
        String password = "password";
        String registrationDate= "2024-01-15";
        library.registerAdmin(firstName,lastName,username,phoneNumber,password,registrationDate,id);
        assertEquals(1,library.getTotalNumberOfAdmins());
        String login = library.loginAdmin(username,password);
        assertEquals("login successfully.. ",login);
        assertThrows(InvalidDetailsExceptions.class,()-> library.loginAdmin(username,"ik"));

    }
    @Test
    void test_That_registered_Reader_user_can_login_with_correct_details(){
        String id ="id";
        String firstName = "firstName";
        String lastName = "lastName";
        String username = "username";
        String phoneNumber = "phoneNumber";
        String password = "password";
        String registrationDate= "2024-01-15";
        library.registerReader(firstName,lastName,username,phoneNumber,password,registrationDate,id);
        assertEquals(1,library.getTotalNumbersOfReaders());
        String login = library.loginReader(username,password);
        assertEquals("login successfully..",login);
    }
    @Test
    void test_That_registered_Reader_cannot_login_with_incorrect_details(){
        String id ="id";
        String firstName = "firstName";
        String lastName = "lastName";
        String username = "username";
        String phoneNumber = "phoneNumber";
        String password = "password";
        String registrationDate= "2024-01-15";
        library.registerReader(firstName,lastName,username,phoneNumber,password,registrationDate,id);
        assertEquals(1,library.getTotalNumbersOfReaders());
        String login = library.loginReader(username,password);
        assertEquals("login successfully..",login);
        assertThrows(InvalidDetailsExceptions.class,()-> library.loginReader(username,"ik"));

    }
    @Test
    void testThatAdminAdd_one_Books_total_number_of_book_equals_one(){
    String title = "title";
    String author = "author";
    String id = "id";
    String pages = "500";
    String book = library.addBook(id,title,author,pages);
    assertEquals(1,library.getTotalNumberOfBooks());
    assertEquals("book added successfully..",book);

    }
    @Test
    void testThat_when_Admin_Add_two_Books_total_number_of_book_equals_two(){
        String title = "title";
        String author = "author";
        String id = "id";
        String pages = "500";
        String book = library.addBook(id,title,author,pages);
        assertEquals(1,library.getTotalNumberOfBooks());
        assertEquals("book added successfully..",book);
        String book1 = library.addBook(id,"you and me",author,pages);
        assertEquals(2, library.getTotalNumberOfBooks());
        assertEquals("book added successfully..",book1);

    }
    @Test
    void testThat_added_books_can_be_displayed(){
        String title = "title";
        String author = "author";
        String id = "id";
        String pages = "500";
        String book = library.addBook(id,title,author,pages);
        assertEquals(1,library.getTotalNumberOfBooks());
        assertEquals("book added successfully..",book);
        String book1 = library.addBook(id,"you and me",author,pages);
        assertEquals(2, library.getTotalNumberOfBooks());
        assertEquals("book added successfully..",book1);
        System.out.println(library.displayBooks());
    }


}