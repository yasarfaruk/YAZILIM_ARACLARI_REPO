import java.util.Scanner;

public class Hesaplama {
	/**
	 * carpma islemi yapýlacak.
	 * @param say1 ve say2 seklinde iki sayi istenecek ve girilen iki sayýyý carpýp sonucu bulacak.
	 */
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int say1,say2;
        System.out.println("1. Sayýyý Giriniz: ");
        say1 = input.nextInt();
        System.out.println("2. Sayýyý Giriniz: ");
        say2 = input.nextInt();
        int sonuc=say1*say2;
        System.out.println(say1 + "*" + say2 + "=" + sonuc);
        
        
    }
}

	
	
	