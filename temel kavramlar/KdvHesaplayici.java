import java.util.Scanner;

/*Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak
KDV tutarı hesaplayan programı yazınız.*/
public class KdvHesaplayici {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int tutar = input.nextInt();
        double kdvli= (0<tutar && tutar<1000)? (tutar+tutar*0.18):(tutar+tutar*0.08);
        System.out.println(kdvli);
    }
}
