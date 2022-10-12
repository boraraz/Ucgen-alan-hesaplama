import java.util.Scanner;
import java.lang.Math;

public class ucgen {
    public static void main(String[] args) {
        double kenar1, kenar2, kenar3, cevre, alankare, u, alan;

        Scanner scan = new Scanner(System.in);

        System.out.println("Üçgenin kenar uzunluklarını giriniz.");
        System.out.print("1. kenar uzunluğu: ");
        kenar1 = scan.nextDouble();
        System.out.print("2. kenar uzunluğu: ");
        kenar2 = scan.nextDouble();
        System.out.print("3. kenar uzunluğu: ");
        kenar3 = scan.nextDouble();

        cevre = (kenar1 + kenar2 + kenar3);

        u = cevre / 2;

        alankare = u * (u-kenar1) * (u-kenar2) * (u-kenar3);

        //Elde ettiğimiz alanın karesinden alana ulaşmak için Javanın Math kütüphanesindeki karekök alan sqrt fonksiyonundan yararlanıldı.
        alan = Math.sqrt(alankare);

        System.out.println("Kenarları verilen üçgenin alanı: " + alan);
    }
}
