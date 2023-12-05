import java.util.Random;
import java.util.Scanner;

public class IngilizceOgrenmeUygulamasi {
    private static String[] kelimeler = {"Hello", "Goodbye", "Dog", "Cat", "Sun", "Moon", "Friend", "Tree"
            , "Ocean", "Book", "Rain", "Music", "Love", "Computer", "Mountain", "City", "Star"
            , "Coffee", "Travel", "Family", "Happy", "Color", "Food", "Play", "Game", "Child", "Nature", "Time", "Work", "School"};

    private static String[] ceviriler = {"Merhaba", "Hoşça kal", "Köpek", "Kedi", "Güneş", "Ay", "Arkadaş", "Ağaç"
            , "Okyanus", "Kitap", "Yağmur", "Müzik", "Aşk", "Bilgisayar", "Dağ", "Şehir", "Yıldız"
            , "Kahve", "Seyahat", "Aile", "Mutlu", "Renk", "Yemek", "Oyna", "Oyun", "Çocuk", "Doğa", "Zaman", "İş", "Okul"};

    private static int toplamKelimeSayisi = 30;
    private static int dogruSayisi = 0;
    private static int yanlisSayisi = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("İngilizce Öğrenme Uygulamasına Hoş Geldiniz!");

        while (true) {
            int index = random.nextInt(toplamKelimeSayisi);
            String kelime = kelimeler[index];
            String ceviri = ceviriler[index];

            System.out.println("\nKelime: " + kelime);

            // Kullanıcıdan girişi alma
            System.out.print("Çevirisi nedir? ");
            String kullaniciCevabi = scanner.nextLine();

            // Girişi kontrol etme ve sonucu ekrana yazdırma
            if (kullaniciCevabi.trim().equalsIgnoreCase(ceviri)) {
                System.out.println("Doğru!");
                dogruSayisi++;
            } else {
                System.out.println("Yanlış. Doğru cevap: " + ceviri);
                yanlisSayisi++;
            }

            // Puanı ekrana yazdırma
            System.out.println("Toplam Doğru: " + dogruSayisi + " | Toplam Yanlış: " + yanlisSayisi);

            // Devam etmek isteyip istemediğini sorma
            System.out.print("Devam etmek istiyor musunuz? (E/H) ");
            String devamSecimi = scanner.nextLine();

            if (!devamSecimi.trim().equalsIgnoreCase("E")) {
                break;
            }
        }

        System.out.println("Teşekkür ederiz. İyi öğrenmeler!");
        System.out.println("Toplam Puanınız: " + (dogruSayisi * 10)); // Örneğin her doğru cevap 10 puan
        scanner.close();
    }
}
