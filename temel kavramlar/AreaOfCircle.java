import java.util.Scanner;

/*Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
*/
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double pi=3.14,r,angle;
        System.out.println("enter r");
        r=input.nextDouble();
        System.out.println("enter angle");
        angle= input.nextDouble();
        System.out.println((pi*(r*r)*angle)/360);
    }


}
