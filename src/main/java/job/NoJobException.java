package job;

public class NoJobException extends RuntimeException{

    private final String message;

    public NoJobException(String str){
        this.message = str;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
