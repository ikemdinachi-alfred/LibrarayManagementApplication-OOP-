package libraryApplication.exceptions;

public class BookExistException extends RuntimeException{
    public BookExistException(String message){
        super(message);
    }
}
