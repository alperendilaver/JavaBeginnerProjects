import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dogumYili;
        System.out.println("Doğum yılını giriniz");
        dogumYili=input.nextInt();
        if(dogumYili%12==0)
            System.out.println("Maymun");
        if(dogumYili%12==1)
            System.out.println("Horoz");
        if(dogumYili%12==2)
            System.out.println("Köpek");
        if(dogumYili%12==3)
            System.out.println("Domuz");
        if(dogumYili%12==4)
            System.out.println("Fare");
        if(dogumYili%12==5)
            System.out.println("Öküz");
        if(dogumYili%12==6)
            System.out.println("Kaplan");
        if(dogumYili%12==7)
            System.out.println("Tavşan");
        if(dogumYili%12==8)
            System.out.println("Ejderha");
        if(dogumYili%12==9)
            System.out.println("Ylan");
        if(dogumYili%12==10)
            System.out.println("At");
        if(dogumYili%12==11)
            System.out.println("Koyun");


    }
}
