import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int day,month;
        Scanner input= new Scanner(System.in);
        System.out.println("Ay girin");
        month = input.nextInt();
        System.out.println("Gün girin");
        day = input.nextInt();
        if(month==1){
            if(day>=1 && day<=21)
                System.out.println("Oğlak");
            else
                System.out.println("Kova");
        }
        if(month==2){
            if(day>=1 && day<=19)
                System.out.println("Kova");
            else
                System.out.println("Balık");
        }
        if(month==3){
            if(day>=1 && day<=20)
                System.out.println("Balık");
            else
                System.out.println("Koç");
        }
        if(month==4){
            if(day>=1 && day<=20)
                System.out.println("Koç");
            else
                System.out.println("Boğa");
        }
        if(month==5){
            if(day>=1 && day<=21)
                System.out.println("Boğa");
            else
                System.out.println("İkizler");
        }
        if(month==6){
            if(day>=1 && day<=22)
                System.out.println("İkizler");
            else
                System.out.println("Yengeç");
        }
        if(month==7){
            if(day>=1 && day<=22)
                System.out.println("Yengeç");
            else
                System.out.println("Aslan");
        }
        if(month==8){
            if(day>=1 && day<=22)
                System.out.println("Aslan");
            else
                System.out.println("Başak");
        }
        if(month==9){
            if(day>=1 && day<=22)
                System.out.println("Başak");
            else
                System.out.println("Terazi");
        }
        if(month==10){
            if(day>=1 && day<=21)
                System.out.println("Terazi");
            else
                System.out.println("Akrep");
        }
        if(month==11){
            if(day>=1 && day<=21)
                System.out.println("Akrep");
            else
                System.out.println("Yay");
        }
        if(month==12){
            if(day>=1 && day<=21)
                System.out.println("Yay");
            else
                System.out.println("Oğlak");
        }

    }
}
