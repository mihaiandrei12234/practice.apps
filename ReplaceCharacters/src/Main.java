import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String res = "";
        for (int x = 0; x < line.length(); x++) {
            if (line.charAt(x) == 'a') {
                res = res + "b";
            }
            else if (line.charAt(x) == 'b') {
                res = res + "a";
            }
            else{
                res=res+line.charAt(x);
            }
        }

        System.out.println(res);


    }
}
