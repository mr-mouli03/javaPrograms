import java.io.*;
public class FileDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("E:/input.txt.txt");
            FileOutputStream fout = new FileOutputStream("E:/output.txt");
            int data;
            while((data = fin.read())!= -1) {
                fout.write(data);
            }
            fout.close();
            fin.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}