/*Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.*/

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int km;
        double tutar;
        System.out.println("Bir mesafe giriniz");
        km = input.nextInt();
        tutar = 10+(km*2.2);
        tutar = (tutar <20) ? 20:tutar;
        System.out.println(tutar);
    }
}
