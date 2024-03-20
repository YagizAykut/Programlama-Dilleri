package birinciOdev;

import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Cümleyi yazınız: ");
        
        
        String cumle = scanner.nextLine().trim(); 

        String[] ozneler = {"Sen", "Ben", "Nurşah", "Hasan", "Elif", "Abdulrezzak", "Şehribanu", "Zeynelabidin", "Naki"};   
        
        
        String[] yuklemler = {"Gelmek", "Gitmek", "Okumak", "Yazmak", "Yürümek", "Görmek"};
        
        
        String[] nesneler = {"Okul", "Bahçe", "Park", "Sınıf", "Yarın", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar", "Merkez", "Ev", "Kitap", "Defter", "Güneş", "Beydağı"};

        boolean ozneKontrol = false;
        boolean nesneKontrol = false;
        boolean yuklemKontrol = false;

        
        String[] sozcukler = cumle.split("\\s+");

       
        if (sozcukler.length > 0) {
            String ozne = sozcukler[0];
            for (String kelime : ozneler) {
                if (ozne.equals(kelime)) {
                    ozneKontrol = true;
                    break;
                }
            }
        }

        
        if (sozcukler.length > 1) {
            String nesne = sozcukler[1];
            for (String kelime : nesneler) {
                if (nesne.equals(kelime)) {
                    nesneKontrol = true;
                    break;
                }
            }
        }

        
        if (sozcukler.length > 2) {
            String yuklem = sozcukler[2];
            for (String kelime : yuklemler) {
                if (yuklem.equals(kelime)) {
                    yuklemKontrol = true;
                    break;
                }
            }
        }

      
        if (sozcukler.length==3 &&ozneKontrol  && yuklemKontrol&& nesneKontrol ) {
            System.out.println("EVET");
        } else {
            System.out.println("HAYIR");
        }
    }
}
