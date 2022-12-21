package Quiz02;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class J2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("C:/Users/88690/OneDrive/桌面/java/Quiz02/rand.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        for(int i=0;i<=1000;i++)
        {
            bw.write((int)(Math.random()*100000)+"");
            bw.newLine();
        }
        bw.close();
    }
}
