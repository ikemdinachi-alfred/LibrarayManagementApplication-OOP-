package libraryApplication.exceptions;

public class IncorrectBookDetailsException extends RuntimeException{
    public IncorrectBookDetailsException(String message){
        super(message);
    }
}
