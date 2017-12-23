
import java.util.Scanner;

public class HesaplamaTest {

	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int say1,say2;
        System.out.println("1. Sayýyý Giriniz: ");
        say1 = input.nextInt();
        System.out.println("2. Sayýyýs Giriniz: ");
        say2 = input.nextInt();
        int sonuc=say1*say2;
        System.out.println(say1 + "*" + say2 + "=" + sonuc);
        
        
    }
}