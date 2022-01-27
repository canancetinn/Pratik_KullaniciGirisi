package Pratik_KullaniciGirisi;
import java.util.Scanner;
public class Pratik_KullaniciGirisi {

	public static void main(String[] args) {
		String kullaniciAdi, sifre;
		String secim, yeniSifre;
		Scanner input = new Scanner(System.in);
		System.out.print("Kullanýcý adý girin:");
		kullaniciAdi = input.nextLine();
		System.out.print("þifrenizi girin:");
		sifre = input.nextLine();
		if((kullaniciAdi.equals("patika")) && (sifre.equals("patika123"))){
			System.out.print("Giriþ Baþarýlý.");
		}else {
			System.out.print("Yanlýþ Þifre Girdiniz.");
			System.out.print("Þifrenizi Sýfýrlamak ister misiniz?");
			secim = input.nextLine();
			if(secim.equals("e")) {
				System.out.print("Yeni sifre giriniz:");
				yeniSifre = input.nextLine();
				if(yeniSifre.equals("patika123")) {
					System.out.print("Þifre Oluþturulamadý, lütfen farklý bir þifre girin:");
					yeniSifre = input.nextLine();
				}else if(yeniSifre.equals(yeniSifre)) {
					System.out.print("Þifreniz baþarýyla deðiþtirildi.");
					sifre.equals(yeniSifre);
				}
				
			}else if(secim.equals("h")){
				System.out.print("Yeni þifre oluþturma iptal edildi.");
				
			}
		}
	}

}
