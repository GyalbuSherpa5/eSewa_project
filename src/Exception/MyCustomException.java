package Exception;

class CustomException extends RuntimeException {
    public CustomException(String s) {
        super(s);
    }
}

public class MyCustomException {
    static void checkAge(int age) throws CustomException{
        if(age>18) {
            throw new CustomException("This is my custom exception");
        }
        else{
            System.out.println("Helloo");
        }
    }
    public static void main(String[] args) {
        try{
            checkAge(17);
        }
        catch (CustomException e){
            System.out.println(e);
        }


    }
}
