package Quiz02;

import java.util.Scanner;
import java.io.IOException;

public class J1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("密碼輸入測試");
        System.out.print("請輸入密碼:");
        int a = sc.nextInt();
        for(int i=0;i<3;i++)
        {
            try {
                System.out.print("請再輸入一次密碼:");
                int b = sc.nextInt();
                if (b==a)
                {
                    System.out.println("密碼正確");
                    break;
                } else {
                    throw new RuntimeException();
                }
            } catch (RuntimeException e) {
                System.out.println("與第一次輸入的不同");
            }
        }
        sc.close();      
    }
}
