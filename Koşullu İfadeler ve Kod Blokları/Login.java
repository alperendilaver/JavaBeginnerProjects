import java.util.Scanner;

/*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse
 yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı,
 lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/
public class Login {
    public static void main(String[] args) {
        String userName,password,npassword;
        int secim;
        Scanner input =new Scanner(System.in);
        System.out.println("Username Giriniz");
        userName=input.next();
        System.out.println("Password Giriniz");
        password=input.next();
        if(userName.equals("Patika") && password.equals("123")){
            System.out.println("Giriş Başarılı");
        }
        else{
            System.out.println("Giriş Başarısız şifrenizi yenilemek istiyor musunuz? evet ise 1 hayır ise 0 giriniz");
            if((secim=input.nextInt())==1){
               System.out.println("yeni sifre giriniz");
               npassword=input.next();
               if (npassword.equals(password))
                   System.out.println("Şifre oluşturulamadı,lütfen başka şifre giriniz.");
               else
                   password=npassword;
            }
        }

    }
}
