package libraryApplication.exceptions;

public class UserExistExceptions extends RuntimeException{
    public UserExistExceptions(String message){
        super(message);
    }
}
