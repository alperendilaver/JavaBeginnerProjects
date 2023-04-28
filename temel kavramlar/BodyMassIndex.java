import java.util.Scanner;

/*Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)*/
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weight;
        double height;
        System.out.println("enter height (ex 1,72)");
        height = input.nextDouble();
        System.out.println("enter weight");
        weight = input.nextInt();
        double bmi = weight/(height*height);
        System.out.println(bmi);
    }
}
