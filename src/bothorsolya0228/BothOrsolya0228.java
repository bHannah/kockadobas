package bothorsolya0228;

import java.util.Random;
import java.util.Scanner;

public class BothOrsolya0228 {

    static Random randomszam = new Random();
    
    public static void main(String[] args) {
        /*1. feladat*/
        /*System.out.println("Hányszor szeretnél dobni?: ");
        Scanner x = new Scanner(System.in);
        int mennyiseg = x.nextInt();
        while (mennyiseg < 0){
           mennyiseg = x.nextInt();
        }
        int hat = 0;
        int ot = 0;
        int negy = 0;
        int harom = 0;
        int ketto = 0;
        int egy = 0;
        for (int i =1; i <= mennyiseg; i++){
            int dobas = randomszam.nextInt(1,7);
            if (dobas == 1){
                egy += 1;
            }
            else if (dobas == 2){
                ketto += 1;
            }
            else if (dobas == 3){
                harom += 1;
            }
            else if (dobas == 4){
                negy += 1;
            }
            else if (dobas == 5){
                ot += 1;
            }
            else {
                hat += 1;
            }
        }
        System.out.printf("6 volt %d db\n5 volt %d db\n4 volt %d db\n3 volt %d db\n2 volt %d db\n1 volt %d db\n", hat, ot, negy, harom, ketto, egy);
        */
        /*2. feladat*/
        System.out.println("Hányszor szeretnél dobni?: ");
        Scanner y = new Scanner(System.in);
        int hanyszor = y.nextInt();
        while (hanyszor < 0){
           hanyszor = y.nextInt();
        }
        int[] sorozat = {0,0,0, 0,0,0, 0,0,0, 0,0,0 ,0};
        for (int i = 0; i < hanyszor; i++) {
            int kocka = randomszam.nextInt(2,13);
            sorozat[kocka] += 1;
        }
        String szoveg = "*";
        int szam = sorozat.length;
        for (int j = 0; j < szam; j++){
            if (sorozat[j]>0){
                System.out.printf("%d ",j);
                for (int i = 0; i < sorozat[j]; i++) {
                    System.out.printf("*");
                }
                System.out.printf(" (%d db)\n", sorozat[j]);
            }
        }

            /*for (int j = 0; j < sorozat.length; j++) {
                if (sorozat[i] > 0){
                    System.out.print(sorozat[i]+" ");
                }
            }*/
        }
    }
    
}
