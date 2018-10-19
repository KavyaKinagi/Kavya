import java.io.FileWriter;
import java.io.IOException;
public class FileW {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("C:\Users\gspandan\Desktop\spandana.txt"); 
            fileWriter.write(65);
            fileWriter.write(66);
            fileWriter.write(67);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();                 
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
