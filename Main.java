import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Main {
   public static void main(String[] args) throws IOException {
     File file = new File("oldtxt.txt");
     Scanner scan = new Scanner(file);
     Scanner input = new Scanner(System.in);

     String fileContent = "";
     While (scan.hasNextLine());  {
       fileContent = fileContent.concat(scan.nextLine() + "/n");
     }
     System.out.print("Enter a new line; ");
     String newLine = inpit.nextLine();
     fileContent = fileContent.concat(newLine + "/n");
     Filewriter writer = new FileWriter("newtxt.txt");
     writer.write(fileContent);
     writer.close();
     scan.close();
     input.close();


   }

}
