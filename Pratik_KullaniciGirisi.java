package Pratik_KullaniciGirisi;
import java.util.Scanner;
public class Pratik_KullaniciGirisi {

	public static void main(String[] args) {
		String kullaniciAdi, sifre;
		String secim, yeniSifre;
		Scanner input = new Scanner(System.in);
		System.out.print("Kullan�c� ad� girin:");
		kullaniciAdi = input.nextLine();
		System.out.print("�ifrenizi girin:");
		sifre = input.nextLine();
		if((kullaniciAdi.equals("patika")) && (sifre.equals("patika123"))){
			System.out.print("Giri� Ba�ar�l�.");
		}else {
			System.out.print("Yanl�� �ifre Girdiniz.");
			System.out.print("�ifrenizi S�f�rlamak ister misiniz?");
			secim = input.nextLine();
			if(secim.equals("e")) {
				System.out.print("Yeni sifre giriniz:");
				yeniSifre = input.nextLine();
				if(yeniSifre.equals("patika123")) {
					System.out.print("�ifre Olu�turulamad�, l�tfen farkl� bir �ifre girin:");
					yeniSifre = input.nextLine();
				}else if(yeniSifre.equals(yeniSifre)) {
					System.out.print("�ifreniz ba�ar�yla de�i�tirildi.");
					sifre.equals(yeniSifre);
				}
				
			}else if(secim.equals("h")){
				System.out.print("Yeni �ifre olu�turma iptal edildi.");
				
			}
		}
	}

}
