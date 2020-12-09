package cConverter;

import java.util.Scanner;

public class CConverter {
    public static void main(String args[]){
        double todayRate;
        int choice;
        double inr;
        char ansr ;
        do {
            System.out.println("different types of converters");
            System.out.println("1.YenToPound");
            System.out.println("2.YenToCad");
            System.out.println("3.PoundToDollar");
            System.out.println("4.PoundToInr");
            System.out.println("5.PoundToEur");
            System.out.println("6.PoundToYen");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your choice");
            choice = sc.nextInt();
            System.out.println("enter today rate");
            todayRate = sc.nextDouble();
            CcurrencyCov cc = new CcurrencyCov(todayRate);
            switch (choice){
               
                case 1 :
                    System.out.println("enter Yen");
                    double Yenp = sc.nextDouble();
                    System.out.println(Yenp+"Yen are converted to "+cc.YenToPound(Yenp)+ "Pound");
                    break;
                case 2 :
                    System.out.println("enter Yen");
                    double Yenc = sc.nextDouble();
                    System.out.println(Yenc+"Yen are converted to "+cc.YenToCad(Yenc)+ "Cad");
                    break;
                case 3 :
                    System.out.println("enter Pound");
                    double Poundd = sc.nextDouble();
                    System.out.println(Poundd+"Pounds are converted to "+cc.PoundToDollar(Poundd)+ "Dollar");
                    break;
                case 4 :
                    System.out.println("enter Pound");
                    double Poundi = sc.nextDouble();
                    System.out.println(Poundi+"Pounds are converted to "+cc.PoundToInr(Poundi)+ "Inr");
                    break;
                case 5 :
                    System.out.println("enter Pound");
                    double Pounde = sc.nextDouble();
                    System.out.println(Pounde+"Pounds are converted to "+cc.PoundToEuro(Pounde)+ "Euro");
                    break;
                case 6 :
                    System.out.println("enter Pound");
                    double Poundy = sc.nextDouble();
                    System.out.println(Poundy+"Pounds are converted to "+cc.PoundToYen(Poundy)+ "Yen");
                    break;
            }
            System.out.println(" Click 'y' if u wanna try another one");
            ansr = sc.next().charAt(0);

        }while (ansr =='y');


    }
}

