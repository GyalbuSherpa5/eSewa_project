class AnujException extends RuntimeException{
    AnujException(){
        super("Nothing will happen");
    }
    public AnujException(String message) {
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) {
        System.out.println("hello");
        int r=99;
        try {
            if(r>18)
            throw new AnujException();
        }
        catch (AnujException e){
            e.printStackTrace();
        }
        System.out.println("jj");
    }
}
