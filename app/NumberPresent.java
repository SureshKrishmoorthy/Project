package contact.app;

public class NumberPresent extends Throwable{
    @Override
    public String getMessage() {
        return "Number Already Present";
    }
}
