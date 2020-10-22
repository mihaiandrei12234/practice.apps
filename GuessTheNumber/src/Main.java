import java.util.Scanner;

public class Main {
    public static void main(String []args){
        System.out.println("Ghiceste numarul ");
        Scanner sc=new Scanner(System.in);
        int a=50;
        int b;
        while (true){

            b= sc.nextInt();
           if(b<60&&b>51){
               System.out.println("Esti aproape");
           }else if(b<50&&b>40) {
               System.out.println("Esti aproape");
           }
           else if(b==a){
                System.out.println("Felicitari!Ai ghicit! ");
                break;
            }
            System.out.println("Mai incearca");
        }




    }
}
