import java.util.Scanner;

/*Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/
public class HypotenuseAndAreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("length of a");
        int a = input.nextInt();
        System.out.println("length of b");
        int b = input.nextInt();
        double c = Math.sqrt((a*a) + (b*b));
        double u= (a+b+c)/2;
        double area = Math.sqrt( u * (u-a) * (u-b) * (u-c));
        System.out.println(area);
    }
}
