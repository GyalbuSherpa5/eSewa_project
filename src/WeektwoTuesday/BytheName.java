package WeektwoTuesday;

public class BytheName extends Exception {
    public BytheName (String Rte){
        super(Rte);


    }

}
 class Citizen {
         static void valid (int age) throws BytheName{
             if(age<16){
                       throw new BytheName("age is not valid ");
                     }
                     else {
                         System.out.println("welcome ");
                     }

             }

     public static void main(String[] args) {
         try{
             valid(5);
         }

         catch(BytheName by){
             System.out.println("Exception occured: " + by);
         }
     }

        }



