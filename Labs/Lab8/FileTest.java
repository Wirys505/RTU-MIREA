package Labs.Lab8;
import java.io.*;
public class FileTest {
    public static void main(String[] args){
        try(FileWriter writer = new FileWriter("C:\\Users\\art_l\\IdeaProjects\\RTU-MIREA2\\Labs\\Lab8\\Test.txt", false)){
            String text = "Madness";
            writer.write(text);
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
