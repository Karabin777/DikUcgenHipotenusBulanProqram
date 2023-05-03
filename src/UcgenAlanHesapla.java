//Dik Üçgende Hipotenüs Bulan Program
//Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın
//Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
/*Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/
import java.util.Scanner;

public class UcgenAlanHesapla {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("a kenarını girin: ");
        double a = input.nextDouble();
        System.out.print("b kenarını girin: ");
        double b = input.nextDouble();
        System.out.print("c kenarını girin: ");
        double c = input.nextDouble();

        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin alanı: " + alan);
    }
}
