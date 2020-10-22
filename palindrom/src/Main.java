import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Verifica daca un cuvant este un palindrom");

        Scanner sc = new Scanner(System.in);
        while(true) {
            String a = sc.nextLine();
            int x;
            int i;
            String res1 = "";
            for (x = 0; x < a.length(); x++) {
                res1 = res1 + a.charAt(x);
            }
            String res2 = "";
            for (i = a.length() - 1; i >= 0; i--) {
                res2 = res2 + a.charAt(i);
            }
            if(res1.equals(res2)){
                System.out.println("Este un palindrom");
                break;
            }
            System.out.println("Nu este un palindrom");
        }

    }

}