import java.util.Scanner;

public class DaireAlan {

	final static double pi=3.14;
	public static void main(String[] args) {
		double r, merkezAci;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Dairenin yarıçapını girin:");
		r=input.nextDouble();
		
		System.out.println("Dairenin merkez açısını girin:");
		merkezAci=input.nextDouble();
		
		double alan=(pi*(r*r)*merkezAci)/360;
		System.out.println("Dairenin alanı:"+alan);
				

	}

}
