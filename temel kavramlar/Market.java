import java.util.Scanner;

/*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL*/
public class Market {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut miktarı giriniz");
        armut =2.14 * input.nextDouble();
        System.out.println("Elma miktarı giriniz");
        elma = 3.67 * input.nextDouble();
        System.out.println("Domates miktarı giriniz");
        domates = 1.11 * input.nextDouble();
        System.out.println("Muz miktarı giriniz");
        muz =0.95 * input.nextDouble();
        System.out.println("Patlican miktarı giriniz");
        patlican = 5 * input.nextDouble();
        System.out.println(armut+elma+domates+muz+patlican);
    }
}
