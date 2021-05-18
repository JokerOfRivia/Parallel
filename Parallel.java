import java.util.*;
import java.io.*;
public class Parallel implements Runnable {
  public static void main (String [] args){
    AccountReader.readfile("/Users/nathanthomasmacbookpro2018/Documents/GitHub/Parallel/Accounts/Accounts 0.txt");
  }
  public static void readFile (String filename){
        double maxNum = 0;
        try{
            File myObj = new File(filename);
              Scanner myReader = new Scanner(myObj);
              while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                //System.out.println (data);
                //DO STUFF HERE
                String numWord = data.substring (16,data.length());
                double num = Double.parseDouble (numWord);


              }
              myReader.close();
        }catch (FileNotFoundException e) {
              System.out.println("An error occurred. Ha nerd.");
              e.printStackTrace();
          }
    }
}