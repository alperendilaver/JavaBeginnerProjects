import java.util.Scanner;

/*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın
Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/
public class UcakBileti {
    public static void main(String[] args) {
        int mesafe,yas,tip;
        float bilet;
        Scanner input = new Scanner(System.in);
        System.out.println("yas girin") ;
        yas=input.nextInt();
        System.out.println("mesafe girin") ;
        mesafe=input.nextInt();
        System.out.println("tip girin 1.tek yon 2.Gidis-Donus") ;
        tip=input.nextInt();
        if(tip!=1 && tip!=2)
            System.out.println("Hatalı Seçim");
        bilet =mesafe*0.1F;
        if(yas<=11)
            bilet -= bilet*0.5F;
        else if(yas>12 && yas<24)
            bilet -= bilet*0.1F;
        else if (yas>=65)
            bilet -=bilet*0.3F;
        if(tip==2)
            bilet -= bilet*0.2F;

        System.out.println("bilet fiyatı: "+ bilet);
    }
}
