package libraryApplication.services;

import libraryApplication.exceptions.BookExistException;
import libraryApplication.exceptions.InvalidDetailsExceptions;
import libraryApplication.exceptions.UserExistExceptions;

import java.util.ArrayList;

public class Library {
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();
    Book book;
    User user;
    private int totalNumbersOfReaders;
    private int totalNumberOfAdmins;
    private int totalNumberOfBooks;



    public User registerReader(String firstName, String lastName, String username,String phoneNumber, String password, String registrationDate,String id){
    user = new User(id,firstName,lastName,username,phoneNumber,password,registrationDate);
    userExist(phoneNumber,username);
    user.setUserType(UserType.READER);
    totalNumbersOfReaders+=1;
    users.add(user);
    return user;
    }
    public User registerAdmin(String firstName, String lastName, String username,String phoneNumber, String password, String registrationDate,String id){
        user = new User(id,firstName,lastName,username,phoneNumber,password,registrationDate);
        userExist(phoneNumber,username);
        user.setUserType(UserType.ADMIN);
        totalNumberOfAdmins+=1;
        users.add(user);
        return user;
    }
    public String loginAdmin(String username, String password){
        user = new User(username,password);
        loginValidation(username,password);
        user.setUserType(UserType.ADMIN);
        return "login successfully.. ";
    }

    public String loginReader(String username, String password){
        user = new User(username,password);
        user.setUserType(UserType.READER);
        loginValidation(username,password);
        return "login successfully..";
    }

    private void loginValidation(String username, String password){
        for(User user1: users) {
            if (!user1.getUsername().equals(username) || !user1.getPassword().equals(password)) throw new InvalidDetailsExceptions("wrong details");
        }

    }

    private void userExist(String phoneNumber, String username){
        for (User user1:users){
            if (user1.getPhoneNumber().equals(phoneNumber) || user1.getUsername().equals(username)) throw new UserExistExceptions("Your details already exist ");
        }
    }

    public String addBook(String id, String title, String author, String pages){
       book = new Book(id,title,author,pages) ;
       bookExist(title,author);
       books.add(book);
       book.setAvailable(true);
       totalNumberOfBooks+=1;
       return "book added successfully..";
    }

    private void bookExist(String title, String author){
        for (Book book1 : books)if(book1.getTitle().equals(title) && book1.getAuthor().equals(author)) throw new BookExistException("book is already in the shelf");

    }
    public ArrayList<Book> displayBooks(){
        return books;
    }

    public int getTotalNumbersOfReaders() {
        return totalNumbersOfReaders;
    }

    public int getTotalNumberOfAdmins() {
        return totalNumberOfAdmins;
    }

    public int getTotalNumberOfBooks() {
        return totalNumberOfBooks;
    }

}
