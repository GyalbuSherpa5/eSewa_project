package exception;

public class RupeshException extends Exception {

    public RupeshException(String string){

        super(string);

    }



    public static void main(String[] args){

       int j=20;
        try{

            j=0/20;


            if(j==0){

                throw new RupeshException("Its rupesh exception");
            }
        }

        catch(ArithmeticException | RupeshException e){
            System.out.println("Rupesh");

            e.printStackTrace();
        }



    }
}
