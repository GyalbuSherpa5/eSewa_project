package filehandling;

import java.io.*;

public class Test {



    public static void main(String[] args){


        try {

            PrintWriter pw= new PrintWriter("C:\\Users\\dipes\\Desktop\\Esewa-project\\file3.txt");
            FileReader fr=new FileReader("C:\\Users\\dipes\\Desktop\\Esewa-project\\file.txt");

            BufferedReader br=new BufferedReader(fr);

            String line=br.readLine();



            while(line!=null){
                System.out.println(line);
                pw.println(line);
                line=br.readLine();
            }
            br=new BufferedReader(new FileReader("C:\\Users\\dipes\\Desktop\\Esewa-project\\file2.txt"));
            line=br.readLine();

            while(line!=null){
                System.out.println(line);
                pw.println(line);
                line=br.readLine();
            }
            pw.flush();
            br.close();
            pw.close();


            System.out.println("Successfully written in file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
