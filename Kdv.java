import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double oran1 = 0.18;
        double oran2 = 0.08;
        double limit = 1000;
        Scanner a = new Scanner(System.in);
        System.out.println("Lütfen ürünün ilk fiyatını giriniz :");
        double ilkfiyat = a.nextDouble();

        double kdvtutar = (ilkfiyat<limit)?(ilkfiyat*oran1):(ilkfiyat*oran2);
        double toplamtutar = ilkfiyat+kdvtutar;
        System.out.println("Kdv Tutarı :");
        System.out.println(kdvtutar);
        System.out.println("Toplam Tutar :");;
        System.out.println(toplamtutar);

    }
}
