import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Scanner;

public class Coscumparaturi extends Produse {

ArrayList<String > coscumparaturi;
public Coscumparaturi(){
    coscumparaturi=new ArrayList<>();
    }
    public static int getrandomnumber() {
        int randomnr = (int) (Math.random() * 1000000000);
        return randomnr;
    }
    public static void createcontract() {
        System.out.println("Cod contract " + getrandomnumber());
    }

    int price=0;
    public  void addproduse(){

        Produse produse=new Produse();

        Scanner sc =new Scanner(System.in);

       while(true) {
           int opti = sc.nextInt();
           if (opti == 1) {
               System.out.println("Produsul a fost adaugat cu succes ");
               price = price + produse.price1;
               coscumparaturi.add(produse.produs1);
           }
           if (opti == 2) {
               System.out.println("Produsul a fost adaugat cu succes ");
               price = price + produse.price2;
               coscumparaturi.add(produse.produs2);
           }
           if (opti == 3) {
               System.out.println("Produsul a fost adaugat cu succes ");
               price = price + produse.price3;
               coscumparaturi.add(produse.produs3);
           }
           if (opti == 6) {
               System.out.println("1.Vizualizare produse");
               System.out.println("2.Cos de cumparaturi");
               break;
           }
       }

    }
    public void vizproduse(){
    Scanner sc=new Scanner(System.in);
            System.out.println("Cos de cumparaturi:");
            System.out.println(coscumparaturi);
            System.out.println("Total " + price + " lei");
            System.out.println("Pentru a finaliza comanda apasa 3");
        }

   public void crearecontract() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Contract de cumparare");
       createcontract();
       System.out.println("Produse " + coscumparaturi);
       System.out.println("Total " + price + " lei");
       System.out.println("Plateste(6)");
       while (true){
           int plata = sc.nextInt();
       if (plata == 6) {
           System.out.println("Comanda finalizata");
           break;
       } else {
           System.out.println("Pentru a finaliza comanda apasa 6 ");
       }
   }
    }






    }

















