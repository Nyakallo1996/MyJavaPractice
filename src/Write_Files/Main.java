package Write_Files;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        // How to write a file using Java(4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferdWriter = Better performance for large amoounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)



        try(FileWriter writer = new FileWriter("test.txt")){
             writer.write("I like pizza!");
            System.out.println("Files has been written");
        }
        catch (IOException e){
            System.out.println("could not write file");
        }
    }
}
