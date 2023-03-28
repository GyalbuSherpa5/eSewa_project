package ExceptionHandling;
class CustomException extends RuntimeException{
    CustomException(String str){
        super(str);
    }
}
public class MyCustom {
    static void validateVote(int age){

            if(age>18){
                throw new CustomException("Have right to vote ");
            }
        else {
                System.out.println("dont have rigth");
            }

    }
    public static void main(String[] args) {
        try{
            validateVote(20);
        }
        catch(CustomException e){
            //System.out.println(e);
            e.printStackTrace();
        }

    }
}
