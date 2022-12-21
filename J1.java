package Quiz02;
import java.util.Scanner;

public class J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("密碼輸入測試");
        System.out.print("請輸入密碼:");
        int a = sc.nextInt();
        for(int i=0;i<3;i++)
        {      
            System.out.print("請再輸入一次密碼:");
            int b = sc.nextInt();
            if (b==a)
            {
                System.out.println("密碼正確");
                break;
            } else {
                System.out.println("與第一次輸入的不同");
                
            }
            if (i==2)
            {
                throw new RuntimeException("輸入三次錯誤！程式停止！");
            }    
        }
        try {  
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        sc.close();      
    }
}

