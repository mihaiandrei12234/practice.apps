import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Coscumparaturi c=new Coscumparaturi();
        System.out.println("1.Vizualizare produse");
        System.out.println("2.Cos de cumparaturi");


        while (true) {

            int opt = sc.nextInt();
            if (opt == 1) {
                System.out.println("Adauga produsele dorite in cosul de cumparaturi ");
                System.out.println("Dupa ce ai terminat apasa 6 pentru a reveni la meniul initial");
                System.out.println("1.Laptop HP Pavilion");
                System.out.println("2.Iphone 11");
                System.out.println("3.Samsung LED");

               c.addproduse();
            }
            if(opt==2) {
                c.vizproduse();
            }


            if(opt==3){
                c.crearecontract();
            }
        }
    }
}
