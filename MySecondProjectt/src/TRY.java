import java.util.Scanner;

public class TRY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        H(num);
    }

    public static void H(int sayı) {
        for (int i = 0; i <= sayı; i++) {
            int half = i/2;
            for (int j = 0; j < i; j++) {
                if (j==0){
                    System.out.print(" * ");
                }else if (i==half) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
