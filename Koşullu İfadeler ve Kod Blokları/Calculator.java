import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n1,n2;
        System.out.println("birinci sayi");
        n1=input.nextInt();
        System.out.println("ikinci sayi");
        n2=input.nextInt();
        System.out.println("İşlem seçiniz 1.Toplama 2.Çıkarma 3.Çarpma 4.Bölme ");
        int secenek = input.nextInt();
        switch (secenek){
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1>n2?n1-n2:n2-n1);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2);
                break;
        }
    }
}
