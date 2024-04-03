

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class Bagli_Sirala {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        try {

	        	System.out.println("Dosya adını girin :");
	            String dosyaAdi = scanner.nextLine();
	            BufferedReader reader = new BufferedReader(new FileReader(dosyaAdi));

	            ArrayList<Integer> sayiListesi = new ArrayList<>();
	            ArrayList<Integer> adresListesi = new ArrayList<>();

	            String line;
	            int adres = 0;
	            while ((line = reader.readLine()) != null) {
	                int sayi = Integer.parseInt(line);
	                sayiListesi.add(sayi);
	                adresListesi.add(adres);
	                adres++;
	            }
	            reader.close();

	            System.out.println("Adres Değeri\tSayı");
	            for (int i = 0; i < sayiListesi.size(); i++) {
	                System.out.println(adresListesi.get(i) + "\t\t\t" + sayiListesi.get(i));
	            }

	            sort(sayiListesi, adresListesi);
	            System.out.println("\nSıralanmış Liste:");
	            System.out.println("Adres Değeri\tSayı");
	            for (int i = 0; i < sayiListesi.size(); i++) {
	                System.out.println(adresListesi.get(i) + "\t\t\t" + sayiListesi.get(i));
	            }

	        } catch (IOException e) {
	            System.out.println("Dosya okuma hatası: " + e.getMessage());
	        }
	    }

	    public static void sort(ArrayList<Integer> sayilar, ArrayList<Integer> adresler) {
	        int n = sayilar.size();
	        for (int i = 0; i < n - 1; i++) {
	            int minİndis = i;
	            for (int j = i + 1; j < n; j++) {
	                if (sayilar.get(j) < sayilar.get(minİndis)) {
	                    minİndis = j;
	                }
	            }
	            
	            int geciciSayi = sayilar.get(minİndis);
	            sayilar.set(minİndis, sayilar.get(i));
	            sayilar.set(i, geciciSayi);
	            
	            int geciciAdres = adresler.get(minİndis);
	            adresler.set(minİndis, adresler.get(i));
	            adresler.set(i, geciciAdres);
	        }
	    }
	}


