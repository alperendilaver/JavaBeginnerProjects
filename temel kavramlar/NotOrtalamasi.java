/*
Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...
 */

import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("fizik notunu giriniz");
        short fizik=input.nextShort();
        System.out.println("matematik notunu giriniz");
        short matematik=input.nextShort();
        System.out.println("kimya notunu giriniz");
        short kimya=input.nextShort();
        System.out.println("türkçe notunu giriniz");
        short turkce=input.nextShort();
        System.out.println("tarih notunu giriniz");
        short tarih=input.nextShort();
        System.out.println("müzik notunu giriniz");
        short muzik=input.nextShort();
        String sonuc = ((fizik+matematik+tarih+kimya+turkce+muzik)/6)>60 ? "geçti":"kaldı";
        System.out.println(sonuc);
    }
    }
