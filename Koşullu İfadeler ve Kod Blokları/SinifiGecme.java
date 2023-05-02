import java.util.Scanner;

public class SinifiGecme {
    public static void main(String[] args) {
        int mat,fiz,turkce,kimya,muzik,toplam=0,i=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Mat notunu giriniz");
        mat=input.nextInt();
        if(mat<100 && mat>0){
            toplam+= mat;
            i++;
        }
        System.out.println("Fizik notunu giriniz");
        fiz=input.nextInt();
        if(fiz<100 && fiz>0){
            toplam+= fiz;
            i++;
        }
        System.out.println("Türkçe notunu giriniz");
        turkce=input.nextInt();
        if(turkce<100 && turkce>0){
            toplam+= turkce;
            i++;
        }
        System.out.println("Kimya notunu giriniz");
        kimya=input.nextInt();
        if(kimya<100 && kimya>0){
            toplam+= kimya;
            i++;
        }
        System.out.println("Muzik notunu giriniz");
        muzik=input.nextInt();
        if(muzik<100 && muzik>0){
            toplam+= muzik;
            i++;
        }
        if(toplam/i >55)
            System.out.println("Geçti "+toplam/i);
        else
            System.out.println("Kaldı");
    }

}
