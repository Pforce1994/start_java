import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileDemo1 {
    public static void main(String[] args) {
       wr();
  

    }
    static void wr(){
        try {
            FileWriter writer = new FileWriter("Scor.txt");
            writer.write("Hello World");
            writer.write("สบายดีมั้ยครับ");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void read(){
            //  File f=new File("Scor.txt");
            
    }
}
