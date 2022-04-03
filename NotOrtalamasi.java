import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mat, fizik, kim, turkce, tarih, muzik;

		System.out.println("Matematik notunuz:");
		mat = input.nextInt();

		System.out.println("Fizik notunuz:");
		fizik = input.nextInt();

		System.out.println("Kimya notunuz:");
		kim = input.nextInt();

		System.out.println("Türkçe notunuz:");
		turkce = input.nextInt();

		System.out.println("Tarih notunuz:");
		tarih = input.nextInt();

		System.out.println("Müzik notunuz:");
		muzik = input.nextInt();

		float toplam = (mat + fizik + kim + turkce + tarih + muzik);
		float ortalama = toplam / 6;

		System.out.println("Ortalamanız:" + ortalama);
		
		while(ortalama>=60) {
			System.out.println("Sınıfı Geçti");
			break;
		}
		while(ortalama<60) {
			System.out.println("Sınıfta Kaldı");
			break;
		}

	}
}
