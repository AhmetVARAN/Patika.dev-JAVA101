import java.util.Scanner;

public class KDVHesap {
	public static void main(String[] args) {
		double cash, kdvOran=0.18;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("KDVsi hesaplanacak miktarı giriniz:");
		cash=input.nextDouble();
		if(cash<=1000) {
			System.out.println("KDV tutarı:"+cash*kdvOran);
			System.out.println("KDV ile toplam tutar:"+(cash+(cash*kdvOran)));
		}
		else {
			kdvOran=0.08;
			System.out.println("KDV tutarı:"+cash*kdvOran);
			System.out.println("KDV ile toplam tutar:"+(cash+(cash*kdvOran)));
		}
		
		
	}
}
