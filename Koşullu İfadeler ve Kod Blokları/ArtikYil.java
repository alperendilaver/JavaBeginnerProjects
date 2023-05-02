import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        System.out.println("yil giriniz");
        yil = input.nextInt();
        System.out.println(yil%4==0 ?"Artik Yil":"Artik Yil Değil");
    }
}
